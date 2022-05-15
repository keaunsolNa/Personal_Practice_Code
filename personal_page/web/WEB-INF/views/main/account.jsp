<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div id="wrap">
        <h1 align="center">회원 가입</h1>      
        <form action="${ pageContext.servletContext.contextPath }/dbeloper/select/Account" method="post">
            <table style="margin:auto">    
                <tr>
                    <td><label>이름</label></td>
                    <td><input type="text" name="name" id="name" required></td>
                    <td><label id="nameresult"></label></td>
                </tr>
                <tr>
                    <td><label>아이디</label></td>
                    <td><input type="text" name="userId" id="userId" required></td>
                    <td><input type="button" value="중복확인"></td>
                </tr>
                <tr>
                    <td><label>비밀번호</label></td>
                    <td><input type="password" name="password" id="password" required></td>
                </tr>
                <tr>
                    <td><label>비밀번호 확인</label></td>
                    <td><input type="password" name="password2" id="password2" required></td>
                    <td><label id="pwdresult"></label></td>
                </tr> 
                <tr>
                    <td><label>전화번호</label></td>
                    <td><input type="text" name="phone" id="phone" required placeholder="-포함"></td>
                    <td></td>
                </tr>
                <tr>
                    <td><label>주소</label></td>
                    <td><input type="text" name="address" id="address" required></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="reset">&nbsp;<button type = "submit">제출</button>  </td>
                    <td></td>
                </tr>
            </table>
        </form>
    </div>
<!--     <script>
        $(function(){
          
            $("#name").focus(function(){
                console.log("FOCUS");
            }).blur(function(){
                console.log("BLUR");
            }).change(function(){

                console.log("CHANGE");
            }).select(function(){
                console.log("SELECT");
            });            

            $("td").focusin(function(){
                console.log("FOCUSIN");
                $(this).css("background", "beige");
                $(this).children().css("background", "yellow");
            }).focusout(function(){
                console.log("FOCUSOUT");
                $(this).css("background", "white");
                $(this).children().css("background", "white");
            });
       
            $("#name").change(function(){

                var regExp = /^[가~힣]{2,}$/;               

                if(regExp.test($(this).val())){            
                    $("#nameresult").text("정상입력").css("color", "green")
                } else {
                    $("#nameresult").text("한글로 2자 이상 입력하세요").css("color", "red");
                    $(this).val('');
                }
            });

            $("#pwd2").change(function(){                  
                if($('#pwd1').val() != $(this).val()){    
                    $("#pwdresult").text("비밀번호가 일치하지 않습니다.").css("color", "red");
                } else {
                    $("#pwdresult").text("비밀번호가 일치").css("color", "green");
                }
            });

            $("#pwd1").change(function(){                 
                if($('#pwd2').val() != $(this).val()){    
                    if(!($("#pwd2").val().length == 0))   
                    $("#pwdresult").text("비밀번호가 일치하지 않습니다.").css("color", "red");
                } else {
                    $("#pwdresult").text("비밀번호가 일치").css("color", "green");
                }
            });

        });
    </script> -->

</body>
</html>