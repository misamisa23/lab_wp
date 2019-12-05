package mk.finki.ukim.mk.lab.web;

import mk.finki.ukim.mk.lab.model.Order;
import mk.finki.ukim.mk.lab.model.Pizza;
import mk.finki.ukim.mk.lab.service.OrderService;
import mk.finki.ukim.mk.lab.service.PizzaService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/confirmationInfo.do")
public class ConfirmationInfo extends HttpServlet {

    private final OrderService orderService;
    private final SpringTemplateEngine springTemplateEngine;

    public ConfirmationInfo(SpringTemplateEngine springTemplateEngine, OrderService orderService) {
        this.springTemplateEngine = springTemplateEngine;
        this.orderService = orderService;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        resp.setContentType("text/html; charset=UTF-8");
        HttpSession session = req.getSession();
        Order ord = (Order) session.getAttribute("order");
        Order ordN = orderService.placeOrder(ord.getPizzaType(), ord.getPizzaSize(), req.getParameter("clientName"), req.getParameter("clientAddress"));
        session.setAttribute("order", ordN);
        session.setAttribute("IP", req.getRemoteAddr());
        session.setAttribute("browser", req.getHeader("User-Agent"));
        this.springTemplateEngine.process("confirmationInfo", webContext, resp.getWriter());
    }
}
