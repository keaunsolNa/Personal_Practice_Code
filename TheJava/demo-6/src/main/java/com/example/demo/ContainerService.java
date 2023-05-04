package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {

	public static <T> T getObject(Class<T> classType) {
		
		// 메서드로 매개변수로 받은 클래스의 인스턴스를 생성한다. 
		T instance = createInstance(classType);
		
		// 매개변수 클래스의 필드들을 다 꺼낸다. 
		Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
			
			// 매개변수로 받은 클래스 중 특정 Annotation (Inject) 클래스가 있다면 
			if(f.getAnnotation(Inject.class) != null) {
				
				// 필드 타입 인스턴스로 인스턴스를 만든다.
				Object fieldInstance = createInstance(f.getType());
				
				// 접근 제한자 허용
				f.setAccessible(true);
				try {
					
					// 인스턴스와 필드 인스턴스로 Setter
					f.set(instance, fieldInstance);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		});
		return instance;
	}

	// 받은 클래스 타입의 인스턴스를 생성자로 만들어서 반환하는 메서드
	private static <T> T createInstance(Class <T> classType) {
	
			try {
				return classType.getConstructor(null).newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}
	
	}
}
