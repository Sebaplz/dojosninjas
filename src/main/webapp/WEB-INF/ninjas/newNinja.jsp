<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<div class="container mt-5">
 <div class="d-flex justify-content-end">
        <a href="/" class="ms-3 fs-3">Dashboard</a>
    </div>
    <form:form action="/ninjas/new" method="post" modelAttribute="ninja" class="mt-5">
            <p class="d-flex justify-content-between mx-3">
                <form:label path="dojo" class="fs-5">Dojo:</form:label>
                <form:errors path="dojo" class="text-danger"/>
                <form:select path="dojo">
                    <c:forEach items="${dojos}" var="d">
                        <form:option value="${d.id}">${d.name}</form:option>
                    </c:forEach>
                </form:select>
            </p>
            <p class="d-flex justify-content-between mx-3">
                <form:label path="firstName" class="fs-5">First Name:</form:label>
                <form:errors path="firstName" class="text-danger"/>
                <form:input path="firstName"/>
            </p>
            <p class="d-flex justify-content-between mx-3">
                <form:label path="lastName" class="fs-5">Last Name:</form:label>
                <form:errors path="lastName" class="text-danger"/>
                <form:input path="lastName"/>
            </p>
            <p class="d-flex justify-content-between mx-3">
                <form:label path="age" class="fs-5">Age:</form:label>
                <form:errors path="age" class="text-danger"/>
                <form:input path="age"/>
            </p>
            <div class="d-flex justify-content-end me-3">
                <input type="submit" value="Create" class="btn btn-primary"/>
            </div>
        </form:form>
    </div>
</div>

