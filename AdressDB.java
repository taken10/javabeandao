package adress;

import java.sql.ResultSet;
import java.sql.SQLException;

//アドレス処理クラス
//DAOクラスで検索→Resultに代入→Beanに格納→beanを返す

public class AdressDB {

	public UserAdressBean getUserData(String post) {

		UserAdressBean bean = null;
		AdressDAO dao = null;
		ResultSet rs = null;

		try {
			//DAOクラスをインスタンス化
			dao = new AdressDAO();
			//郵便番号を元に検索内容を実行
			rs = dao.selectAdress(post);

			while (rs.next()) {

				bean = new UserAdressBean();

				bean.setPostNumber(post);
				//rs.getStringでDBから取得した値（名前）を指定してBeanにセット
				bean.setUserName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dao.close();
		}
		return bean;
	}
}
