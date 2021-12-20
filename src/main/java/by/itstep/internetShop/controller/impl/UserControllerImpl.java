package by.itstep.internetShop.controller.impl;

import by.itstep.internetShop.controller.UserController;
import by.itstep.internetShop.dao.entity.User;
import by.itstep.internetShop.service.RoleService;
import by.itstep.internetShop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    private UserService userService;

    private RoleService roleService;

    public UserControllerImpl(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

//    @GetMapping("/index")
//    public String index(Model model) {
//        model.addAttribute("user", userService.findAll());
//        return "index";
//    }


    @GetMapping("/allUsers")
    public String getAllUser(Model model) {
        model.addAttribute("allUsers", userService.findAll());
//        System.out.println("111 : list = {}", userService.findAll());

        return "user/allUsers";
    }

    @PostMapping("/{id}")
    public String removeUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/user/allUsers";
    }

    @GetMapping("/newUser")
    public String createUser(Model model) {
        model.addAttribute("newUser", new User());
        return "newUser";
    }

    @PostMapping()
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.save(user);
        return "redirect:/user/allUsers";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid User user, Model model) {
        userService.updateUser(user);
        return "redirect:/user/allUsers";
    }


///-------------------------------------


}
