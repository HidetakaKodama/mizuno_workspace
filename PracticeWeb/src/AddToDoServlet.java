

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToDoServlet
 */
@WebServlet("/AddToDoServlet")
public class AddToDoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String[] array = request.getParameterValues("array");
		session.setAttribute("array", array);
		RequestDispatcher rd = request.getRequestDispatcher("/todoList.jsp");
		rd.forward(request, response);
	}

}
