package com.school.member.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

public class School_DAO {

	private Properties prop = new Properties();
	
	public School_DAO() {
		try {
			prop.loadFromXML(new FileInputStream("mapper/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public int login(Connection con, Map<String, String> login) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("");
		
		return 0;
	}
}
