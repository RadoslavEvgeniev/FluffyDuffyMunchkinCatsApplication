package app.servlets.ordersServlets;

import app.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/orders/all")
public class OrdersAllServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!((User)req.getSession().getAttribute("loggedInUser")).getRole().equals("ADMIN")) {
            resp.sendRedirect("/");
        }
        req.getRequestDispatcher("/WEB-INF/jsps/orders/all.jsp").forward(req, resp);
    }
}
