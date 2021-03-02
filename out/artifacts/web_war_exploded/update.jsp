<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改用户</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改电影</h3>
    <form action="${pageContext.request.contextPath}/updateMovie" method="post">

        <input type="hidden" name="movies_id" value="${movie.moviesId}">

        <div class="form-group">
            <label for="movies_name">电影名称：</label>
            <input type="text" class="form-control" id="movies_name" name="movies_name" value="${movie.moviesName}" placeholder="请输入电影名">
        </div>

        <div class="form-group">
            <label for="movies_date">时间：</label>
            <input type="text" class="form-control" id="movies_date" name="movies_date"  value="${movie.moviesDate}" placeholder="请输入电影发行时间">

        </div>

        <div class="form-group">
            <label for="type">电影类型</label>
            <select name="movies_type_id" id="type">
                <option value="" >不限</option>
                <c:forEach items="${typeList}" var="type" varStatus="s">
                    <option value="${type.type_id}"  ${type.type_id eq movie.moviesType.type_id ?'selected':''} >${type.type_name}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回"/>
        </div>
    </form>
</div>
</body>
</html>