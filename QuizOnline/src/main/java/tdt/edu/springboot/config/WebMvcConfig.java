package tdt.edu.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.GzipResourceResolver;
 
 
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
  
  
   // Cấu hình để sử dụng các file nguồn tĩnh (html, image, ..)
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
       registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/resources/images/").setCachePeriod(31556926);
       registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
       registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/resources/fonts/").setCachePeriod(31556926);
       registry.addResourceHandler("/data/**").addResourceLocations("/WEB-INF/resources/data/").setCachePeriod(31556926);
       registry.addResourceHandler("/video/**").addResourceLocations("/WEB-INF/resources/video/").setCachePeriod(31556926);
   }
 
    
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }
 
}