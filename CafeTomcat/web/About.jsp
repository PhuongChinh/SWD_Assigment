<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="assets/css/main.css"> 	
    </head>
    <body>
        <c:catch var="ex">
        <jsp:useBean id="dao" class="dao.DaoUtils"/>
        <div id="page-wrapper">
            <jsp:include page="header.jsp" />
            <div class="navigation-bar">
                <a href="index.jsp">Home</a><a class="active" href="PageController">Online Store</a><a href="Find.jsp">Contact</a>
            </div>

            <br/>
            <div id="wrapper" >

                <div class="main col-9">
                    <c:if test="${param.id != null}" var="t">
                        <c:set var="product" value="${dao.getProduct(param.id)}" />
                        <h2>${product.name}</h2>
                        <div class="about-detail">
                            <img class="col-6" src="${product.imageUrl}" alt="" />
                            <p>${product.description}</p>
                        </div>
                    </c:if>
                    <c:if test="${!t}">
                        <c:if test="${param.type != null}">
                            <c:set var="about" value="${dao.getIntro(\"Intro\")}" />
                            <h2>${about.title}</h2>
                            <div class="about-detail">
                                <img class="col-6" src="${about.imageUrl}" alt="" />
                                <p>${about.content}</p>
                            </div>
                        </c:if>
                            <c:if test="${param.type == null}">
                                <c:forEach var="product" items="${list}">
                                    <div class="pro">
                                    <h2>${product.name}</h2>
                                    <div class="about-detail">
                                        <img class="col-6" src="${product.imageUrl}" alt="" />
                                        <p>${product.description}</p>
                                        <h3>Price: $${product.price}</h3>
                                    </div>
                                    
                                    </div>
                                </c:forEach>
                            </c:if>
                    </c:if>
                    

                <c:forEach var="p" begin="1" end="${totalPage}" >
                    <c:if test="${p!=param.page}">
                        <c:if test="${p==1 && param.page==null}" var="tt">
                            <span class="active">${p}</span>
                        </c:if>
                        <c:if test="${!tt}">
                            <a href="PageController?page=${p}">${p}</a>
                        </c:if>
                    </c:if>
                    <c:if test="${p==param.page}">
                        <span class="active">${p}</span>
                    </c:if>
                </c:forEach>
                </div>
                <div class="rightmenu col-3">

                    <div class="rightmenu-item">
                        <h3>Share this page</h3>
                        <p><a href="#" class="normal">Share on Facebook</a></p>
                        <p><a href="#" class="normal">Share on Twitter</a></p>
                        <p><a href="#" class="normal">Share on Google+</a></p>
                    </div>

                </div>
                
            </div>
            <hr>
            <jsp:include page="footer.jsp" />
            </c:catch>
        <c:if test="${ex!=null}">
            <jsp:forward page="error.jsp" />
        </c:if>
    </body>
</html>
