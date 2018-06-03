package app.servlets;

import app.models.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cats/create")
public class CreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsps/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("cat_name");
        String catBreed = req.getParameter("cat_breed");
        String catColor = req.getParameter("cat_color");
        int numberOfLegs = Integer.parseInt(req.getParameter("cat_legs"));
        Cat cat = new Cat(catName, catBreed, catColor, numberOfLegs);
        this.getServletConfig().getServletContext().setAttribute(catName, cat);
        resp.sendRedirect("/cats/profile?catName=" + cat.getName());
    }
}