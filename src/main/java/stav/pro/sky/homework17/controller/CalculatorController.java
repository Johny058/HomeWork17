package stav.pro.sky.homework17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stav.pro.sky.homework17.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerHello() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.plus(num1, num2);
        return showRes(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.minus(num1, num2);
        return showRes(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.multiply(num1, num2);
        return showRes(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Ошибка";
        }
        int result = calculatorService.divide(num1, num2);
        return showRes(num1, num2, '/', result);
    }

    private String showRes(int num1, int num2, char action, int result) {
        return String.format("%d %c %d = %d", num1, action, num2, result);
    }
}
