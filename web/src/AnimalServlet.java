

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnimalServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String[] animal = request.getParameterValues("animal");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>結果表示画面</title></head>");
		out.println("<body>");
		if (animal != null) {
			out.println("選択されたのは以下です。<br>");
			for(int i = 0; i < animal.length; i++) {
				out.println(animal[i] + "<br>");
			}
		} else {
			out.println("選択されていません");
		}
		out.println("</body>");
		out.println("</html>");

	}

}
