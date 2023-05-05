package com.example.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.InvocationHandlerAdapter;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class BookServiceTest {

//	BookService bookService = (BookService) Proxy.newProxyInstance(BookService.class.getClassLoader(), new Class[] {BookService.class}, 
//			new InvocationHandler() {
//				BookService bookService = new DefaultBookService();
//				
//				@Override
//				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//					if(method.getName().equals("rent")) {
//						
//						System.out.println("aaaa");
//						Object invoke = method.invoke(bookService, args);
//						System.out.println("bbbb");
//						return invoke;
//					}
//					
//					return method.invoke(bookService, args);
//				}
//			});
			
	@Test
	public void di() throws Exception {
		
//		MethodInterceptor handler = new MethodInterceptor() {
//			DefaultBookService bookService = new DefaultBookService();
//			
//			@Override
//			public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//				
//				if(method.getName().equals("rent")) {
//					
//					System.out.println("aaaa");
//					Object invoke = method.invoke(bookService, args);
//					System.out.println("bbbb");
//					return invoke;
//				}
//				
//				return method.invoke(bookService, args);
//			}
//			
//		};

			
//		MethodInterceptor handler = new MethodInterceptor() {
//			BookService bookService = new BookService();
//			
//			@Override
//			public Object invoke(Object o, Method mothod, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				return method.invoke(bookService);
//			}
//		};
		
//		BookService bookService = (BookService) Enhancer.create(BookService.class, handler);
		
		Class<? extends DefaultBookService> proxyClass = new ByteBuddy().subclass(DefaultBookService.class)
				.method(named("rent")).intercept(InvocationHandlerAdapter.of(new InvocationHandler() {
					DefaultBookService bookService = new DefaultBookService();
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("aaaa");
						Object invoke = method.invoke(bookService, args);
						System.out.println("bbbb");
						return invoke;
					}
				}))
				.make().load(DefaultBookService.class.getClassLoader()).getLoaded();
		
		DefaultBookService bookService = proxyClass.getConstructor(null).newInstance();
		
		Book book = new Book();
		book.setTitle("spring");
		bookService.rent(book);
		bookService.returnBook(book);
	}
			
}
