package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EnvioFormulario
 */
@WebServlet("/EnvioFormulario")
public class EnvioFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		System.out.println("Atributo de sesion: " + (String) session.getAttribute("nombre"));
		if (session.getAttribute("nombre") == null) {
			response.sendRedirect("index.jsp");
			System.out.println("esta cogiendo null");
		} else {
			System.out.println("hasta aqui estamos bien");
		}
		
		
		
	}

}
