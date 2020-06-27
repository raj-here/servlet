package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out=resp.getWriter(); 
	    out.println("<p>filter 1 is invoked before </p>");  
		
		System.out.println("filter 1 is invoked before");

		chain.doFilter(req, resp);// sends request to next resource

		System.out.println("filter 1 is invoked after");
	}

	public void destroy() {
	}
}