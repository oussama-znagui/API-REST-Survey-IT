package ma.znagui.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ma.znagui.survey")


public class SurveyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SurveyApplication.class, args);
    }

}
