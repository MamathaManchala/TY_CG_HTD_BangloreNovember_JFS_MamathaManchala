<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<form action="./register" method="post">
		<fieldset>
			<legend>Employee Details</legend>
			<table>

				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="text" name="password"></td>
				</tr>

			</table>
		</fieldset>
		<fieldset>
			<legend>Employee Address Details 1</legend>
			<table>
				<tr>
					<td>Address Type :</td>
					<td><select name="addressBeans[0].addType">
							<option>----------select--------</option>
							<option value="P">Permanant</option>
							<option value="T">Temporary</option>

					</select></td>
				<tr>
					<td>Address 1:</td>
					<td><input type="text" name="addressBeans[0].add1"></td>
				</tr>

				<tr>
					<td>Address2:</td>
					<td><input type="text" name="addressBeans[0].add2"></td>
				</tr>

			</table>

		</fieldset>

		<fieldset>
			<legend>Employee Address Details 2</legend>
			<table>
				<tr>
					<td>Address Type:</td>
					<td><select name="addressBeans[1].addType">
							<option>----------select--------</option>
							<option value="P">Permanant</option>
							<option value="T">Temporary</option>

					</select></td>
				<tr>
					<td>Address 1:</td>
					<td><input type="text" name="addressBeans[1].add1"></td>
				</tr>

				<tr>
					<td>Address 2:</td>
					<td><input type="text" name="addressBeans[1].add2"></td>
				</tr>


			</table>

		</fieldset>
		<table>
			<tr>
				<td><input type="submit" name="register" value="register"></td>
			</tr>
		</table>
	</form>




</body>
</html>