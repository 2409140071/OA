<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/11/0011
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/laydate/laydate.js" charset="UTF-8"></script>
    <input id="t2" type="text" placeholder="请选择">
<script>
    //执行一个laydate实例
    laydate.render({
        elem: '#t2' //指定元素
        ,lang: 'en'
    });
</script>
</body>
</html>
