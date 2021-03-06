<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/3/0003
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>栏目管理</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="../js/util.js"></script>
    <script>

        function chaxun() {
            alert("这是请求，即将发送");
            var sel=document.getElementById("select");
            var optionVal = sel.value;
            location.href="${pageContext.request.contextPath}/newlabel/findnewlabelByparent.do?pid="+optionVal;
        }
        function shanchu()
        {
            var  str = confirm("是否确定删除上级栏目？");
            if(str == true)
            {
                alert("确定删除！");
            }
            else
            {
                alert("取消删除！");
            }
        }

    </script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="25" align="center" valign="bottom" class="td06"><table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="2%" valign="middle" background="${pageContext.request.contextPath}/images/bg_03.gif">&nbsp;</td>
                    <td width="2%" valign="middle" background="${pageContext.request.contextPath}/images/bg_03.gif"><img src="${pageContext.request.contextPath}/images/main_28.gif" width="9" height="9" align="absmiddle"></td>
                    <td height="30" valign="middle" background="${pageContext.request.contextPath}/images/bg_03.gif"><div align="left"><font color="#FFFFFF">栏目管理</font></div></td>
                </tr>
            </table></td>
        </tr>
    </table>
    <form name="form1" method="post" action="">
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
            <tr>
                <td colspan="2" class="td_02"><SPAN class=td_title>根据栏目名称查询</SPAN></td>
            </tr>
            <tr>
                <td width="14%" class="td_02">栏目名称</td>
                <td width="86%" class="td_02">
                    <select id="select" name="pid" class="input" style="width:99% " onchange="chaxun()">
                        <option value="0" >--请选择--</option>
                       <c:forEach items="${newlabels}" var="n">
                        <option value="${n.id}" <c:if test="${n.id == pid}">selected</c:if>>--${n.name}--</option>
                       </c:forEach>
                    </select>
                </td>
            </tr>
        </table>
        <br>
        <table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_page" align="left">
                    <div align="right">
                        <input name="Submit" type="submit" class="buttonface02" value="添加栏目" onClick="javascript:windowOpen('${pageContext.request.contextPath}/html/news/栏目添加.jsp','','',700,300,'','','')">
                    </div></td>
            </tr>
        </table>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">

            <tr>
                <td colspan="5" align="right" class="td07"><img src="../images/1.gif" width="4" height="5" align="absmiddle">
                    <a href="${pageContext.request.contextPath}/newlabel/findnewlabel.do?page=1&size=${pageInfo.pageSize}">首页</a>　 <img src="../images/2.gif" width="3" height="5" align="absmiddle">
                    <a href="${pageContext.request.contextPath}/newlabel/findnewlabel.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页　</a> <img src="../images/2-2.gif" width="3" height="5" align="absmiddle">
                    <a href="${pageContext.request.contextPath}/newlabel/findnewlabel.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页　</a> <img src="../images/3.gif" width="4" height="5" align="absmiddle">
                    <a href="${pageContext.request.contextPath}/newlabel/findnewlabel.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}">末页　</a>　共 ${pageInfo.pages} 页 ${pageInfo.total} 条记录 当前为${pageInfo.pageNum}页</td>
            </tr>
            <tr>
                <td width="17%" class="td_top">栏目名称</td>
                <td width="15%" class="td_top">上级栏目名称</td>
                <td width="44%" class="td_top">栏目描述</td>
                <td width="12%" class="td_top">删除</td>
                <td width="12%" class="td_top">修改</td>
            </tr>
            <c:forEach var="newlabel" items="${pageInfo.list}">
                <tr>
                    <td class="td07">${newlabel.name}</td>
                    <td class="td07">${newlabel.parent.name}</td>
                    <td class="td07">${newlabel.content}</td>
                    <td class="td07"><a href="${pageContext.request.contextPath}/newlabel/deletenewlabel.do?id=${newlabel.id}" onClick="shanchu()">删除</a></td>
                    <td class="td07"><a href="#" onClick="javascript:windowOpen('${pageContext.request.contextPath}/newlabel/findnewlabelById.do?id=${newlabel.id}','','',670,260,'no','yes','100','100')">修改</a>
                    </td>
                </tr>

            </c:forEach>

            <tr>
                <td class="td07">&emsp;</td>
                <td class="td07">&emsp;</td>
                <td class="td07">&emsp;</td>
                <td class="td07">&emsp;</td>
                <td class="td07">当前页为${pageInfo.pageNum}</td>

            </tr>

        </table>
        <p>&nbsp;</p>
    </form>
</center>
</body>
</html>

