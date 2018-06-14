package app.servlets.usersServlets;

import app.models.User;
import app.repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/login")
public class UsersLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsps/users/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user_name");
        String password = req.getParameter("user_password");

        User user = ((UserRepository)this.getServletContext().getAttribute("userRepository")).findByUsername(username);

        if (user == null || !user.getPassword().equals(password)) {
            resp.sendRedirect("/users/register");
            return;
        }

        req.getSession().setAttribute("loggedInUser", user);

        resp.sendRedirect("/");
    }
}
