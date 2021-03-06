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
        <c:forEach items="${tickets}" var="ticket">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h4>Flight Number - ${ticket.flight.flightNumber}</h4>
                        <h4>From - ${ticket.flight.fromAirport.name}</h4>
                        <h4>To - ${ticket.flight.toAirport.name}</h4>
                        <h4>Bought Date - ${ticket.issueDate}</h4>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
