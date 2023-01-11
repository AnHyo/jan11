package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBConnection을 통해서 접속해보겠습니다.
public class DB02 {
	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.getConn(); //접속정보
		Statement stmt = null;//실제 일 하는녀석
		String sql = "SELECT * FROM member";//쿼리문장
		ResultSet rs = null; //결과값
		
		//조립
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //결과값 나오는 메소드
			//출력
			//System.out.println(rs.toString()); //그냥 rs라고 하면 객체가 나온다. 근데 이렇게 써도 객체가 나옴
			while(rs.next()) { //rs에 값이 있다면
				int number = rs.getInt("no"); // (1)
				String name = rs.getString("name"); // (2)
				String id = rs.getString("id"); //(3) 이렇게 해도 나온다. db상의 행의 숫자
				//System.out.println(number);
				System.out.printf("%d \t %s \t %s\n",number, name, id);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}

}
