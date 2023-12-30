<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
       <title>PASSENGER INFO</title>
</head>
<center>
<body  bgcolor="#40450F|64, 69, 15 65| 78%, 16%">
<h2>CONFIRM TICKETS</h2>
<form action="convert" method="post">
<pre>

        <input hidden type="text" name="id" value="${guest.id}">

First Name:<input type="text" name="fname" value="${guest.fname}">

Last Name:<input type="text" name="lname" value="${guest.lname}">

     From:<input type="text" name="fro" value="${guest.fro}">

       To:<input type="text" name="too" value="${guest.too}">

   Depart:<input type="date" name="depart" value="${guest.depart}">

   Return:<input type="date" name="ret" value="${guest.ret}">

Passenger:<input type="text" name="passen" value="${guest.passen}">

    Class:<input type="text"  name="clas" value="${guest.clas}">

    email:<input type="text" name="mail" value="${guest.mail}">

mobile no:<input type="text" name="mob" value="${guest.mob}">

          <input type="submit" value="SAVE PASSENGERS">
</pre>
</form>
</body>
</center>
</html>