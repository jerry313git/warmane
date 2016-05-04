<%@ page import="com.warmane.dao.RoleDao"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="//cdn.bootcss.com/jquery/1.12.1/jquery.js"></script>
<title>Insert title here</title>
	<style type="text/css">
	#divTb {
		width: 800px;
		border: 1px solid #aaa;
		margin: 0 auto;
	}
	
	.even {
		background: #CCCCCC;
	}
	
	.odd {
		background: #FFFFFF;
	}
	</style>
	
	<script type="text/javascript">

        //获取发布模块类型
        function getRoles() {
            $.ajax({
                type: "POST",
                data: $("#getRoleForm").serialize(),
                success: function(json) {
                	alert(11);
                    $.each(json, function(i, n) {
                        var tbBody = "";
                        var trColor;
                        if (i % 2 == 0) {
                            trColor = "even";
                        }
                        else {
                            trColor = "odd";
                        }
                        tbBody += "<tr class='" + trColor + "'><td>" + n.name + "</td></tr>";
                        $("#myTb").append(tbBody);
                    });
                },
                error: function(json) {
                    alert("加载失败");
                }
            });
            
            return false;
        }

    </script>
	

</head>
<body>
	<center>
		<form id="getRoleForm" action="getRole" onsubmit="getRoles()">
			请输入角色姓名:<input type="text" name="name">
			<input type="submit" value="确定">  
		</form>
		
		 <div id="divTb">
	        <table id="myTb" style=" width:100%">
	        </table>
    	</div>
    
	</center>
</body>
</html>
