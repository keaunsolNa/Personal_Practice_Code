package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Book_Registration {

	public void book_registrartion() {
		
		Scanner sc = new Scanner(System.in);

		List<BookDTO> booklist = new ArrayList<BookDTO>();
		booklist.add(new BookDTO(10000,"도서제목","작가","출판사",8000));
		booklist.add(new BookDTO(10001,"고전소설","고전작가","고전출판사",12000));
		booklist.add(new BookDTO(10002,"현대소설","현대작가","현대출판사",7000));
		booklist.add(new BookDTO(10003,"장르제목","장르작가","장르출판사",6000));
		booklist.add(new BookDTO(10004,"비문학","비문학작가","비문학출판사",20000));
		booklist.add(new BookDTO(10005,"에세이","에세이작가","에세이출판사",5000));
		
		Iterator<BookDTO> iterlist = booklist.iterator();
		while(iterlist.hasNext()) {
			System.out.println(iterlist.next());
		}
		
		
	
	}
}
