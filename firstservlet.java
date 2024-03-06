import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/test", loadOnStartup=10)
public class firstservlet implements Servlet{

static{                           // it is the entry point becuase their is no main function ...... tomcat ko static se pt algega ye iska main function
    System.out.println("firstservlet.class file is loading");
    }
    public firstservlet(){
        System.out.println("firstservlet.class file is instantiate");

    }
public void init(ServletConfig Config) throws ServletException{
    System.out.println("firstservlet.class file is in initialization");
}   
public ServletConfig getServletConfig(){
    return null;
}
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
    System.out.println("firstservlet.class file is in process");
    response.setContentType("text/html");
    PrintWriter out =  response.getWriter();
    out.println("<html>");
    out.println("<head><title>Servlet Interface</title></head>");
    out.println("<body bgcolor=green>");
    out.println("<h1 style='color:red'><marquee>Welcome to Advanced Java</marquee></h1>");
    out.println("</body>");
    out.println("</html>");
    out.close();
}
public String getServletInfo(){
    return null;
}
public void destroy(){
    System.out.println("firstservlet.class file is reinstantiate");
}
}