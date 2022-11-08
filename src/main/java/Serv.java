import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns={"/patients","/doctors"},loadOnStartup = 1)

public class Serv extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        switch(req.getServletPath()) {
            case "/patients":
                resp.getWriter().write("This patients page");
                break;
            case "/doctors":
                resp.getWriter().write("This is doctor page");
                break;
            default:
                resp.getWriter().write("I don't know how you found this... "+req.getServletPath());
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
