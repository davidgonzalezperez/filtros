

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerCookies
 */
@WebServlet("/VerCookies")
public class VerCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Llamando a ver Cookies");
		Cookie cookie1= new Cookie("cookie1", "ValordeCookie");
		cookie1.setMaxAge(31536000);
	response.addCookie(cookie1);
	
	Cookie [] cookies=request.getCookies();
	if(cookies != null) {
		for (int  i=0; i<cookies.length;i++){
		Cookie cookie =cookies[i];
		String nombre = cookie.getName();
		String valor = cookie.getValue();
		System.out.println("cookie: nombre" + nombre +" valor" + valor);
		
	}
	}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
