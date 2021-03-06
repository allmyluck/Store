package company.store.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("LoginPage");
        registry.addViewController("/posts").setViewName("PostsPage");
        registry.addViewController("/lk").setViewName("LkPage");
        registry.addViewController("/").setViewName("IndexPage");
    }

}