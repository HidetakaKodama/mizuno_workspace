

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReminderServlet
 */
//@WebServlet("/ReminderServlet")
public class ReminderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		float int1 = 0;
		float int2 = 0;
		float resultNum;

		try {
			int1 = Float.parseFloat(request.getParameter("int1"));
			int2 = Float.parseFloat(request.getParameter("int2"));
			resultNum = int1 % int2;
		} catch (NumberFormatException e) {
			resultNum = 0;
		}

		request.setAttribute("int1", int1);
		request.setAttribute("int2", int2);
		request.setAttribute("resultNum", resultNum);

		getServletConfig().getServletContext().
		getRequestDispatcher("/reminder.jsp").forward(request, response);

//		PrintWriter our = response.getWriter();
//		ServletContext ctx = getServletContext();
//		RequestDispatcher rd = ctx.getRequestDispatcher("/reminder.jsp");
//		rd.forward(request, response);
//
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//
//		int int1 = Integer.parseInt(request.getParameter("int1"));
//		int int2 = Integer.parseInt(request.getParameter("int2"));
//		int result = int1 % int2;
//		request.setAttribute("result",result);
//
//		request.setAttribute("int1", int1);
//		request.setAttribute("int2", int2);
//		request.setAttribute("result", result);


	}

}
