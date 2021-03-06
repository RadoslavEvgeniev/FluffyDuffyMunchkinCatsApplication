package app.servlets.catsServlets;

import app.models.Cat;
import app.models.User;
import app.repositories.CatRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cats/create")
public class CatsCreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!((User) req.getSession().getAttribute("loggedInUser")).getRole().equals("ADMIN")) {
            resp.sendRedirect("/");
            return;
        }
        req.getRequestDispatcher("/WEB-INF/jsps/cats/create.jsp").forward(req, resp);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("cat_name");
        String catBreed = req.getParameter("cat_breed");
        String catColor = req.getParameter("cat_color");
        int numberOfLegs = Integer.parseInt(req.getParameter("cat_legs"));
        User creator = (User) req.getSession().getAttribute("loggedInUser");
        Cat cat = new Cat(catName, catBreed, catColor, numberOfLegs, creator);

        ((CatRepository)this.getServletContext().getAttribute("catRepository")).addCat(cat);
        resp.sendRedirect("/cats/profile?catName=" + cat.getName());
    }
}
