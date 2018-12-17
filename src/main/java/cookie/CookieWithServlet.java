package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieWithServlet")
public class CookieWithServlet extends HttpServlet{
	
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	Cookie cookie1 = new Cookie("arkadas1", "elif yildirim");
	Cookie cookie2 = new Cookie("arkadas","zehra yilmaz");
	
	//15 sn  boyunca tarayıcıda bulunacak sonra silinecek
	cookie2.setMaxAge(15);
	
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
	response.addHeader("Set-Cookie","arkadas3=esin yaprak");
	
	Cookie [] cookies= request.getCookies();
	if (cookies  !=null) {
		for (Cookie c:cookies) {
			System.out.println("Cookie Adı :" + c.getName() +"Cookie degeri :" 
					+ c.getValue());
		}
	
		
	}
}
}