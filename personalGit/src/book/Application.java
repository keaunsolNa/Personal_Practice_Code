package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		BookDTO bookdto = new BookDTO();
		List<BookDTO> booklist = new ArrayList<BookDTO>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서 관리 시스템에 접속하셨습니다");

		do {
			System.out.println("다음의 메뉴 중 하나를 정수로 고르세요");
			System.out.println("1. 도서 검색");
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 목록 조회");
			System.out.println("4. 프로그램 종료");
			int user = sc.nextInt();
			switch(user) {
				case 1: 
					System.out.println("다음의 방법 중 하나를 정수로 고르세요");
					System.out.println("1. 도서 번호로 검색");
					System.out.println("2. 도서 제목으로 검색");
					System.out.println("3. 도서 출판사로 검색");
					int search = sc.nextInt();
				switch(search) {
					case 1 : 
					System.out.println("찾으시는 도서의 번호을 입력하세요");
					Integer searchnumber = sc.nextInt();
						boolean flag = false;
					 	for(int i =0; i<booklist.size();i++) {
					 		if(searchnumber.equals((booklist.get(i)).getNumber())) {
					 			flag = true;
					 		}
					 	} 
					 	if(flag) {
					 		System.out.println("찾으시는 도서의 번호가 목록 안에 있습니다.");
					 		System.out.println();
					 	} else {
					 		System.out.println("찾으시는 도서의 번호가 목록 안에 없습니다.");
					 		System.out.println();
					 	} break;
					case 2 : sc.nextLine();
					System.out.println("찾으시는 도서의 제목을 입력하세요");
					String searchname = sc.nextLine();
						boolean flag2 = false;
					 	for(int i =0; i<booklist.size();i++) {
					 		if(searchname.equals((booklist.get(i)).getName())) {
					 			flag2 = true;
					 		}
					 	} 
					 	if(flag2) {
					 		System.out.println("찾으시는 도서의 제목이 목록 안에 있습니다.");
					 		System.out.println();
					 	} else {
					 		System.out.println("찾으시는 도서의 제목이 목록 안에 없습니다.");
					 		System.out.println();
					 	} break;
					case 3 :sc.nextLine();
					System.out.println("찾으시는 도서의 출판사를 입력하세요");
					String searchpublisher = sc.nextLine();
					boolean flag3 = false;
					for(int i =0; i<booklist.size();i++) {
						if(searchpublisher.equals(booklist.get(i).getPublisher())) {
							flag3 = true;
						}
					}
					if(flag3) {
						System.out.println("찾으시는 도서의 출판사가 목록 안에 있습니다.");
						System.out.println();
					} else {
						System.out.println("찾으시는 도서의 출판사가 목록 안에 없습니다.");
						System.out.println();
					} break;
						default : System.out.println("목록 중에 하나를 고르세요"); break;
				}
					break;
				case 2: 
					System.out.println("도서 번호 입력");
					bookdto.setNumber(sc.nextInt());
					System.out.println("도서 제목 입력");
					sc.nextLine();
					bookdto.setName(sc.nextLine());
					System.out.println("도서 작가 입력");
					bookdto.setAuthor(sc.nextLine());
					System.out.println("도서 출판사 입력");
					bookdto.setPublisher(sc.nextLine());
					System.out.println("도서 가격 입력");
					bookdto.setPrice(sc.nextInt());
					booklist.add(new BookDTO(bookdto.getNumber(),bookdto.getName(),bookdto.getAuthor(),bookdto.getPublisher(),bookdto.getPrice())); 
					break;
				case 3: 
					booklist.add(new BookDTO(10000,"도서제목","작가","출판사",8000));
					booklist.add(new BookDTO(10001,"고전소설","고전작가","고전출판사",12000));
					booklist.add(new BookDTO(10002,"현대소설","현대작가","현대출판사",7000));
					booklist.add(new BookDTO(10003,"장르제목","장르작가","장르출판사",6000));
					booklist.add(new BookDTO(10004,"비문학","비문학작가","비문학출판사",20000));
					booklist.add(new BookDTO(10005,"에세이","에세이작가","에세이출판사",5000));
					Iterator<BookDTO> iter = booklist.iterator();
					while(iter.hasNext()) {
						System.out.println(iter.next());
					}
					break;
				case 4: System.out.println("감사합니다. 안녕히 가세요"); return;
					default : System.out.println("잘못 누르신 것 같습니다."); break; 
			}
		} while(true);
		
	}

}
