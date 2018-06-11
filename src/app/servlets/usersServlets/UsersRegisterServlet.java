package app.servlets.usersServlets;

import app.models.User;
import app.repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/register")
public class UsersRegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsps/users/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String confirmPassword = req.getParameter("confirm_password");

        if (!confirmPassword.equals(password)) {
            resp.sendRedirect("/users/register");
            return;
        }

        User user = new User(username, password);
        try {
            ((UserRepository)this.getServletContext().getAttribute("userRepository")).addUser(user);
        } catch (IllegalArgumentException iae) {
            resp.sendRedirect("/users/register");
            return;
        }

        resp.sendRedirect("/users/login");
    }
}
