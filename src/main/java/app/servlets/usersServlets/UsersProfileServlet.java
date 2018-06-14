package app.servlets.usersServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/profile")
public class UsersProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("loggedInUser") == null) {
            resp.sendRedirect("/");
            return;
        }
        req.getRequestDispatcher("/WEB-INF/jsps/users/profile.jsp").forward(req, resp);
    }
}
