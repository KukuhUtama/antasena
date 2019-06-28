<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html lang="en">

<head>
    <title>Antasena Reporting App</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="description" content="Mega Able Bootstrap admin template made using Bootstrap 4 and it has huge amount of ready made feature, UI components, pages which completely fulfills any dashboard needs." />
      <meta name="keywords" content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
      <meta name="author" content="codedthemes" />
      <link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>" type="image/x-icon">
      <link rel="stylesheet" href="<c:url value="/resources/pages/waves/css/waves.min.css"/>" type="text/css" media="all">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap/css/bootstrap.min.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/pages/waves/css/waves.min.css"/>" type="text/css" media="all">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/icon/themify-icons/themify-icons.css"/>">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/icon/font-awesome/css/font-awesome.min.css"/>">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/icon/icofont/css/icofont.css"/>">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/jquery.mCustomScrollbar.css"/>">
      
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	  <meta http-equiv="Content-Language" content="in" />
	  <script type="text/javascript">
	  var contextApp = "";
	  $(document).ready(function() {
		contextApp = '${pageContext.request.contextPath}';		
		
	  });
</script>
</head>
<body>
    <t:insertAttribute name="header" />
    <script type="text/javascript" src="<c:url value="/resources/js/jquery/jquery.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-ui/jquery-ui.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/popper.js/popper.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/pages/waves/js/waves.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-slimscroll/jquery.slimscroll.js"/>"></script>
    <script src="<c:url value="/resources/pages/waves/js/waves.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/modernizr/modernizr.js"/>"></script>
    <script src="<c:url value="/resources/js/pcoded.min.js"/>"></script>
    <script src="<c:url value="/resources/js/vertical-layout.min.js"/>"></script>
    <script src="<c:url value="/resources/js/jquery.mCustomScrollbar.concat.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap/js/bootstrap-datepicker.js"/>"></script>
</body>

</html>