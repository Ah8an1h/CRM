<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<HTML><HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>
<base target="_self">
<script>
	function modifypsw(){
   		var dw=window.showModalDialog('${pageContext.request.contextPath}/uiAction_staff_updPwd','', 'dialogHeight:180px; dialogWidth:260px; dialogLeft:500px; dialogTop:220px;edge:sunken;center:yes;location:no;help:no;resizable:no;status:no;scroll:no');
	} 
</script>

</HEAD>
<BODY bgColor=#CEEBFF leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">

<table border="0" width="100%" cellspacing="0" cellpadding="0" id="table1" height="27">
	<tr>
		<td>
		<table border="0" width="100%" cellspacing="0" cellpadding="0" id="table2">
			<tr>
				
				<td background="${pageContext.request.contextPath}/images/topbg.jpg" valign="bottom">
				 
				</td>
				
				<!-- 显示时间 -->
				<td width="374" background="${pageContext.request.contextPath}/images/topbg.jpg" valign="top">
				<table border="0" width="100%" cellspacing="0" cellpadding="0" id="table3">
					<tr>
						<td height="19">
						</td>
					</tr>
					<tr>
						<td height="20">　</td>
					</tr>
					<tr>
						<td>
						<div align="right">
							<table border="0" width="215" cellspacing="0" cellpadding="0" id="table4" height="23">
								<tr>
									<td width="51" valign="middle">
										 <font color="#ffffff">今天是：
										<script language="JavaScript">
												<!--
													tmpDate = new Date();
													date = tmpDate.getDate();
													month = tmpDate.getMonth() + 1;
													year = tmpDate.getFullYear();
													//document.write(1900 + year);
													document.write(year);
													document.write("年");
													document.write(month);
													document.write("月");
													document.write(date);
													document.write("日 ");
				
													myArray = new Array(6);
													myArray[0] = "星期日";
													myArray[1] = "星期一";
													myArray[2] = "星期二";
													myArray[3] = "星期三";
													myArray[4] = "星期四";
													myArray[5] = "星期五";
													myArray[6] = "星期六";
													weekday = tmpDate.getDay();
													document.write(myArray[weekday]);
												// -->
												</script>
										</font>
									</td>
								 
								</tr>
							</table>
						</div>
						</td>
					</tr>
				</table>	
				 </td>
				
				<!-- 显示 登录姓名-->
				<td width="374" background="${pageContext.request.contextPath}/images/topbg.jpg" valign="top">
				<table border="0" width="100%" cellspacing="0" cellpadding="0" id="table5">
					<tr>
						<td height="19">
						</td>
					</tr>
					<tr>
						<td height="20">　</td>
					</tr>
					<tr>
						<td>
						<div align="right">
							<table border="0" width="215" cellspacing="0" cellpadding="0" id="table6" height="23">
								<tr>
									<td width="51" valign="middle">
										<font color="#FFFFFF" id="showloginName">

										</font>
									</td>
								</tr>
							</table>
						</div>
						</td>
					</tr>
				</table>	
				 </td>
				
				<!-- 操作  更改密码 重新登录 -->
				<td width="374" background="${pageContext.request.contextPath}/images/topright.jpg" valign="top">
				<table border="0" width="100%" cellspacing="0" cellpadding="0" id="table7">
					<tr>
						<td height="19">
						</td>
					</tr>
					<tr>
						<td height="20">　</td>
					</tr>
					<tr>
						<td>
						<div align="right">
							<table border="0" width="215" cellspacing="0" cellpadding="0" id="table8" height="23">
								<tr>
									<td width="51" valign="middle">
										<%--是否使用弹出框？ javascript:modifypsw(); 
										<a href="javascript:void(0)" onclick="javascript:modifypsw();"><font color="ffffff">更改口令</font></a>
										--%>
										<a href="updPwd" target="right">
											<font color="ffffff">更改密码</font>
										</a>
									</td>
										<td width="55" valign="middle"><a href="/login" target="_top"><font color="ffffff">重新登录</font></a></td>
								</tr>
							</table>
						</div>
						</td>
					</tr>
				</table>	
				 </td>
			</tr>
		</table>
		</td>
	</tr>
</table>
<table border="0" width="100%" cellspacing="0" cellpadding="0" height="10" id="table9">
	<tr>
		<td style="border-bottom: 1px solid #ffffff; filter: progid:dximagetransform.microsoft.gradient(startcolorstr='#0075C4', endcolorstr='#ffffff', gradienttype='1'">　</td>
	</tr>
</table>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	$.ajax({
	   url:"/showLoginName",
		success:function (result) {

			$("#showloginName").append("欢迎您:"+result.data)
        }
	})
})


</script>
</BODY></HTML>