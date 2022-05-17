

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CountryDao;
import entity.Country;

/**
 * Servlet implementation class PopulationSearchServlet
 */
@WebServlet("/PopulationSearchServlet")
public class PopulationSearchServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String popStr = request.getParameter("population");
		int population = Integer.parseInt(popStr);
		CountryDao dao = new CountryDao();
		Country country = dao.searchById(population);
		request.setAttribute("population", population);
		request.setAttribute("country", country);
		RequestDispatcher rd = request.getRequestDispatcher("/populationSearchResult.jsp");
		rd.forward(request, response);
	}

}
