package calculator;

import java.util.Scanner;

public class Least_Common_Multiple {

	public static void least_common_multiple() {
	
		Scanner sc = new Scanner(System.in);
		int gcd = 0;
		System.out.println();
		System.out.println("최소 공배수 계산기입니다.");
		System.out.println("값을 구할 정수 하나를 입력하세요");
		int iNum = sc.nextInt();
		System.out.println("값을 구할 정수 다른 하나를 입력하세요");
		int iNum2 = sc.nextInt();
		
		int result = iNum*iNum2;
		
		while(iNum!=iNum2) {
			if(iNum>iNum2)
				iNum = iNum-iNum2;
			else iNum2 = iNum2-iNum;
		}
		
		int result2 = iNum2;
		System.out.println("두 수의 최소 공배수는 " + result/result2 + "입니다.");
		System.out.println();
	}
}
