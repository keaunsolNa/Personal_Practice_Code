package calculator;

import java.util.Scanner;

public class Greatest_Common_Divisor {

	public void greatest_common_divisor() {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수 계산기입니다.");
		System.out.println("정수를 하나 입력하세요");
		int iNum = sc.nextInt();
		System.out.println("다른 정수를 하나 입력하세요");
		int iNum2 = sc.nextInt();

		while(iNum!=iNum2) {
			if(iNum>iNum2)
				iNum = iNum-iNum2;
			else iNum2 = iNum2-iNum;
		} 
			System.out.println("두 수의 최대 공약수는 " + iNum2 + "입니다.");
			System.out.println();

	}
}
