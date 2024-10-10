package com_academia.site.model;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        // Retorne uma página de erro personalizada ou redirecione
        return "error"; // nome da página de erro
    }

    public String getErrorPath() {
        return "/error";
    }
}

