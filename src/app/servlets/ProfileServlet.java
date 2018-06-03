package app.servlets;

import app.models.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/cats/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    @SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Cat> allCats = (Map<String, Cat>) this.getServletConfig().getServletContext().getAttribute("cats");
        Cat currentCat = allCats.get(req.getQueryString().split("=")[1]);
        req.setAttribute("currentCat", currentCat);
        req.getRequestDispatcher("/WEB-INF/jsps/profile.jsp").forward(req, resp);
    }
}
