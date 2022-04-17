package com.project.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project.controller.FruitController;
import com.project.model.dto.Product_FRUIT_DTO;
import com.project.model.service.FruitService;

public class MenuTable {

	private FruitController fruitController = new FruitController();
	private FruitService fruitService = new FruitService();
	
	public void displayMainMenu() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("========청과물 관리 메뉴========");
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1. 과일 재고 조회");
			System.out.println("2. 과일 유통기한 조회");
			System.out.println("3. 과일 상세 조회");
			System.out.println("4. 재고 입출고 관리");
			System.out.println("5. 신규 상품 등록");
			System.out.println("6. 기존 상품 삭제");
			System.out.println("9. 프로그램 종료");

			int userinput = sc.nextInt();
			
			switch(userinput) {
				case 1: 
					List<Product_FRUIT_DTO> selectAllFruit = fruitService.selectAllStock();
					Iterator<Product_FRUIT_DTO> iter = selectAllFruit.iterator();
					while(iter.hasNext()) {
						System.out.println(iter.next());
					}
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 9:
			}
		} while(true);
		
	}

}
