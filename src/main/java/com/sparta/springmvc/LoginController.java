package com.sparta.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String loginhtml() {
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String loginRequestParam(@RequestParam String id, @RequestParam String password, Model model) {
        if(id.equals(password))
            model.addAttribute("loginId", id);

        return "login-result";
    }


}
