package com.domoniquetaylor.loginlogout.controllers;

@Controller
public class LoginLogoutController {

    @RequestMapping (value = "")
    public String index() {
        return "index";
    }

    @RequestMapping (value = "login", method = RequestMethod.GET)
    public String displayLoginForm() {
        return "login";
    }

    @RequestMapping (value = "login", method = RequestMethod.POST)
    public String processLoginForm() {
        return "redirect:";
    }

}
