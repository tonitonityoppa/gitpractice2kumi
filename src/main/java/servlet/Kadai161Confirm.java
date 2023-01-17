package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Kadai161dto;

/**
 * Servlet implementation class Kadai161Confirm
 */
@WebServlet("/Kadai161Confirm")
public class Kadai161Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kadai161Confirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gen = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String mail = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		String gender = gen.equals("0") ? "男" : "女";
		
		
		Kadai161dto account = new Kadai161dto(-1, name, age, gender,tel, mail, null, pw, null);
		
		// セッションスコープのインスタンス取得
		HttpSession session = request.getSession();
		
		// セッションスコープに値の保存
		// 第1引数：キー
		// 第2引数：保存する値
		session.setAttribute("input_data", account);
		
		String view = "WEB-INF/view/kadai-confirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response); }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}