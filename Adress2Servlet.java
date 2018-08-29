package adress;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Adress2Servlet")
public class Adress2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Adress2Servlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ボタン名の文字化けを防ぐために文字コードを設定してから取得
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		RequestDispatcher rd;

		//入力画面から値を取得
		String post = request.getParameter("post");
		String test1 = request.getParameter("text1");
		String test2 = request.getParameter("text2");

		//ログイン処理クラスインスタンス化
		AdressDB login = new AdressDB();

		UserAdressBean bean = login.getUserData(post);

		if(bean != null) {

			//値を結合
			String display = post + test1 + test2;

			session.setAttribute("user_name", bean);
			request.setAttribute("ads", display);

			//コンテキストルートからの場所を指定
			rd = request.getRequestDispatcher("./Kadai2/DisplayAdress2.jsp");

		}else {

				rd = request.getRequestDispatcher("./Kadai/LoginNG.jsp");
		}

		rd.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPost(request, response);
	}
}
