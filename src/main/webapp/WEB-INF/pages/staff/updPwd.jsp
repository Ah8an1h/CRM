<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>更改口令</title>
    <link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet"/>
    <style>
        .updpwd {
            background-color: #2ae;
        }

        .login_btn {
            background-color: #9be;
            width: 99px;
            font-size: 14px;
            font-family: 微软雅黑;
        }

        .upd_pwd_msg {
            font-size: 14px;
            text-align: right;
        }
    </style>
    <script type="text/javascript" src="../../../js/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
        $(".login_btn1").click(function () {
            $.ajax({
                url: "/updatePwd",
                type: "post",
                data: {
                    oldPwd: $("input[name='oldPwd']").val(),
                    newPwd: $("input[name='newPwd']").val(),
                    newTwoPwd: $("input[name='newTwoPwd']").val()
                },
                success:function (result) {
                    if (result == "1"){
                        alert("修改成功")
                        window.location.href = "/listRefer"
                    }
                    else {
                        alert("您的输入有误,请重新输入");
                        window.location.href = "/updPwd"
                    }
                }
            })
        })})
    </script>
</head>

<body class="updpwd">
<form action="" method="post">
    <table style="width: 200px">
        <tr>
            <td colspan="2">
                <span id="msgId" class="upd_pwd_msg"> </span>
            </td>
        </tr>
        <tr>
            <td>原始密码：</td>
            <td><input type="password" name="oldPwd" value=""/></td>
        </tr>
        <tr>
            <td>新&nbsp;密&nbsp;码：</td>
            <td><input type="password" name="newPwd" value=""/></td>
        </tr>
        <tr>
            <td>确认密码：</td>
            <td><input type="password" name="newTwoPwd" value=""/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" value="修改" class="login_btn1"/>

                <button type="reset" value="关闭" class="login_btn2">关闭</button>

            </td>
        </tr>
    </table>
</form>
</body>

</html>
