

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReminderServlet
 */
@WebServlet("/ReminderServlet")
public class ReminderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter our = response.getWriter();
		ServletContext ctx = getServletContext();
		RequestDispatcher rd = ctx.getRequestDispatcher("/reminder.jsp");
		rd.forward(request, response);

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		int int1 = Integer.parseInt(request.getParameter("int1"));
		int int2 = Integer.parseInt(request.getParameter("int2"));
		int result = int1 % int2;
		request.setAttribute("result",result);

		request.setAttribute("int1", int1);
		request.setAttribute("int2", int2);
		request.setAttribute("result", result);


	}

}
