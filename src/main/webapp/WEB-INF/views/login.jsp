<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!doctype html>
<html xmlns:ng="http://angularjs.org" class="ng-app:falafel" id="ng-app" ng-app="falafel">
  <head>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="resources/images/favicon.ico" type="image/x-icon">
    <c:import url="/WEB-INF/views/css.jsp"></c:import>          
    <c:import url="/WEB-INF/views/login-javascript.jsp"></c:import>
  </head>
  
  <body>
    <div id="wrapper">
      <div ng-view class="generalContainer container"></div>
    </div>    
  </body>
  
</html>
