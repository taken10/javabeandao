package adress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAOクラス　DBの値検索

public class AdressDAO {

	private Connection con = null;
	private ResultSet rs = null;
	private PreparedStatement ps = null;

	public ResultSet selectAdress(String post) throws SQLException {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			//接続するDBを指定
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample",
					  "root",
					  "shinkomo1");

			//SQL
			ps = con.prepareStatement("select name from adress where post = ?");

			//上記の?に値を入れる
			ps.setString(1, post);

			//SQL実行
			rs = ps.executeQuery();

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		return rs;

	}

	public void close() {

		try {
			if (con != null) {
				con.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
