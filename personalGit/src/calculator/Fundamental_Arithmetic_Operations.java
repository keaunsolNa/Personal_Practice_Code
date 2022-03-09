package calculator;

import java.util.Scanner;

public class Fundamental_Arithmetic_Operations {

	public void fundamental_arithmetic_operations() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("사칙연산 계산기 입니다.");
		System.out.println("계산할 정수 값을 하나 입력하세요");
		double number = sc.nextDouble();
		System.out.println("사칙 연산 중 하나(+,-,*,/) 를 입력하세요");
		sc.nextLine();
		String operator = sc.nextLine();
		System.out.println("계산할 정수 값을 하나 입력하세요");
		double number2 = sc.nextDouble();
		
		switch(operator) {
			case "+" :  System.out.println("두 정수의 합은 " + (number+number2) + "입니다."); break; 
			case "-" :  System.out.println("두 정수의 차는 " + (number-number2) + "입니다."); break;
			case "*" :  System.out.println("두 정수의 곱은 " + (number*number2) + "입니다."); break;
			case "/" :  System.out.println("두 정수의 나눗셈은 " + (number%number2) + "입니다.");  break;
			default : System.out.println("+,-,*,/ 중에 하나를 고르세요");
		}
		System.out.println();
	}
}
