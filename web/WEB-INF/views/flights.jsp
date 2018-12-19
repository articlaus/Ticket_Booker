<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Members</title>
</head>
<body>


<section class="container">
    <div class="row">
        <c:forEach items="${flights}" var="flight">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h4>Flight Number - ${flight.flightNumber}</h4>
                        <h4>From - ${flight.fromAirport.name}
                            <h4>To - ${flight.toAirport.name}
                                <a href="<spring:url value="/flight/${flight.id}" />"
                                   class="btn btn-primary  btn-mini  ">Book Flight</a>
                            </h4>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
