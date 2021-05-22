<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>

    <link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet"/>

</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
    <tr>
        <td class="topg"></td>
    </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang" width="100%">
    <tr>
        <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
        <td width="44%" align="left">[添加咨询学生]</td>

        <td width="52%" align="right">
            <!--<a href="listLog.html"><img src="${pageContext.request.contextPath}/images/button/find.gif" class="img"/></a>
        <a href="addLog.html"><img src="${pageContext.request.contextPath}/images/button/add.gif" class="img"/></a>~-->

            <!-- <a href="#"><img src="${pageContext.request.contextPath}/images/button/close.gif" class="img"/></a>-->
            <%--保存 --%>
            <a href="" onclick="tijiao()"><img id="save" src="${pageContext.request.contextPath}/images/button/save.gif"/></a>
            <a href="#"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif"/></a>
        </td>
        <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
    </tr>
</table>


    <table width="89%" class="emp_table" style="" align="left" cellspacing="0">
        <tr>
            <td width="120px" height="35" align="left">姓名：</td>
            <td width="300px" align="left">
                <input type="text" id="suntaoshabi" name="name" />
            </td>
            <td>

            </td>
        </tr>
        <tr>
            <td>电话：</td>
            <td><input type="text" id="tel" name="telephone" /></td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>QQ：</td>
            <td><input type="text" id="qq" name="qq" value=""/></td>
            <td>&nbsp;</td>
        </tr>

        <tr>
            <td>意向级别：</td>
            <td>
                <select name="intentionLevel" id="lev">
                    <option value="">--请选择意向级别--</option>
                    <option value="A.马上报名">A.马上报名</option>
                    <option value="B.想报名，考虑中">B.想报名，考虑中</option>
                    <option value="C.有报名意向，但暂时不能报名">C.有报名意向，但暂时不能报名</option>
                    <option value="D.不能报名，以及其他原因">D.不能报名，以及其他原因</option>
                    <option value="E.已报名">E.已报名</option>
                </select>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>意向学科：</td>
            <td>
                <select name="crmCourseType.courseTypeId" id="courseType" onchange="">
                    <option value="">----请--选--择----</option>
                    <c:forEach items="${courseTypes}" var="courseType">
                        <option value="${courseType.coursetypeid}">${courseType.coursename}</option>
                    </c:forEach>
                </select>
                &nbsp;&nbsp;&nbsp;意向班级：
                <select name="crmClass.classId" id="listClass">
                    <option value="">----请--选--择----</option>
                    <c:forEach items="${classes}" var="listClass">
                        <option value="${listClass.classid}">${listClass.name}</option>
                    </c:forEach>
                </select>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td height="41" align="left">来源：</td>
            <td align="left">
                <select name="source" id="source">
                    <option value="">--请选择来源--</option>
                    <option value="1.QQ">1.QQ</option>
                    <option value="2.电话咨询">2.电话咨询</option>
                    <option value="3.上门">3.上门</option>
                    <option value="4.其他（老学员推荐）">4.其他（老学员推荐）</option>
                </select>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td align="left">备注：</td>
            <td align="left">
                <textarea name="remark" id="remark" cols="60" rows="5"></textarea>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="3">&nbsp;</td>
        </tr>
    </table>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<script type="text/javascript">

    function tijiao() {
        $.ajax({
            url: "/addStaffStu",
            type:"get",
            data: {
                name:$("input[name='name']").val(),
                telephone:$("input[name='telephone']").val(),
                qq:$("input[name='qq']").val(),
                intentionLevel:$("select[name='intentionLevel']").val(),
                courseTypeId:$("select[name='crmCourseType.courseTypeId']").val(),
                classId:$("select[name='crmClass.classId']").val(),
                source:$("select[name='source']").val(),
                remark:$("textarea[name='remark']").val()
            },
            success: function (result) {
                if (result == 1) {
                    alert("添加成功");
                    window.location.href = "/listRefer1"
                }
            }
        })
    };

</script>
</body>
</html>
