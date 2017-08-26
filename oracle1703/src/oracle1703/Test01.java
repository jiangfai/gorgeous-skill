package oracle1703;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Test01 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(

				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"scott", "tiger")) {
			CallableStatement stmt= con.prepareCall("{call sp_get_avg_sal(?,?)}");
			stmt.setInt(1, 20);
			stmt.registerOutParameter(2, Types.FLOAT);
			double avgSal=stmt.getDouble(2);
			
			System.out.println(avgSal);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
