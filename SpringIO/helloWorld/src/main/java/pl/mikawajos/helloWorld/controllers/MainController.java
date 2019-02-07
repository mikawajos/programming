package pl.mikawajos.helloWorld.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    //

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/domek")
    @ResponseBody
    public String domek() {
        return "Hello Im at HOME!!";
    }


}
