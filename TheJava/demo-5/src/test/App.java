package test;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 타입을 통해 생성
		Class<Book> bookClass = Book.class;

		// 인스턴스를 통해 생성
		Book book = new Book();
		Class<? extends Book> aClass = book.getClass();
		
		// Class.forName을 통해 클래스 이름으로 생성
		Class<?> aClass1 =  Class.forName("test.Book");
		
		System.out.println(bookClass);
		System.out.println(aClass);
		System.out.println(aClass1);
		
		// public만 가져온다.
		Arrays.stream(bookClass.getFields()).forEach(System.out::println);
		
		// 접근제한자에 관계 없이 다 가져온다.
		Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
			try {
				
				// 접근 제한자 차단 방지 
				f.setAccessible(true);
				
				// 모든 필드와 필드의 값을 가져온다.
				System.out.printf("%s %s\n", f, f.get(book));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		});
		
		// filed가 아닌 Method
		Arrays.stream(bookClass.getMethods()).forEach(System.out::println);
		
		// 접근제한자 없이 모든 Method
		Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);
		
		// 부모 클래스 가져오기
		System.out.println(MyBook.class.getSuperclass());
		
		// 상위 인터페이스 가져오기
		Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
		
		// 필드의 스태틱, private 여부 탐색
		Arrays.stream(Book.class.getFields()).forEach(f -> {
			int modifiers = f.getModifiers();
			System.out.println(f);
			System.out.println(Modifier.isPrivate(modifiers));
			System.out.println(Modifier.isStatic(modifiers));

			System.out.println(f.getAnnotations());
		});
		
	}

}
