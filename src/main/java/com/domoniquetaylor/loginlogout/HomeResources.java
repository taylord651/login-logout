package com.domoniquetaylor.loginlogout;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("User", "");
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("User", "User");
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("User", "Admin");
        return ("<h1>Welcome Admin</h1>");
    }

}
