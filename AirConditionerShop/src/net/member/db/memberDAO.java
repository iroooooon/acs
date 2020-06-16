package net.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class memberDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	
	//DB연결
	//getConn()
	private Connection getConn() throws Exception{
		
		System.out.println("@@MemberDAO-getConn() - 호출@@");
		// *META-INF/context.xml , WEB-INF/web.xml 수정
		
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/ascdb");
		con = ds.getConnection();
		
		System.out.println("드라이버 로드 & DB 연결 성공!");
		return con;
	}
	
	//자원해제
	//closeDB()
	public void closeDB(){
		
		System.out.println("@@MemberDAO-closeDB() - 호출@@");
		
		
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
				System.out.println("자원 해제 완료!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
