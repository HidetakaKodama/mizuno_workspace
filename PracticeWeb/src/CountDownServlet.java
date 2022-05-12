

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountDownServlet")
public class CountDownServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>カウント</title></head>");
		out.println("<body>");
		for(int i = 10; i >= 0; i--) {
			out.println(i);
			out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
