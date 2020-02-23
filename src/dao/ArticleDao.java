package dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Article;

public class ArticleDao {
	private static Connection getConnection() throws URISyntaxException, SQLException {

		String username = "root";
		String password = "";
		String dbUrl = "jdbc:mysql://localhost/qiitaData";

		return DriverManager.getConnection(dbUrl, username, password);
	}

	public List<Article> articleAll() {

		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");
			try(Connection conn = getConnection()) {

				String sql = "SELECT * FROM article;";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				ResultSet rs = pStmt.executeQuery();
				List<Article> userList = new ArrayList<Article>();

				while(rs.next()) {
					String dt = rs.getString("dt");
					String userName = rs.getString("userName");
					String title = rs.getString("title");
					String url = rs.getString("url");
					Article article = new Article(dt, userName, title, url);
					userList.add(article);
				}
				return userList;

			} catch (URISyntaxException e) {
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	public boolean updateOne(Article article) {
		System.out.println(article);
		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");
			try(Connection conn = getConnection()) {

				String sql = "INSERT INTO article (dt, userName, title, url) VALUES(?, ?, ?, ?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);
		        pStmt.setString(1, article.getDt());
		        pStmt.setString(2, article.getUserName());
		        pStmt.setString(3, article.getTitle());
		        pStmt.setString(4, article.getUrl());
		        int result = pStmt.executeUpdate();
		        if (result != 1) {
		          return false;
		        }
				return true;

			} catch (URISyntaxException e) {
				e.printStackTrace();
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			return false;
		}
	}
}
