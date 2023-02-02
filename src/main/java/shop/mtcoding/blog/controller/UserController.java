package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // @GetMapping("/logout")
    // public String logout() {
    // session.invalidate();
    // return "redirect:/";
    // }

    @GetMapping("/user/profileUpdate")
    public String profileUpdatem() {
        return "user/profileUpdate";
    }

    @GetMapping("/user/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}
