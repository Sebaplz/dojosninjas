<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<div class="container mt-5">
    <h1>Bienvenido!</h1>
    <div class="d-flex justify-content-around mb-3">
        <a href="/dojos/new" class="mt-2">New Dojo</a>
        <a href="/ninjas/new" class="mt-2">New Ninja</a>
    </div>
    <div class="d-flex justify-content-around mb-3">
        <a href="/dojos" class="mt-2">Ver Dojos</a>
        <a href="/ninjas" class="mt-2">Ver Ninjas</a>
    </div>
</div>

