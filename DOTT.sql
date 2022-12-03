create or replace PROCEDURE P_DOTT 
  IS 
  CRX1              NUMBER;
  CRX2              NUMBER;
  OLD_CRX1          NUMBER;
  OLD_CRX2          NUMBER;
  CBX1              NUMBER;
  CBX2              NUMBER;
  OLD_CBX1          NUMBER;
  OLD_CBX2          NUMBER;
  CYX1              NUMBER;
  CYX2              NUMBER;
  OLD_CYX1          NUMBER;
  OLD_CYX2          NUMBER;  
  
  PID               DOT.PID%Type;
  X1                DOT.X1%Type;
  X2                DOT.X2%Type;
  
  R_DIST            NUMBER;
  B_DIST            NUMBER;
  Y_DIST            NUMBER;
  
  STEP              NUMBER;
  STUID             T_GROUP.STUDENT_ID%Type;
  GID               T_GROUP.GID%Type;
  
  CURSOR PIDS IS
  SELECT PID, X1, X2
    FROM DOT;
  
BEGIN
-- 초기값 SETTING
  STEP := 0;
  STUID := 'KS';

  CRX1 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  CRX2 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  CBX1 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  CBX2 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  CYX1 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  CYX2 := ROUND(DBMS_RANDOM.VALUE(-200, 200));
  
  DELETE FROM T_GROUP;
  DELETE FROM RBY;
  
  LOOP
  -- 외부 LOOP, 점 3개의 평균 값 구하여 거리 구하기 
  
    INSERT 
      INTO RBY(STUDENT_ID, STEP, RX1, RX2, BX1, BX2, YX1, YX2)
      VALUES(STUID, STEP, CRX1, CRX2, CBX1, CBX2, CYX1, CYX2);
      
    OPEN PIDS;
    
    LOOP
    -- 내부 LOOP, 점 사이의 거리로 GID 지정하기 
    
      FETCH PIDS INTO PID, X1, X2;
        EXIT WHEN PIDS %NOTFOUND ;
    
      -- a제곱 - b 제곱으로 점들 사이의 거리 구하기 
      R_DIST := SQRT(POWER((X1 - CRX1), 2) + POWER((X2 - CRX1), 2)); 
      B_DIST := SQRT(POWER((X1 - CBX1), 2) + POWER((X2 - CBX1), 2)); 
      Y_DIST := SQRT(POWER((X1 - CYX1), 2) + POWER((X2 - CYX1), 2)); 
    
      -- 최소 거리로 GID 대입
      IF R_DIST <= B_DIST AND R_DIST <= Y_DIST 
        THEN 
          GID := 'R';
      ELSIF B_DIST <= R_DIST AND B_DIST <= Y_DIST
        THEN
          GID := 'B';
      ELSIF Y_DIST <= R_DIST AND Y_DIST <= B_DIST
        THEN 
          GID := 'Y';
      END IF;
      
      INSERT 
        INTO T_GROUP ( STUDENT_ID, STEP, PID, GID )
        VALUES( STUID, STEP, PID, GID );
        
    END LOOP; 
    
    CLOSE PIDS;
    
    OLD_CRX1 := CRX1; OLD_CRX2 := CRX2; 
    OLD_CBX1 := CBX1; OLD_CBX2 := CBX2;  
    OLD_CYX1 := CYX1; OLD_CYX2 := CYX2; 
    
    -- DECODE와 GROUP FUNCTION으로 각 분포도의 점 평균 구하기 (Point 지정)
    SELECT SUM(DECODE(GID, 'R', X1, 0)), SUM(DECODE(GID, 'R', X2, 0)),
           SUM(DECODE(GID, 'B', X1, 0)), SUM(DECODE(GID, 'B', X2, 0)),
           SUM(DECODE(GID, 'Y', X1, 0)), SUM(DECODE(GID, 'Y', X2, 0))
      INTO CRX1, CRX2, CBX1, CBX2, CYX1, CYX2
      FROM (SELECT GID, AVG(X1), AVG(X2)
              FROM DOT, T_GROUP
             WHERE DOT.PID = T_GROUP.PID
               AND T_GROUP.STEP = STEP
             GROUP BY GID);  

    STEP := STEP + 1;

    -- 결과 값이 동일할 때 LOOP 종료
    IF OLD_CRX1 = CRX1 AND OLD_CRX2 = CRX2 AND OLD_CBX1 = CBX1 AND OLD_CBX2 = CBX2 AND OLD_CYX1 = CYX1 AND OLD_CYX2 = CYX2
      THEN EXIT;
      
    END IF;
  
  END LOOP;
  
  COMMIT;
  
END P_DOTT;