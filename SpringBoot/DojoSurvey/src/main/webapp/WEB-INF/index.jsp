<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Counter</title>
	</head>
	<body style="text-align:center">
		<div>
        <form action="/survey" method="post">
            <table>
                <tr>
                    <th style="text-align:center" colspan="2"> My Registration Form </th>
                </tr>
                <tr>
                    <td><label for="name">Name:</label></td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td><label>Location:</label></td>

                    <td><select name="location">
                        <option value="Seattle">Seattle</option>
                        <option value="Washington DC">Washington DC</option>
                        <option value="Dallas">Dallas</option>
                        <option value="Los Angeles">Los Angeles</option>
                    </select></td>
                </tr>
                <tr>
                    <td><label>Favorite Language:</label></td>
                    <td><select name="language" class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"><span class="caret"></span>
                        <option value="Javascript" class="dropdown-menu">Javascript</option>
                        <option value="Java" class="dropdown-menu" >Java</option>
                        <option value="PHP" class="dropdown-menu">Php</option>
                        <option value="Python" class="dropdown-menu">Python</option>
                    </select></td>
                </tr>

                <tr>
                    <td colspan="2"><label for="desc">A short descriprion about yourself:</label></td>
                </tr>
                <tr>
                    <td colspan="2"><textarea name="description" rows="4" cols="40" id="desc"></textarea></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" id="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        </div>
	</body>
</html>