<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<div class="container mt-5">
    <div class="d-flex justify-content-around mb-3">
        <a href="/" class="mt-2">Dashboard</a>
    </div>
    <div>
        <table class="table table-striped border border-1">
            <thead>
                <tr class="table-secondary">
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${ninjas}" var="ninja">
                <tr>
                    <td>${ninja.firstName}</td>
                    <td>${ninja.lastName}</td>
                    <td>${ninja.age}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

