<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    <link rel="stylesheet" href='<c:url value="/css/bootstrap/bootstrap.min.css"/>'>
    <link rel="stylesheet" href='<c:url value="/js/sweetalert/sweetalert2.min.css"/>'>
    <link rel="stylesheet" href='<c:url value="/css/styles.css"/>'>
    <title>Contactos</title>
</head>

<%@ include file="componentes/header.jsp" %>
<body>
   
  <!--Mensaje de alerta-->
    <div class="alert alert-info alert-dismissible fade show" role="alert">
        <p class="text-center"><strong>Bienvenido!</strong> Ahora puedes ver todos tus contactos en esta secci�n y hacer b�squedas para que accedas m�s rapido a ellos.</p>
    
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    
	<!-- Contenedor principal -->
    <section class="container">
        <!--Controles-->
        <div class="row justify-content-between" style="margin: 25px;">
            <div class="col-auto align-self-center">
                <button id="btnAgregar" class="btn btn-info" type="button">
                    <i class="fas fa-plus-circle" alt="agregar"></i>
                </button>
                <button class="btn btn-info" type="button">
                    <i class="fas fa-birthday-cake"></i>
                </button>
            </div>
            <div class="col-auto align-self-center">
                <form class="input-group" id="searchForm">
                    <input id="searchTxt" type="text" name="search" class="form-control" placeholder="Buscar contacto" aria-label="Buscar contacto" aria-describedby="button-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-info" type="submit" id="button-addon2" form="searchForm">
                                <i class="fas fa-search"></i>
                        </button>
                    </div>
                </form>
            </div>
        </div>

        <!--Grid View-->
        <div class="row justify-content-between mx-3">
            <div class="col">
                <div id="grid-contactos" class="contacts-container">
                    <!-- Las card de los contactos se generan de forma din�mica con JQuery-->
                </div>
            </div>
        </div>

        <!--Paginaci�n-->
        <div class="row fixed-bottom no-gutters justify-content-center" style="margin-bottom: 75px;">
            <div class="col-auto align-self-center">
                <nav class="col-auto align-self-center" aria-label="Page navigation example">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <li class="page-item page"><a class="page-link" href="#">1</a></li>
                        <li class="page-item page"><a class="page-link" href="#">2</a></li>
                        <li class="page-item page"><a class="page-link" href="#">3</a></li>
                        <li class="page-item page">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
                <p class="text-center text-muted" style="font-size: 13px">1 - 8 Contactos de 25</p>
            </div>
        </div>
    </section><!--Container-->
    
    <%@ include file="componentes/footer.jsp" %>
    <%@ include file="componentes/modal.jsp" %>

    <!--JS files-->
    <script src='<c:url value="/js/jquery/jquery-3.3.1.min.js"/>'></script>
    <script src='<c:url value="/js/popper/popper.min.js"/>'></script>
    <script src='<c:url value="/js/bootstrap/bootstrap.min.js"/>'></script>
    <script src='<c:url value="/js/sweetalert/sweetalert2.min.js"/>'></script>
    <script src='<c:url value="/js/contactos.js"/>'></script>
    
</body>
</html>