
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet実行");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Hello</title></head>");
		out.println("<body>");
		out.println("Hello Servlet!");
		out.println("</body>");
		out.println("</html>");
	}
}
