package model;

import java.io.Serializable;

public class Article implements Serializable{

	private String dt;
	private String userName;
	private String title;
	private String url;

	public Article() {

	}

	public Article(String dt, String userName, String title ,String url) {
		this.dt = dt;
		this.userName = userName;
		this.title = title;
		this.url = url;
	}

	public String getDt() {
		return dt;
	}

	public String getUserName() {
		return userName;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

}
