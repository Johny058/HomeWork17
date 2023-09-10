package stav.pro.sky.homework17;

import org.springframework.stereotype.Service;

@Service

public class HelloServiceImpl implements HelloService {
    public String greeting() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String answerHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
}
