package de.ait.simple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String getControllerPage() {
        return "calculator";
    }

    @GetMapping("/sum")
    public String getResultPage(
            @RequestParam("numberA") int a,
            @RequestParam("numberB") int b,
            Model model) {
        int result = a + b;

        model.addAttribute("numberA", a);
        model.addAttribute("numberB", b);
        model.addAttribute("result", result);

        return "result";

    }
}
