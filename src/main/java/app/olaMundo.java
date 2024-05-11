package app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/OlaMundo")
public class olaMundo extends HttpServlet {

    private static Object serialVersionUID = 1L;

   public olaMundo() {

   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       PrintWriter out = response.getWriter();

       out.println("<html>");
       out.println("<head> <title> Minha primeira servlet</title> </head>");
       out.println("<body> ola mundo </body>");
       out.println("</html>");

   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      
   }





}
