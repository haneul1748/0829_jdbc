package com.project.run;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRun {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = """
					 SELECT 
					 		EMP_ID
					 	  , EMP_NAME
					 	  , EMP_NO
					 	  , EMAIL
					 	  , PHONE
					 	  , DEPT_CODE
					 	  , JOB_CODE
					 	  , SAL_LEVEL
					 	  , SALARY
					 	  , BONUS
					 	  , MANAGER_ID
					 	  , HIRE_DATE
					 	  , ENT_DATE
					 	  , ENT_YN
					   FROM 
					   	 	EMPLOYEE
					  ORDER
					   	 BY
					   	 	EMP_ID ASC
					""";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.20:10000:XE"
										,"KSKY05"
										,"KSKY1234");
			System.out.println("DB서버 접속!");
			
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			String empId = rset.getString("EMP_ID");
			String empName = rset.getString("EMP_NAME");
			String empNo = rset.getString("EMP_NO");
			String empEmail = rset.getString("EMAIL");
			String empPhone = rset.getString("PHONE");
			String deptCode = rset.getString("DEPT_CODE");
			String jobCode = rset.getString("JOB_CODE");
			String salCode = rset.getString("SAL_LEVEL");
			int salary = rset.getInt("SALARY");
			Double bonus = rset.getDouble("BONUS");
			Date hireDate = rset.getDate("HIRE_DATE");
			String managerId = rset.getString("MANAGER_ID");
			Date entDate = rset.getDate("ENT_DATE");
			String ent
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset != null) {
					rset.close();
				}
				} catch(SQLException e) {
					e.printStackTrace();
				}
			
			try {
				if(stmt != null) {
					stmt.close();
				}
				} catch(SQLException e) {
					e.printStackTrace();
				}
			
			try {
				if(conn != null) {
					conn.close();
				}
				} catch(SQLException e) {
					e.printStackTrace();
				}

		}
	}
		

}

