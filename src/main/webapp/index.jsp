<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <script>
    window.onload = function() {
      window.location.href = "<%= request.getContextPath() %>/hello-servlet";
    };
  </script>
</head>
<body>
</body>
</html>