<%--
  Created by IntelliJ IDEA.
  User: THZ
  Date: 2016/12/27
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="BookAction_addList.action">
    <table border="1">
        <tr>
            <td>书名号：</td>
            <td><s:textfield id="bookCount" name="bookCount"></s:textfield></td>
        </tr>
        <tr>
            <td>书名：</td>
            <td><s:textfield id="bookName" name="bookName"></s:textfield></td>
        </tr>
        <tr>
            <td>类型：</td>
            <td><s:textfield id="bookClass" name="bookClass"></s:textfield></td>
        </tr>
        <tr>
            <td>简介：</td>
            <td><s:textfield id="bookIntr" name="bookIntr"></s:textfield></td>
        </tr>
        <tr>
            <td>时间：</td>
            <td><s:textfield id="time" name="time"></s:textfield></td>
        </tr>
        <tr>
            <td>价格：</td>
            <td><s:textfield id="money" name="money"></s:textfield></td>
        </tr>
        <tr>
            <td colspan="2"><s:submit value="添加"></s:submit>/<s:a href="BookAction_getAllList.action">返回</s:a></td>
        </tr>
    </table>
</s:form>

</body>
</html>
