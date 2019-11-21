package Test1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ExFilterServlet implements Filter {

	int cnt = 0;
	//FilterChain chain = null;

	@Override
	public void init(FilterConfig conf) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String url = "toppage.jsp";
		String para = ((HttpServletRequest) request).getRequestURL().toString();

		if (para.contains("top")) {
			cnt++;
			/*
			RequestDispatcher dispatch = request.getRequestDispatcher(url);
			dispatch.forward(request, response);
			*/
		} else {
			if (cnt == 0) {
				cnt++;
				RequestDispatcher dispatch = request.getRequestDispatcher(url);
				dispatch.forward(request, response);
			}
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}
