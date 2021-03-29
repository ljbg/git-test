<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加电影</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>添加电影页面</h3></center>
    <form action="${pageContext.request.contextPath}/addMovie" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label for="movies_name">电影名称：</label>
            <input type="text" class="form-control" id="movies_name" name="movies_name" placeholder="请输入电影名">
        </div>

        <div class="form-group">
            <label for="movies_date">时间：</label>
            <input type="text" class="form-control" id="movies_date" name="movies_date" placeholder="请输入电影发行时间">

        </div>

        <div class="form-group">
            <label for="movies_img">图片：</label>
            <input type="file" name="movies_img" id="movies_img">
        </div>

            <div class="form-group">
                <label for="type">电影类型</label>
                <select name="movies_type_id" id="type">
                    <option value="" >不限</option>
                    <c:forEach items="${typeList}" var="type" varStatus="s">
                        <option value="${type.type_id}" }  >${type.type_name}</option>
                    </c:forEach>
                </select>
            </div>


        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" />
        </div>
    </form>
</div>
</body>
</html>