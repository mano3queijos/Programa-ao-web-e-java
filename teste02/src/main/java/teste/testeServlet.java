package teste;

import java.io.IOException;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testeServlet")
public class testeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String repetir = req.getParameter("repetir");
		Integer numeroRepetir = Integer.parseInt(repetir);

		System.out.println(numeroRepetir);
		req.setAttribute("qtd", numeroRepetir);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("./repete.jsp");
		requestDispatcher.forward(req, resp);
	}

}
