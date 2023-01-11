package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//자바와 데이터베이스 연결

 /* sql 명령어(DML) */
//select 조회 불러오기
//insert 	저장하기
//update 	수정하기
//delete 	삭제하기


public class DB01 {
	public static void main(String[] args) {
		//DB와 연결하기 -> jar와 연결 (커넥터 jar)
		Connection con = null; //접속정보 저장
		Statement stmt = null; //실제 접속정보로 db에서 일 하기
		ResultSet rs = null; //결과값 저장
		
		String url = "jdbc:mariadb://localhost:3306/poseidon";
		String id ="poseidon";
		String pw = "01234567";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			System.out.println("접속 성공입니다.");
		} catch (ClassNotFoundException e) { //클래스를 찾지 못할때 , Exception e 만 남기면 아래의 catch문 안써도 된다.
			//e.printStackTrace();									// Exception e 가 최상위 이기 때문에 모든 부분에서 적용됨
			System.out.println("드라이버가 없습니다.");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("접속정보에 문제가 있습니다.");
		}
		

	}

}
