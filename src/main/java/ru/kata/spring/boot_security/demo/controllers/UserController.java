package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.services.RoleService;
import ru.kata.spring.boot_security.demo.services.UserService;

@Controller
public class UserController {
    private UserService userService;
    private RoleService roleService;

    @Autowired
    public UserController(UserService us, RoleService rs) {
        this.userService = us;
        this.roleService = rs;
    }

    @GetMapping("/user")
    public String getUserInfo() {
        return "user-info";
    }

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }
}
