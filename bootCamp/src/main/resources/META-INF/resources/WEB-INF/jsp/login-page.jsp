<%@ include file="common/header.jspf" %>
<%@ include file="common/navbar.jspf" %>
<form method="post">

Login <input type="username" name="username">
Password <input type="password" name="password">
<input type="submit">
<h1>${user_name}</h1>
</form>

<%@ include file="common/footer.jspf" %>