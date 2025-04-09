package com.asg.semiiserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2Q2 extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Request Information Servlet</title>");
      out.println("</head>");
      out.println("<body>");

      out.println("<h1>HTTP Request Information:</h1>");
      out.println("<hr>");
      out.println("<b>Request Method:</b> " + request.getMethod() + "<br>");
      out.println("<b>Request URI:</b> " + request.getRequestURI() + "<br>");
      out.println("<b>Request Protocol:</b> " + request.getProtocol() + "<br>");
      out.println("<b>IP Address:</b> " + request.getRemoteAddr() + "<br>");
      out.println("<b>Browser Type:</b> " + request.getHeader("User-Agent") + "<br>");

      out.println("<hr>");
      out.println("<h1>Server Information:</h1>");
      out.println("<hr>");
      out.println("<b>Server Name:</b> " + request.getServerName() + "<br>");
      out.println("<b>Server Port:</b> " + request.getServerPort() + "<br>");
      out.println("<b>Server Software:</b> " + request.getServletContext().getServerInfo() + "<br>");
      out.println("<b>Operating System:</b> " + System.getProperty("os.name") + "<br>");

      out.println("<hr>");
            out.println("</body>");
      out.println("</html>");
   }
}