package com.project.model.service;

import java.sql.Connection;
import java.util.List;

import com.project.model.dao.FruitDAO;
import com.project.model.dto.Product_ALL_DTO;
import com.project.model.dto.Product_FRUIT_DTO;
import static com.project.common.PRODUCTTemplacte.getConnection;
import static com.project.common.PRODUCTTemplacte.close;

public class FruitService {
	
	private FruitDAO fruitDAO = new FruitDAO();
	
	/* 과일 전체 재고 조회(생산지,이름,재고)용 메소드 */
	public List<Product_FRUIT_DTO> selectAllStock(){
		
		Connection con = getConnection();
		
		List<Product_FRUIT_DTO> selectAllStock = fruitDAO.selectAllStock(con);
		
		close(con);
		
		return selectAllStock;
		
	}
	
	/* 과일 선택 재고 조회(생산자, 이름, 재고)용 메소드 */
	public List<Product_FRUIT_DTO> selectStock(int fruitCode){
		
		Connection con = getConnection();
		
		List<Product_FRUIT_DTO> selectStock = fruitDAO.selectStock(con, fruitCode);
		
		close(con);
		
		return selectStock;
		
	}
	

	/* 과일 유통기한 조회(생산지, 이름, 입출고기록, 유통기한)용 메소드 */
	public List<Product_ALL_DTO> selectTime(){
		
		Connection con = getConnection();
		
		List<Product_ALL_DTO> selectTime = fruitDAO.selectTime(con);
		
		close(con);
		
		return selectTime;
		
	}
	
	/* 과일 상세정보 조회용 메소드 */
	
	public List<Product_FRUIT_DTO> selectAllFruit(){

		Connection con = getConnection();
		
		List<Product_FRUIT_DTO> selectAllFruit = fruitDAO.selectAllFruit(con);
		
		close(con);
		
		return selectAllFruit;
	}

}
