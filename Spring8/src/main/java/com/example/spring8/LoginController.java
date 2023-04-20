package com.example.spring8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/form-login")
    public String fomrLogin() {
        return "form-login";
    }

    @PostMapping("/login")
    public String ketQuaLogin(@RequestParam(name = "usrn", required = false, defaultValue = "") String userName,
                              @RequestParam(name = "psw", required = false, defaultValue = "") String pass,
                              Model model) {
        if (pass.equals("12123") && userName.equals("thuyduongxih")) {
            model.addAttribute("ketQuaLogin", "login thanh cong heheheh");
            model.addAttribute("user", userName);
            model.addAttribute("matKhau", pass);
            return "ket-qua-login";
        } else {
            model.addAttribute("status", "Vui long kiem tra lai!");
            return "form-login";
        }

    }
}
