package com.example.restapi.api.endpoints;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CommonEndpoints {
    @GetMapping("/greetings")
    public String showGreet(){
        return "Greeting";
    }

    @GetMapping("/sendgreet")
    public String sendGreetPage(){
        return "GreetForm";
    }
    @GetMapping("/sendgreet/success")
    public String showSuccessPage(){
        return "GreetSuccessPage";
    }

    @GetMapping("/errorpage")
    public String showErrorPage(){
        return "ErrorPage";
    }

    @PostMapping("/greetings")
    public String sendGreet(@RequestBody String greet, HttpServletRequest request, HttpServletResponse response){
     return "redirect:/sendgreet/success";
    }

}
