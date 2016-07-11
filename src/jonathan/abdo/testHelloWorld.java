package jonathan.abdo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class testHelloWorld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model model) {
		return new ModelAndView("welcome", "message", "Hello World");
	}

	@RequestMapping("/createForm")
	public ModelAndView userForm(Model model) {
		
		return new ModelAndView("userForm", "command", new User());
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String showUser(@Valid @ModelAttribute("command") User user, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
            //return the user to the form if there are errors
			return "userForm";
        }
		
		model.addAttribute("name", user.getName());
		model.addAttribute("age", user.getAge());
		return "userInfo";
	}
}