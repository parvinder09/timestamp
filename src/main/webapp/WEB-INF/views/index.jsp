<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet" />
</head>
<body>
<div class="container">
<h2>API Basejump: Timestamp microservice</h2>
<blockquote>
    User Stories:
    <ul>
        1) I can pass a string as a parameter, and it will check to see whether that string contains either a unix timestamp or a natural language date (example: January 1, 2016)
    </ul>
    <ul>
        2) If it does, it returns both the Unix timestamp and the natural language form of that date.
    </ul>
    <ul>
        3) If it does not contain a date or Unix timestamp, it returns null for those properties.
    </ul>
</blockquote>
<h3>Example Usage:</h3>
<code >
    http://localhost:8085/timestamp/December%2015,%202015
</code>
<br>
<code>
    http://localhost:8085/timestamp/1450137600
</code>
<h3>Example Output:</h3>
<code >
    {"unixdate":1450137600,"naturalTimestamp":"Tue Dec 15 05:30:00 IST 2015"}
</code>
</div>
</body>
</html>
