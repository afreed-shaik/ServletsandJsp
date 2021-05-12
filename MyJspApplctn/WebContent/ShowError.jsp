<HTML>
<BODY>
<%@ page isErrorPage="true" %>
<h4> This is ShowErrors.jsp page showing the errors of ErrorPage.jsp</h4>
The following errors occurred:<hr>
<%exception.printStackTrace(new java.io.PrintWriter(out)); %>
</BODY>
</HTML>