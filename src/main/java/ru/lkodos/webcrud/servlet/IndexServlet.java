package ru.lkodos.webcrud.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import ru.lkodos.webcrud.config.ThymeleafConfig;

import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        TemplateEngine templateEngine = ThymeleafConfig.getTemplateEngine();
        Context context = new Context();
        context.setVariable("message", "Привет из Thymeleaf!");
        templateEngine.process("index", context, resp.getWriter());

    }
}
