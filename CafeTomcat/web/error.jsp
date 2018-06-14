<%-- 
    Document   : error
    Created on : Oct 31, 2017, 9:31:43 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="assets/css/main.css"> 	
        <title>Error Page</title>
    </head>
    <body>
        <div id="page-wrapper">
            <jsp:include page="header.jsp" />
            <div id="wrapper" >
                <h3>Something wrong happened</h3>
                ${error}
            </div>
            <hr>
            <jsp:include page="footer.jsp" />
        </div>
    </body>
</html>
