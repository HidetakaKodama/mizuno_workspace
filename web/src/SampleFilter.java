

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleFilter implements Filter {
	@Override
	public void init(FilterConfig fConfig) throws ServletException {}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException,ServletException{
		System.out.println("全処理実行");
		chain.doFilter(request, response);
		System.out.println("後処理実行");
	}
	@Override
	public void destroy() {}
}
