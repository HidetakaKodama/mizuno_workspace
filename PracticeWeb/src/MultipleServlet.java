

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleServlet
 */
@WebServlet("/MultipleServlet")
public class MultipleServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String num1 = request.getParameter("value1");
		String num2 = request.getParameter("value2");
		int num1_i = Integer.parseInt(num1);
		int num2_i = Integer.parseInt(num2);
		int result = num1_i * num2_i;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>掛け算結果!!</title></head>");
		out.println("<body>");
		out.println("掛け算の結果は" + result + "です!!");
		out.println("</body>");
		out.println("</html>");
	}
}
