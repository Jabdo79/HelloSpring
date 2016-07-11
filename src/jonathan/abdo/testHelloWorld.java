package jonathan.abdo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class testHelloWorld {
@RequestMapping("/welcome")
public ModelAndView helloWorld()
{
return new
ModelAndView("welcome","message","Hello World");
}
}