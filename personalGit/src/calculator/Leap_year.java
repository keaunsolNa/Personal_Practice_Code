package calculator;

import java.util.Scanner;

public class Leap_year {
	public void leap_year() {
		System.out.println();
		
		int i = 0;
		System.out.println("원하시는 연도를 정수로 입력하세요.");
		Scanner sc  = new Scanner(System.in);
		i = sc.nextInt();
		
		if(i%400 ==0) {
			System.out.println(i + "년은 윤년입니다.");
		} else if(i%4 == 0 && i%100 !=0) {
			System.out.println(i + "년은 윤년입니다.");;
		} else System.out.println(i + "년은 평년입니다.");
		System.out.println();
	}
}
