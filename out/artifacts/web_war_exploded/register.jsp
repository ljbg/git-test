<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <style type="text/css">
        span {
            color: red;
            font-size: 15px;
        }

        body {
            background-color: skyblue;
        }
    </style>
    <script type="text/javascript">
        window.onload = function() {
            var success1 = false;
            var success2 = false;
            var success3 = false;
            var usernameText = document.getElementById("username");
            var userpwdText = document.getElementById("userpwd");
            var userpwd2Text = document.getElementById("userpwdrepeat");
            var usernameSpan = document.getElementById("usernameError");
            var userpwdSpan = document.getElementById("userpwdError");
            var userpwdrepeatSpan = document.getElementById("userpwdError2");

            //给username这个文本框绑定失去焦点事件
            usernameText.onblur = function() {
                usernameValue = usernameText.value.trim();
                if (usernameValue === "") {
                    //用户名为空
                    usernameSpan.innerText = "用户名不能为空喔";
                } else {
                    // 用户名不为空
                    // 继续判断长度[6-14]
                    if (usernameValue.length < 6 || usernameValue.length > 14) {
                        // 用户名长度非法
                        usernameSpan.innerText = "用户名长度必须在[6-14]之间喔";
                    } else {
                        // 用户名长度合法
                        // 继续判断是否含有特殊符号
                        var regExp = /^[A-Za-z0-9]+$/;
                        var ok = regExp.test(usernameValue);
                        if (ok) {
                            // 用户名最终合法
                            success1 = true;
                        } else {
                            // 用户名中含有特殊符号
                            usernameSpan.innerText = "您输入的用户名只能由数字和字母组成喔";
                            success1 = false;
                        }
                    }
                }
                return success1;
            }

            //给username这个文本框绑定获得焦点事件
            usernameText.onfocus = function() {
                //清空非法的value
                if (usernameSpan.innerText != "") {
                    usernameText.value = "";
                }
                //清空span
                usernameSpan.innerText = "";

            }




            //给userpwd这个文本框绑定失去焦点事件
            userpwdText.onblur = function() {
                userpwdValue = userpwdText.value.trim();
                if (userpwdValue === "") {
                    //密码为空
                    userpwdSpan.innerText = "密码不能为空喔";
                } else {
                    // 密码不为空
                    // 继续判断长度[6-18]
                    if (userpwdValue.length < 6 || userpwdValue.length > 18) {
                        // 密码长度非法
                        userpwdSpan.innerText = "密码长度必须在[6-18]之间喔";
                    } else {
                        // 密码长度合法
                        // 密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
                        var regExp = /^[a-zA-Z]\w{5,17}$/;
                        var ok = regExp.test(userpwdValue);
                        if (ok) {
                            // 密码最终合法
                            success2 = true;
                        } else {
                            // 密码不符合规范
                            userpwdSpan.innerText = "您输入的密码必须以字母开头只能包含字母、数字和下划线";
                            success2 = false;
                        }
                    }
                }
                return success2;
            }

            //给userpwd这个文本框绑定获得焦点事件
            userpwdText.onfocus = function() {
                //清空非法的value
                if (userpwdSpan.innerText != "") {
                    userpwdText.value = "";
                }
                //清空span
                userpwdSpan.innerText = "";

            }



            //给userpwdrepeat这个文本框绑定失去焦点事件
            userpwd2Text.onblur = function() {
                var userpwdValue = userpwdText.value.trim();
                var userpwd2Value = userpwd2Text.value.trim();
                if (userpwd2Value != userpwdValue) {
                    //两次密码不一致
                    userpwdrepeatSpan.innerText = "您输入的两次密码不一致喔";
                    success3 = false;
                } else {
                    //两次密码一致
                    success3 = true;
                }
                return success3;
            }

            //给userpwdrepeat这个文本框绑定获得焦点事件
            userpwd2Text.onfocus = function() {
                if (userpwdrepeatSpan.innerText != "") {
                    userpwd2Text.value = "";
                }
                userpwdrepeatSpan.innerText = "";
            }




            //给提交按钮绑定鼠标单击事件
            document.getElementById("submitbtn").onclick = function() {

                // 当所有表单项都是合法的时候,提交表单
                if (success1 && success2 && success3) {
                    // 获取表单对象
                    var userFormElt = document.getElementById("userForm");
                    // 可以在这里设置action,也可以不在这里.
                    userFormElt.action = "/web_war_exploded/register";
                    // 提交表单
                    userFormElt.submit();
                }
            }



        }
    </script>
    <title>注册页面</title>
</head>
<body>
<br><br><br><br><br><br><br><br><br><br><br>
<div id="div">
    <form class="form-horizontal" id="userForm" method="post">

        <div class="form-group">
            <div class="col-sm-4">

            </div>
            <label for="username" class="col-sm-1 control-label">用户名</label>
            <div class="col-sm-2">

                <input class="form-control" id="username" type="text" name="username" placeholder="请输入用户名" />
                <span id="usernameError"></span>

            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-4">

            </div>
            <label for="userpwd" class="col-sm-1 control-label">密码</label>
            <div class="col-sm-2">

                <input class="form-control" id="userpwd" type="password" name="userpwd" placeholder="请输入密码" />
                <span id="userpwdError"></span>

            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-4">

            </div>
            <label for="userpwdrepeat" class="col-sm-1 control-label">确认密码</label>
            <div class="col-sm-2">

                <input class="form-control" id="userpwdrepeat" type="password" placeholder="请再次输入密码" />
                <span id="userpwdError2"></span>

            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-4">

            </div>
            <label for="userPhone" class="col-sm-1 control-label">密码</label>
            <div class="col-sm-2">
                <input class="form-control" id="userPhone" type="text" name="userPhone" placeholder="请输入手机号" />
                <span>${error}</span>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-5">

            </div>
            <div class="col-sm-4">
                <button type="button" class="btn btn-success" id="submitbtn">注册</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                <input type="reset" class="btn btn-success" value="重置" />
            </div>
        </div>
    </form>
</div>
</body>
</html>
