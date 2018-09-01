package gsalaun1.extreme_startup_spring_boot_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>ExtremeStartupController</p>
 */
@RestController
public class ExtremeStartupController {

    @GetMapping(name = "/")
    public String get(HttpServletRequest request) {
        System.out.println("A request has arrived");
        return answer(request.getParameter("q"));
    }

    String answer(String parameter) {
        if (Objects.isNull(parameter)) {
            return "team name";
        }
        Matcher additionMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(parameter);
        if (additionMatcher.matches()) {
            return String.valueOf(Integer.parseInt(additionMatcher.group(1))
                    + Integer.parseInt(additionMatcher.group(2)));
        }
        return "team name";
    }

}