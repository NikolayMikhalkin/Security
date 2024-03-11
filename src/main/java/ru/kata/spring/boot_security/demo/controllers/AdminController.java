package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.services.RoleService;
import ru.kata.spring.boot_security.demo.services.UserService;

@Controller
public class AdminController {

    private RoleService roleService;
    private UserService userService;

    @Autowired
    public AdminController(RoleService roleService, UserService userService ) {
        this.roleService = roleService;
        this.userService = userService;

    }

    @GetMapping("/admin")
    public String getAllUsers(Model model) {
        return "all_users";
    }

    @GetMapping("/admin/creat_user")
    public String getCreatUser(Model model) {
        return "creat_user";
    }

    @PostMapping("/admin/creat_user")
    public String getAddUser(@ModelAttribute(value = "user") User user) {
        return "redirect:/admin";
    }

    @GetMapping("/admin/update_user")
    public String getWhatUpdateUser(Model model, @ModelAttribute("userU") User user) {
        return "update_user";
    }
    @PostMapping("/admin/update_user")
    public String updateUser(@ModelAttribute("userU") User user) {
        return "redirect:/admin";
    }

    @GetMapping("/admin/delete_user")
    public String getWhatDeleteUser(Model model) {
        return "delete_user";
    }

    @PostMapping("/admin/delete_user")
    public String getDeleteUser(@ModelAttribute(value = "userD") User user) {
        return "redirect:/admin";
    }
}
