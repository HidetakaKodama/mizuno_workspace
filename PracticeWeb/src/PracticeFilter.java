

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticeFilter
 */
@WebServlet("/PracticeFilter")
public class PracticeFilter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("実行");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>hello</title></head>");
		out.println("<body>");
		out.println("HelloWorld!!");
		out.println("</body>");
		out.println("</html>");
	}

}
