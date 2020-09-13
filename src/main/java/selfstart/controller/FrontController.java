package selfstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	
	@PostMapping("/add")
	public ModelAndView  addition(@RequestParam int t1, @RequestParam int t2) {
		int add = t1 +t2;
		System.out.println(add);
		ModelAndView model = new ModelAndView();
		model.addObject("result", add);
		model.setViewName("success");
		return model;

	}

}
