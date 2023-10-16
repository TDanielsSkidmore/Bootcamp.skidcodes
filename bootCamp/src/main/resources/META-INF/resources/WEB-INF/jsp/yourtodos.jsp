<%@ include file="common/header.jspf" %>
<%@ include file="common/navbar.jspf" %>

<h1>Your Todos</h1>

<table class="table">
	<thead>
		<tr>
			<th>Name</th>
			<th>deadline</th>
			<th>Is done?</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.name }</td>
				<td>${todo.deadline }</td>
				<td>${todo.done }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>



<%@ include file="common/footer.jspf" %>