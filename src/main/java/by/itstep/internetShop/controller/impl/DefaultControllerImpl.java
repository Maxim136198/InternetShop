package by.itstep.internetShop.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultControllerImpl {

    @GetMapping()
    public String sayIndex(){
        return "index";
    }
}
