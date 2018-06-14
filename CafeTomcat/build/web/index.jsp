<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="assets/css/main.css"> 	
    </head>
    <jsp:useBean id="dao" class="dao.DaoUtils"/>

    <body>
        <c:catch var="ex">
        <div id="page-wrapper">
            <jsp:include page="header.jsp" />
            <div class="navigation-bar">
                <a class="active" href="index.jsp">Home</a><a href="PageController">Online Store</a><a href="Find.jsp">Contact</a>
            </div>
            <br/>
            <div id="wrapper" >

                <section class="main col-9">
                    <c:set var="intro" value="${dao.getIntro(\"Intro\")}" />
                    <div class="row index-introduction">
                        <div class="index-introduction-img col-3">
                            <img src="${intro.imageUrl}" alt="Maria" />
                        </div>
                        <div class="index-introduction-paragraph col-9">
                            <h3><a href="About.jsp?type=intro">${intro.title}</a></h3>
                            <p>${intro.content}</p>
                        </div>


                    </div>

                    <div class="row index-product">
                        <c:forEach var="i" items="${dao.getTopTwoProducts()}" >
                            <div class="index-product-item col-6">
                                <img src="${i.imageUrl}" alt="" />
                                <h3><a href="About.jsp?id=${i.id}">${i.name}</a></h3>
                                <p>${i.description}</p>

                            </div>
                        </c:forEach>
                    </div>

                    <div class="row index-contact">
                        <h2>Visit my cafe</h2>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                        <p>Gammel Torv, Copenhagen</p>
                        <p>Phone:</p>
                    </div>

                </section>

                <section class="rightmenu col-3">

                    <section class="rightmenu-item">
                        <h3>Share this page</h3>
                        <p><a href="#" class="normal">Share on Facebook</a></p>
                        <p><a href="#" class="normal">Share on Twitter</a></p>
                        <p><a href="#" class="normal">Share on Google+</a></p>
                    </section>

                </section>



            </div>
                        <hr>
                        <jsp:include page="footer.jsp" />
        </div>
        </c:catch>
        <c:if test="${ex!=null}">
            <jsp:forward page="error.jsp" />
        </c:if>
    </body>
</html>
