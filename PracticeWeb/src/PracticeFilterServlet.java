

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class PracticeFilterServlet
 */
@WebFilter("/PracticeFilterServlet")
public class PracticeFilterServlet implements Filter {
	@Override
	public void init(FilterConfig config) throws ServletException{}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException{
		chain.doFilter(request, response);
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(c.getTime()));
	}
	}
