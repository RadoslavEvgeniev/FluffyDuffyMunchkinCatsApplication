package app.servlets.ordersServlets;

import app.models.Cat;
import app.models.Order;
import app.models.User;
import app.repositories.CatRepository;
import app.repositories.OrderRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/orders/create")
public class OrdersCreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("catName");
        Cat cat = ((CatRepository)this.getServletContext().getAttribute("catRepository")).findCatByName(catName);
        User user = (User) req.getSession().getAttribute("loggedInUser");
        if (user == null) {
            resp.sendRedirect("/");
            return;
        }
        Order order = new Order(user, cat);

        ((OrderRepository)this.getServletContext().getAttribute("orderRepository")).addOrder(order);

        resp.sendRedirect("/");
    }
}
