<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="divhead">
	<table cellspacing="0" class="headtable">
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/index.jsp">
					<img src="${pageContext.request.contextPath}/client/images/logo.png" width="250" height="60" border="0" /> 
				</a>
			</td>
			<td style="text-align:right">
				<img src="${pageContext.request.contextPath}/client/images/cart.gif" width="28" height="25" style="margin-bottom:-4px" />&nbsp;<a href="${pageContext.request.contextPath}/client/cart.jsp"><font size='2'>购物车</font></a> 
				<font size='2'>|</font> <a href="#"><font size='2'>帮助中心</font></a> 
				<font size='2'>|</font> <a href="${pageContext.request.contextPath}/myAccount"><font size='2'>我的帐户</font></a>
				<font size='2'>|</font> <a href="${pageContext.request.contextPath}/client/register.jsp"><font size='2'>新用户注册</font></a>							
<%-- 				<br><br><br>欢迎您： ${user.username} --%>
			</td>		
		</tr>

	</table>
</div>