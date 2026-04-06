package comtest;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/AysncServlet", asyncSupported = true)
public class AysncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final long startTime = System.nanoTime();
		
		final AsyncContext asyContext = request.startAsync(request, response);
		
		new Thread() {
			
			@Override
			public void run()
			{
				try
				{
					ServletResponse response = asyContext.getResponse();
					
					response.setContentType("text/plain");
					
					PrintWriter out = response.getWriter();
					
					Thread.sleep(2000);
					
					out.println("Work completed. Time elapsed : "+(System.nanoTime() - startTime));
					
					out.flush();
					
					asyContext.complete();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}.start();
		
	}

}
