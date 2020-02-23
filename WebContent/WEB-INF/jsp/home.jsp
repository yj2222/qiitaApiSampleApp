<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="model.Article"%>
<%
	List<Article> articleList = (List<Article>) request.getAttribute("articleList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/modal.css">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/qiitaApi.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/modal.js"></script>
<title>Insert title here</title>
</head>
<body>
	<header>
		<div class="headerLeft">
			<h1>- My Qiita List -</h1>
		</div>
		<div class="headerRight">
			<a class="js-modal-open" href="">+ Add New Qiita +</a>
		</div>
	</header>


	<div class="modal js-modal">
		<div class="modal__bg js-modal-close"></div>
		<div class="modal__content">
			<form action="./home" method="post">
				<div class="addArticle">
					<label>■記事のURLを貼って下さい：</label><br> <input class="inputUrl"
						type="text" name="articleUrl"> <span id="next"
						style="color: blue;">urlを取得</span>
					<div id="addArticle__jsAppendArea">
						<!-- js追加エリア -->
					</div>
					<div class="addArticle__submit">
						<button type="submit">Send</button>
					</div>

				</div>

			</form>
			<a class="js-modal-close" href="">閉じる</a>
		</div>
	</div>


	<%
		for (Article article : articleList) {
	%>
	<a href="<%=article.getUrl()%>">
		<div class="card">
			<table>
				<tr class="card_item">
					<td>最終更新</td>
					<td>：</td>
					<td style="color: #a980f5"><%=article.getDt()%></td>
				</tr>
				<tr class="card_item">
					<td>投稿者</td>
					<td>：</td>
					<td style="color: #41b7d7;"><%=article.getUserName()%></td>
				</tr>
				<tr class="card_item">
					<td>タイトル</td>
					<td>：</td>
					<td><%=article.getTitle()%></td>
				</tr>
			</table>
		</div>
	</a>
	<%
		}
	%>

	<footer>
		<small>©︎</small><span>product by yj2222</span>
	</footer>

</body>
</html>