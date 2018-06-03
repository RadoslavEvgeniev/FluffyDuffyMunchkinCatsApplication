package app.servlets;

import app.models.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/cats/create")
public class CreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsps/create.jsp").forward(req, resp);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String catName = req.getParameter("cat_name");
        String catBreed = req.getParameter("cat_breed");
        String catColor = req.getParameter("cat_color");
        int numberOfLegs = Integer.parseInt(req.getParameter("cat_legs"));
        Cat cat = new Cat(catName, catBreed, catColor, numberOfLegs);
        if (this.getServletConfig().getServletContext().getAttribute("cats") == null) {
            this.getServletConfig().getServletContext().setAttribute("cats", new HashMap<String, Cat>());
        }
        Map<String, Cat> cats = (Map<String, Cat>) this.getServletConfig().getServletContext().getAttribute("cats");
        cats.putIfAbsent(cat.getName(), cat);
        this.getServletConfig().getServletContext().setAttribute("cats", cats);
        resp.sendRedirect("/cats/profile?catName=" + cat.getName());
    }
}
