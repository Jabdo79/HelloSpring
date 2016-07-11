package jonathan.abdo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class testHelloWorld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		return new ModelAndView("welcome", "message", "Hello World");
	}

	@RequestMapping("/createForm")
	public ModelAndView userForm() {
		return new ModelAndView("userForm", "command", new User());
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String showUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("name", user.getName());
		model.addAttribute("age", user.getAge());
		return "userInfo";
	}
}