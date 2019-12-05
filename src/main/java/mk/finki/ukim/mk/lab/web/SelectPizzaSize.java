package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.model.Order;
import mk.finki.ukim.mk.lab.model.Pizza;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet( urlPatterns = "/selectPizzaSize")
public class SelectPizzaSize extends HttpServlet {


    private final SpringTemplateEngine springTemplateEngine;

    public SelectPizzaSize(SpringTemplateEngine springTemplateEngine) {
        this.springTemplateEngine = springTemplateEngine;


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        resp.setContentType("text/html; charset=UTF-8");
        String pizzaType = req.getParameter("pizza");
        HttpSession session = req.getSession();
        Order ord = new Order();
        ord.setPizzaType(pizzaType);
        session.setAttribute("order", ord);
        this.springTemplateEngine.process("selectPizzaSize", webContext, resp.getWriter());
    }
}
