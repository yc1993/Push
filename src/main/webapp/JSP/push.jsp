<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="JS/jquery-3.2.1.min.js"></script>
<style type="text/css">
label{
	width: 100px;
	width: 60px;
	display: inline-block;
}
</style>
</head>
<body>
<form action="push.do" method="post" accept-charset="UTF-8">
	<button type="submit" style="width: 100px;">提交</button><br>
	<label for="title">title</label><input type="text" id="title" name="title" class="title"/><br>
	<label for="icon_url">icon_url</label><input type="text" id="iconUrl" name="iconUrl" /><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
	<label for="con">content</label><textarea rows="3" cols="150" class="con" name="con"></textarea><br>
	<label for="imgPath">url</label><input type="text" id="imgPath" class="imgPath" name="imgPath" size="149"><br><br>
</form>

</body>
<script type="text/javascript">
	function addContent(){
		$(".contentBr").before("<textarea rows=\"3\" cols=\"40\" class=\"content\" name=\"content\"></textarea>");
	}
	function addUrl() {
		$("#urlBr").before("<input type=\"text\" class=\"url\" name=\"url\">");
	}
</script>
</html>