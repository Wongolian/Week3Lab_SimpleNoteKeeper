<%-- 
    Document   : viewnote
    Created on : 19-Sep-2019, 12:35:23 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <form action="note" method="get">
            <h2>View Note</h2>
            <b>Title: </b><span>${note.title}</span>
            <br>
            <b>Contents: </b>
            <span>${note.contents}</span>
            <br>
            <br>
            <a href="?edit">Edit</a>
        </form>
    </body>
</html>
