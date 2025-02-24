package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(Model model){
        String str = "welcome!";
        model.addAttribute("welcome",str);
        return "welcome";
    }
}
