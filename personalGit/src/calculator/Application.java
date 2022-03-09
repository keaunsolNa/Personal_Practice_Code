package calculator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Leap_year ly= new Leap_year(); 
		Greatest_Common_Divisor gcd = new Greatest_Common_Divisor();
		Fundamental_Arithmetic_Operations fao = new Fundamental_Arithmetic_Operations();
		
		int choise = 0;
		do {
			System.out.println("원하는 계산기를 정수로 선택하세요.");
			System.out.println("1. 사칙연산 계산기");
			System.out.println("2. 윤년 계산기");
			System.out.println("3. 소수 계산기");
			System.out.println("4. 최대공약수 계산기");
			System.out.println("5. 최소공배수 계산기");
			
			System.out.println("9. 계산기 종료");
			choise = sc.nextInt();
			switch(choise){
				case 1: fao.fundamental_arithmetic_operations(); break;
				case 2: ly.leap_year(); break;
				case 3: Prime_Number.prime_number(); break;
				case 4: gcd.greatest_common_divisor(); break;
				case 5: Least_Common_Multiple.least_common_multiple(); break;
				case 9 : System.out.println("프로그램 종료"); return;
					default : System.out.println("지원되지 않는 입력입니다."); break;
			}
		} while(true);
	}
}
