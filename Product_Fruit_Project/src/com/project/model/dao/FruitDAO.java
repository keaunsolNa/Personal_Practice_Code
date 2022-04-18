package com.project.model.dao;

import static com.project.common.PRODUCTTemplacte.close;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.project.model.dto.Product_ALL_DTO;
import com.project.model.dto.Product_FRUIT_DTO;

public class FruitDAO {
	
	private Properties prop = new Properties();
	List<Product_FRUIT_DTO> fruitAllList = null;
	
	public FruitDAO() {
		try {
			prop.loadFromXML(new FileInputStream("mapper/menu_query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/* 전체 전체 재고 조회용 메소드 */
	public List<Product_FRUIT_DTO> selectAllStock(Connection con) {
		Statement stmt = null;
		ResultSet rset = null;
		
		
		String query = prop.getProperty("selectAllFruit");
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			fruitAllList = new ArrayList<>();
			while(rset.next()) {
				Product_FRUIT_DTO fruitallselectList = new Product_FRUIT_DTO();
				fruitallselectList.setNo(rset.getInt("PRODUCT_NO"));
				fruitallselectList.setNativeHabitat(rset.getString("PRODUCT_NATIVE_HABITAT"));
				fruitallselectList.setName(rset.getString("PRODUCT_NAME"));
				fruitallselectList.setStock(rset.getInt("PRODUCT_STOCK"));
				
				fruitAllList.add(fruitallselectList);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return fruitAllList;
	}

	/* 과일 선택 재고 조회용 메소드 */
	public List<Product_FRUIT_DTO> selectStock(Connection con, int fruitCode) {
		PreparedStatement pstm = null;
		ResultSet rset = null;
		List<Product_FRUIT_DTO> fruitList = null;
		
		String query = prop.getProperty("selectFruit");

		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, fruitCode);
			
			rset = pstm.executeQuery();
			
			fruitList = new ArrayList();
			
			if(rset.next()) {
				Product_FRUIT_DTO fruitselectList = new Product_FRUIT_DTO();
				fruitselectList.setNo(rset.getInt("PRODUCT_NO"));
				fruitselectList.setNativeHabitat(rset.getString("PRODUCT_NATIVE_HABITAT"));
				fruitselectList.setName(rset.getString("PRODUCT_NAME"));
				fruitselectList.setStock(rset.getInt("PRODUCT_STOCK"));
				
				fruitList.add(fruitselectList);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstm);
		}
		
		return fruitList;
	}
	
	
	/* 재고 유통기한 조회용 메소드 */
	public List<Product_ALL_DTO> selectTime(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 재고 상세 조회용 메소드 */
	public List<Product_FRUIT_DTO> selectAllFruit(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
