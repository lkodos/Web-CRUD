package ru.lkodos.webcrud.config;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ThymeleafConfig {

    private static TemplateEngine templateEngine;

    public static TemplateEngine getTemplateEngine() {
        if (templateEngine == null) {
            templateEngine = new TemplateEngine();

            ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();

            resolver.setPrefix("templates/");
            resolver.setSuffix(".html");
            resolver.setTemplateMode("HTML");
            resolver.setCharacterEncoding("UTF-8");
            resolver.setCacheable(false); // для разработки

            templateEngine.setTemplateResolver(resolver);
        }
        return templateEngine;
    }
}
