package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servicioWeb")
public class servicioWeb extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String usuario = req.getParameter("txtUsuario");
        String clave = req.getParameter("txtClave");
        
        
        try(PrintWriter out = resp.getWriter();){
            out.print("El usuario enviado es: "+usuario);
            out.print("<br>");
            out.print("La clave enviada es: "+clave);
        }
    }
    
}
