package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDao;
import model.Article;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArticleDao dao = new ArticleDao();
		List<Article> articleList = dao.articleAll();

		System.out.println(articleList);
		request.setAttribute("articleList", articleList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String dt = request.getParameter("articleTime");
		String userName = request.getParameter("articleUserName");
		String title = request.getParameter("articleTitle");
		String url = request.getParameter("articleUrl");
		System.out.println(dt + " " + userName + " " + title + " " + url);

		Article article = new Article(dt, userName, title, url);
		ArticleDao dao = new ArticleDao();
		boolean updateResult = dao.updateOne(article);

		if(updateResult) {
			System.out.println("更新完了");
		} else {
			System.out.println("更新失敗");
		}

		doGet(request, response);
	}

}
