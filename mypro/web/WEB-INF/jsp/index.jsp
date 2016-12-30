<%--
  Created by IntelliJ IDEA.
  User: THZ
  Date: 2016/12/26
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            text-align: center;
        }
        #title{
            font-size: 32px;
        }
    </style>

    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script>
        $(function(){
            'use strict';
            $("button[name=b1]").click(function () {
                var value = $("input[name=Count]").val();
                if (value=="请输入书名号"){
                    alert("ok");
                    location.href = "BookAction_getAllList.action";
                }else{
                    alert("No");
                    var sum = "BookAction_getOneList.action?count="+value;
                    location.href= sum;
                }

            });
            $("button[name=b2]").click(function () {
                location.href="BookAction_getAllList.action";
            });

        });

    </script>
</head>
<body>
<input name="Count" id="Count" type="text" value="请输入书名号" onfocus="this.value=''" onblur="if(this.value==''){this.value='请输入书名号'}"/> <button name="b1">查询</button><button name="b2">显示全部</button>
<s:form action="BookAction_deleList">
<table border="1">
    <tr>
        <td colspan="8" id="title">图书</td>
    </tr>
    <tr>
        <td>\</td>
        <td>书名号</td>
        <td>书名</td>
        <td>类型</td>
        <td>简介</td>
        <td>上价时间</td>
        <td>价格</td>
        <td>操作</td>
    </tr>
    <s:iterator value="list">
        <tr>
            <td><s:checkbox name="bookIds" value="false" fieldValue="%{bookId}"></s:checkbox></td>
            <td><s:property value="bookCount"></s:property></td>
            <td><s:property value="bookName"></s:property></td>
            <td><s:property value="bookClass"></s:property></td>
            <td><s:property value="bookIntr"></s:property></td>
            <td><s:property value="time"></s:property></td>
            <td><s:property value="money"></s:property></td>
            <td><s:a href="BookAction_rev.action?id=%{bookId}">修改</s:a></td>
        </tr>
    </s:iterator>
    <tr>

    </tr>
    <tr>
        <td colspan="8"><s:a href="BookAction_add.action">添加</s:a></td>
    </tr>
    <tr>
        <td colspan="8"><s:submit value="删除"></s:submit></td>
    </tr>
</table>

</s:form>

</body>
</html>
