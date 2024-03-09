package calculator.com.example.calculator;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping("/calc")
public class CalculatorImp {
    @GetMapping("/{operator}/{op1}/{op2}")
    private String calculate(@PathVariable String operator, @PathVariable Integer op1, @PathVariable Integer op2) {
        int mathResult;
            if (Objects.equals(operator, "mult")) {
                mathResult = op1 * op2;
                return op1.toString().concat(" * ").concat(op2.toString()).concat(" = ").concat(String.valueOf(mathResult));
            } else if (Objects.equals(operator, "div")) {
                mathResult = op1 / op2;
                return op1.toString().concat(" / ").concat(op2.toString()).concat(" = ").concat(String.valueOf(mathResult));
            }
            else if (Objects.equals(operator, "sum")) {
                mathResult = op1 + op2;
                return op1.toString().concat(" + ").concat(op2.toString()).concat(" = ").concat(String.valueOf(mathResult));
            }
            else if (Objects.equals(operator, "subtract")) {
                mathResult = op1 - op2;
                return op1.toString().concat(" - ").concat(op2.toString()).concat(" = ").concat(String.valueOf(mathResult));
            }
            return "Invalid Input";
    }
}
