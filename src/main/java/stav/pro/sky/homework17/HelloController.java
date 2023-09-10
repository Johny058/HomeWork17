package stav.pro.sky.homework17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;
    private final CalculatorService calculatorService;
    public HelloController (HelloService helloService, CalculatorService calculatorService){
        this.helloService = helloService;
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greeting() {
        return helloService.greeting();
    }

    @GetMapping(path = "/calculator")
    public String answerHello() {
        return helloService.answerHello();
    }

    @GetMapping(path = "/calculator/plus")
    public int calculatePlus(@RequestParam(required = true) int num1,
                             @RequestParam(required = true) int num2) {
        int res = num1 + num2;
        return calculatorService.calculatePlus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public int calculateMinus(@RequestParam(required = true) int num1,
                             @RequestParam(required = true) int num2) {
        int res = num1 - num2;
        return calculatorService.calculateMinus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public int calculateMultiply(@RequestParam(required = true) int num1,
                                    @RequestParam(required = true) int num2) {
        int res = num1 * num2;
        return calculatorService.calculateMultiply(num1, num2);

    }
    @GetMapping(path = "/calculator/divide")
    public int calculateDivide(@RequestParam(required = true) int num1,
                              @RequestParam(required = true) int num2) {
        int res = num1 / num2;
        if (res == 0)
            System.out.println(1);
        return calculatorService.calculateDivide(num1, num2);
    }
}
