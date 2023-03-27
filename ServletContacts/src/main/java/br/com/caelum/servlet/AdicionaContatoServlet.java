package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import br.com.caelum.servlet.dao.ContactDao;
import br.com.caelum.servlet.domain.Contact;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		try {

//			Pegando parâmetros do request
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String textDate = request.getParameter("birth");
//			Calendar dateOfBirth = null;

//			Fazendo conversão da data, String --> date

			LocalDate dateOfBirth = LocalDate.parse(textDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//			Date date = formatter.parse(textDate);

			// monta um objeto Contato
			Contact contact = new Contact(name, address, email, dateOfBirth);
			ContactDao.add(contact);
			System.out.println(dateOfBirth);

			// Imprime o nome do contato que foi adicionado
			out.println("<html>");
			out.println("<body>");
			out.println("Contato " + contact.getName() + " adicionado com sucsexo");
			out.println("Contatos salvos: " + ContactDao.getContacts());
			out.println("</html>");
			out.println("</body>");
//		} catch (ParseException e) {
//			System.out.println("Erro de conversão da data");
//			return;// para a execução do metodo

		} catch (NullPointerException e) {
			System.out.println("Sei lá pq deu esse erro mané");
		}

	}

}
