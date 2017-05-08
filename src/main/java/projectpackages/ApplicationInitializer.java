package projectpackages;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import projectpackages.janus.config.WebConfig;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    public void onStartup(javax.servlet.ServletContext container) throws ServletException {
        // context Spring'а
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);
        container.addListener(new ContextLoaderListener(context));

        // регистрация DispatcherServlet Spring'а (распределяет запросы по контроллерам)
        ServletRegistration.Dynamic dispatcherServlet = container.addServlet("dispatcher", new DispatcherServlet(context));
        dispatcherServlet.addMapping("/");

    }
}
