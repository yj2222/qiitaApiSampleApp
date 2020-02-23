$(function() {
	$(".addArticle__submit").hide();
	$.ajaxSetup({
		cache: false
	});

	function buildHtml(data){
		var html = `<div class="acquiredArticle">
			<label>■最終更新時間：</label><br>
			<input type="text" value=${data.created_at.split("T")[0]} name="articleTime">
			</div>
			<div class="acquiredArticle">
			<label>■投稿者：</label><br>
			<input type="text" value=${data.user.id} name="articleUserName">
			</div>
			<div class="acquiredArticle">
			<label>■記事のタイトル：</label><br>
			<input type="text" value=${data.title} name="articleTitle">
			</div>`
			return html;
	}

	var getArticle = function(itemId){
		var apiUrl = "http://qiita.com/api/v2/items/" + itemId
		$.get(apiUrl).done(function(data) {
			var insertHtml = buildHtml(data)
			$("#addArticle__jsAppendArea").append(insertHtml);
			$(".addArticle__submit").show();
		});
	}
	$("#next").click(function () {
		var itemId = $(".inputUrl").val().split('/');
		$(this).hide();
		getArticle(itemId[itemId.length -1]);
	});
});