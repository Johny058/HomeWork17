package stav.pro.sky.homework17;

import org.springframework.stereotype.Service;


@Service

public class CalculatorServiceImpl implements CalculatorService {

    public int calculatePlus(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public int calculateMinus(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }

    public int calculateMultiply(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    public int calculateDivide(int num1, int num2) {
        int res = num1 / num2;
        if (res == 0)
            System.out.println(1);
        return res;
    }
}
