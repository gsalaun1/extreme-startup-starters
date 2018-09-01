package gsalaun1.extreme_startup_spring_boot_kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.regex.Pattern
import javax.servlet.http.HttpServletRequest

/**
 * <p>ExtremeStartupController</p>
 */
@RestController
class ExtremeStartupController {

    @GetMapping(name = "/")
    fun get(request: HttpServletRequest): String {
        println("A request has arrived")
        return answer(request.getParameter("q"))
    }

    fun answer(parameter: String?): String {
        if (Objects.isNull(parameter)) {
            return "team name"
        }
        val additionMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(parameter)
        return if (additionMatcher.matches()) {
            (Integer.parseInt(additionMatcher.group(1)) + Integer.parseInt(additionMatcher.group(2))).toString()
        } else "team name"
    }

}