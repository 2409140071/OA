<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/12/14/0014
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>部门管理</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css">
    <link href="css/style_.css" rel="stylesheet" type="text/css">

    <script>
        function tianjia()
        {
            var xg = confirm("是否确定添加此部门？");
            if(xg == true)
            {
                alert("确定添加！！！");
            }
            else
            {
                alert("取消添加！！！");
            }
        }
    </script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="25" align="center" valign="bottom" class="td06"> <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="2%" valign="middle" background="../../images/bg_03.gif">&nbsp;</td>
                    <td width="2%" valign="middle" background="../../images/bg_03.gif"><img src="../../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
                    <td height="30" valign="middle" background="../../images/bg_03.gif"><div align="left"><font color="#FFFFFF">部门添加</font></div></td>
                </tr>
            </table></td>
        </tr>
    </table>
    <form name="form1" method="post" action="${pageContext.request.contextPath}/department/addDepartment.do">
        <p style="color: red">${msg}</p>
        <table width="95%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="15%" height="30" class="td_form01"> 部门名称</td>
                <td class="td_form02">
                    <input type="text" name="depname" maxlength="10" class="input" style="width:95% ">
                </td>
            </tr>
            <!--  <tr>
              <td width="15%" height="30" class="td_form01"> 所属单位</td>
              <td class="td_form02">
                <select name="select" style="width:95% ">
                </select>
              </span> </span> <span><span class="td_form01">
            </span></span></td>
            </tr>-->
            <tr>
                <td width="15%" height="30" class="td_form01">上级部门</td>
                <td class="td_form02">
                    <select name="pid" style="width:95% ">
                    </select>
                    </span> </span> <span><span class="td_form01"> </span></span></td>
            </tr>
            <tr>
                <td width="15%" height="30" class="td_form01"> 部门邮箱</td>
                <td class="td_form02">
                    <input name="email" type="text" class="input" style="width:95% "></td>
            </tr>
            <tr>
                <td width="15%" height="30" class="td_form01"> 办公电话</td>
                <td class="td_form02">
                    <input name="phone" type="text" class="input" style="width:95% "></td>
            </tr>
            <tr>
                <td width="15%" height="30" class="td_form01"> 部门描述</td>
                <td class="td_form02">
                    <textarea rows="5" cols="" style="width:95% "></textarea>
                </td>
            </tr>
        </table>
        <br>
        <table width="95%"  border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td align="right" class="td_page"><div>
                    <input name="Submit" type="submit" class="buttonface02" onClick="tianjia()" value="  添加  ">
                    &nbsp;
                    <input name="Submit" type="reset" class="buttonface02" value="  重置  ">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="&#21333;&#20301;&#31649;&#29702;.htm">返回上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                </div></td>
            </tr>
        </table>
        </p>
    </form>
</center>
</body>
</html>

