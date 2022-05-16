

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession(true);
		String home = request.getParameter("home");
		String hobby = request.getParameter("hobby");

		session.setAttribute("home", home);
		request.setAttribute("hobby", hobby);

		RequestDispatcher rd = request.getRequestDispatcher("/addressHobby1.jsp");
		rd.forward(request, response);
	}

}
