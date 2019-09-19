<%-- 
    Document   : editnote
    Created on : 19-Sep-2019, 12:35:34 PM
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
        <form action="note" method="post">
            <h2>View Note</h2>
            <b>Title: </b><input type="text" name="title" value="${note.title}">
            <br>
            <b>Contents:</b><br>
            <textarea name="content" row="4" cols="30">${note.contents}</textarea>
            <br>
            <input type="submit" value="Save">
            
        </form>
    </body>
</html>
