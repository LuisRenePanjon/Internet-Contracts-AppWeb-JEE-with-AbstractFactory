package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AsesorDAO;
import dao.DAOFactory;
import modelo.Asesor;

/**
 * Servlet implementation class InicioSesion
 */
@WebServlet("/InicioSesion")
public class InicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String correo, contrasenia,url;
			correo = request.getParameter("correo");
			contrasenia = request.getParameter("contrasenia");
			AsesorDAO asesorDAO = DAOFactory.getFactory().getAsesorDAO();
			Asesor asesor = asesorDAO.readByCorreo(correo);
			if(asesor != null) {
				if(correo.equals(asesor.getCorreo()) && contrasenia.equals(asesor.getContrasenia())){
					url = "/formulario.jsp";
					HttpSession sesion = request.getSession();
					sesion.setAttribute("nombre", asesor.getNombres());
					getServletContext().getRequestDispatcher(url).forward(request, response);
					System.out.println(asesor.toString());
					
				}else {
					
					response.sendRedirect("index.jsp");
					
				}
				
				
			}else {
				response.sendRedirect("index.jsp");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Mensaje" + e.getMessage());
			response.sendRedirect("index.jsp");
		}
	}

}
