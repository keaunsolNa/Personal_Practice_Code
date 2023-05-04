package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
//		// 타입을 통해 생성
//		Class<Book> bookClass = Book.class;
//
//		// 인스턴스를 통해 생성
//		Book book = new Book();
//		Class<? extends Book> aClass = book.getClass();
//		
//		// Class.forName을 통해 클래스 이름으로 생성
//		Class<?> aClass1 =  Class.forName("test.Book");
//		
//		System.out.println(bookClass);
//		System.out.println(aClass);
//		System.out.println(aClass1);
//		
//		// public만 가져온다.
//		Arrays.stream(bookClass.getFields()).forEach(System.out::println);
//		
//		// 접근제한자에 관계 없이 다 가져온다.
//		Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
//
//		Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
//			try {
//				
//				// 접근 제한자 차단 방지 
//				f.setAccessible(true);
//				
//				// 모든 필드와 필드의 값을 가져온다.
//				System.out.printf("%s %s\n", f, f.get(book));
//			} catch (IllegalArgumentException | IllegalAccessException e) {
//				e.printStackTrace();
//			}
//		});
//		
//		// filed가 아닌 Method
//		Arrays.stream(bookClass.getMethods()).forEach(System.out::println);
//		
//		// 접근제한자 없이 모든 Method
//		Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);
//		
//		// 부모 클래스 가져오기
//		System.out.println(MyBook.class.getSuperclass());
//		
//		// 상위 인터페이스 가져오기
//		Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
//		
//		// 필드의 스태틱, private 여부 탐색
//		Arrays.stream(Book.class.getFields()).forEach(f -> {
//			int modifiers = f.getModifiers();
//			System.out.println(f);
//			System.out.println(Modifier.isPrivate(modifiers));
//			System.out.println(Modifier.isStatic(modifiers));
//
//			System.out.println(f.getAnnotations());
//		});
		
//		Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);
//		
//		Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);
//		
//		Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
//			Arrays.stream(f.getAnnotations()).forEach(a -> {
//				if ( a instanceof MyAnnotation) {
//					MyAnnotation myAnnotation = (MyAnnotation) a;
//					System.out.println(myAnnotation.value());
//					System.err.println(myAnnotation.number());
//				}
//			});
//		});
		
		// 클래스 객체 생성
		Class<?> bookClass = Class.forName("test.Book");
//		Constructor<?> constructor = bookClass.getConstructor(null);
		// newInstance는 deprecated 되었기에 생성자를 통해 인스턴스를 만든다.
		Constructor<?> constructor = bookClass.getConstructor(String.class);
		Book book = (Book) constructor.newInstance("myBook");
		
		System.out.println(book);

		// Field도 동일한 방식으로 한다.
		Field a = Book.class.getDeclaredField("A");
		System.out.println(a.get(null));
		
		// Field의 값을 변경할 수도 있다.
		a.set(null, "AAAAAAA");
		System.out.println(a.get(null));
		
		Field b = Book.class.getDeclaredField("B");
		// Private는 Accessible true 변경 필요
		b.setAccessible(true);
		System.out.println(b.get(book));
		
		b.set(book, "BBBBBB");
		System.out.println(b.get(book));
		
		// Method 역시 동일.
		Method c = Book.class.getDeclaredMethod("c");
		c.setAccessible(true);
		// .invoke를 사용해서 생성된 메서드 인스턴스를 호출한다.
		c.invoke(book);
		
		// 매개변수 있는 메서드는 타입 명시 필수
		Method d = Book.class.getDeclaredMethod("sum", int.class, int.class);
		int invoke = (int) d.invoke(book,  1, 2);
		
		System.out.println(invoke);
		
	}

}
