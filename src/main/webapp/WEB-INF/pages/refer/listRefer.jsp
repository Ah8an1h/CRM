<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript">
		function selectRefer(){
			
		}
	</script>
</head>

<body>
 <table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0" class="wukuang">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="33%" align="left">[咨询学生管理]</td>
   
    <td width="63%"align="right">
    	<%--添加咨询 --%>
    	<a class="butbg" href="/className">
	        <img src="${pageContext.request.contextPath}/images/button/tianjia.gif" />
    	</a>
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>

<!-- 查询条件：失去焦点马上查询 -->
<form action="" method="post">
	<table width="88%" border="0" style="margin: 20px;" >
	  <tr>
	    <td width="80px">查询条件：</td>
	    <td width="300px">
	    	<input type="text" name="condition" size="20" onblur="" />
	    	（姓名|电话|QQ）
	    </td>
	    <td ></td>
	  </tr>
	</table>
</form>

<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="${pageContext.request.contextPath}/images/result.gif"/></td>
  </tr>
</table>

<table width="100%" border="1" id="tab">
  
  <tr class="henglan" style="font-weight:bold;">
	<td width="80px" align="center">姓名</td>
	<td width="9%" align="center">电话</td>
	<td width="11%" align="center">QQ </td>
	<td width="15%" align="center">意向类别/班级</td>
	<td width="17%" align="center">状态</td>
	<td width="10%" align="center">营销人员</td>
	<td width="8%" align="center">查看</td>
	<%-- 根据状态不同显示操作项 --%>
	<td width="8%" align="center">编辑</td>
	<td width="8%" align="center">跟踪</td>
	<td width="8%" align="center">录入学籍</td>
  </tr>

  <tr class="tabtd1">
	    <%--<td align="center">张三</td>--%>
	    <%--<td align="center">13312341234</td>--%>
	    <%--<td align="center">123456</td>--%>
	    <%--<td align="center">--%>
	    	<%--JavaEE/--%>
	    	<%--J161001期--%>
	    <%--</td>--%>
	    <%--<td align="center">--%>
	    	<%--咨询中--%>
	    <%--</td>--%>
	    <%--<td align="center">管理员</td>--%>

	    <%--<!-- 查看 -->--%>
		<%--<td width="8%" align="center">--%>
			<%--<a href="/showRefer"><img src="${pageContext.request.contextPath}/images/button/view.gif" class="img"/></a>--%>
		<%--</td>--%>


		<%--<!-- 编辑 -->--%>
		<%--<td width="8%" align="center">--%>
			<%--<a href="/editRefer"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"/></a>--%>
		<%--</td>--%>

		<%--<!-- 添加跟踪 -->--%>
		<%--<td width="8%" align="center">--%>
			<%--<a href="/addOrEditFollow"><img src="${pageContext.request.contextPath}/images/button/new.gif" class="img"/></a>--%>
		<%--</td>--%>

		<%--<!-- 入学 -->--%>
		<%--<td width="8%" align="center">--%>
			<%--<a href="/addStudent"><img src="${pageContext.request.contextPath}/images/button/modify.gif" class="img"/></a>--%>
		<%--</td>--%>

	</tr>

</table>
<table border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td align="right">
    	<span>第1/3页</span>
        <span>
        	<a href="#">[首页]</a>&nbsp;&nbsp;
            <a href="#">[上一页]</a>&nbsp;&nbsp;
            <a href="#">[下一页]</a>&nbsp;&nbsp;
            <a href="#">[尾页]</a>
        </span>
    </td>
  </tr>
</table>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<script type="text/javascript">

    var url = window.location.search;
    var loc = url.substring(url.lastIndexOf('=')+1, url.length);

    console.log(loc);
        $.ajax({
            url:"/listRefer1",
            type:"get",
            data:{
              status:loc
            },
            success:function(result){
                console.log(result)
				for (i=0;i<result.data.length;i++){
					var td1 =$("<td align='center'></td>").text(result.data[i].name)
					var td2= $("<td align='center'></td>").text(result.data[i].telephone)
					var td3 =$("<td align='center'></td>").text(result.data[i].qq)
					var td4 =$("<td align='center'></td>").text(result.data[i].courstName.coursename+"/"+result.data[i].className.name)
                    var td5 = $("<td align='center'></td>")
					if (result.data[i].status==1){
					     td5.text("咨询中")
					}
					if (result.data[i].status==2){
                         td5 .text("已报名")
					}
                    var td6 = $("<td align='center'></td>").text(result.data[i].staffName.staffname)

                    var td7 = $("<td width='8%' align='center'><a href='/showRefer'><img src='${pageContext.request.contextPath}/images/button/view.gif' class='img'/></a></td>")
                    var td8 = $("<td width='8%' align='center'><a href='/showRefer'><img src='${pageContext.request.contextPath}/images/button/modify.gif' class='img'/></a></td>")
                    var td9 = $("<td width='8%' align='center'><a href='/showRefer'><img src='${pageContext.request.contextPath}/images/button/new.gif' class='img'/></a></td>")
                    var td10 = $("<td width='8%' align='center'><a href='/showRefer'><img src='${pageContext.request.contextPath}/images/button/modify.gif' class='img'/></a></td>")

                    var tr = $("<tr class='tabtd1'></tr>")
                    var tab = $("#tab")
					tab.append(tr.append(td1,td2,td3,td4,td5,td6,td7,td8,td9,td10))

				}
            }
        })

</script>

</body>
</html>
