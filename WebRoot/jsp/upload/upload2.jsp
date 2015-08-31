<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JS Bin</title> 

<style type="text/css"> 
.up_icon,.up_input {position: absolute;top: 10px;left: 10px;width: 64px;height: 64px;z-index: 2}
.up_icon {overflow: hidden;font-size: 0;line-height: 99em;background: url(/spring-web/images/3469672357-54250d7235406_articlex.png) no-repeat 0 0;z-index: 1;}
</style> 

</head>
<body>
<input type="file" id="upfile" class="up_input"><span class="up_icon"></span>
	<br /><br /><br /><br /><br /><br />
<button id="opacity0">上传按钮透明只显示图片</button> <button id="opacity1">显示上传按钮</button>
	<br /><br />
你选择的文件的名称为：<span id="filename">未选择任何文件</span>
</body>


<script type="text/javascript">
var upfile = document.getElementById("upfile"),
	opacity1 = document.getElementById("opacity1"),
	opacity0 = document.getElementById("opacity0");

opacity0.onclick = function() {
	upfile.style.opacity = "0";
};

opacity1.onclick = function() {
	upfile.style.opacity = "1";
};

upfile.onchange = function() {
	updateFilename(this.value);
};

function extractFilename(path) {
  var x;
  x = path.lastIndexOf('\\');
  if (x >= 0) // 基于Windows的路径
    return path.substr(x+1);
  x = path.lastIndexOf('/');
  if (x >= 0) // 基于Unix的路径
    return path.substr(x+1);
  return path; // 仅包含文件名
}
 function updateFilename(path) {
   var name = extractFilename(path);
   document.getElementById('filename').textContent = name;
 };

</script>
</html>