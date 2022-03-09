package calculator;

import java.util.Scanner;

public class Prime_Number {

	public static void prime_number() {

		System.out.println();
		System.out.println("소수 계산기입니다!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2보다 큰 정수를 하나 입력하세요.");
		int j = 1;
		while (j<2) {
			int input = sc.nextInt();
			if(input<3) {
				System.out.println("잘못 입력했습니다. 다시 입력하세요");
				continue;
			} for (int i=2; i<input; i++) {
				if(input%i==0) {
					System.out.println(input + "은(는) 소수가 아닙니다.");
					j++;
					break;
				} if(i==input-1) {
					System.out.println(input + "은(는) 소수입니다");
					j++;
					break;
				} continue;
			} 
		} 
		System.out.println();
	}
}
