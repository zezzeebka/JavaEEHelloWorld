<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <script>
    // JavaScript код для перехода на сервлет при загрузке страницы
    window.onload = function() {
      window.location.href = "<%= request.getContextPath() %>/hello-servlet";
    };
  </script>
</head>
<body>
<!-- Нет необходимости в теге <div>, если страница сразу переходит -->
</body>
</html>