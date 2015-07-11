package uk.co.kirstywilliams.ms.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

/**
 * Main Application which starts the
 * Spring Boot context.
 *
 * @author Kirsty Williams
 */
@SpringBootApplication
@Controller
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }


}
