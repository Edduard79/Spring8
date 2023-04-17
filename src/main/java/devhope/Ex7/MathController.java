package devhope.Ex7;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    public String helloFromMath(){

        return "Hello from MathApp :D";
    }

    @GetMapping("/division-info")
    public ArithmeticOperation divisionInfo() {
        return new ArithmeticOperation("Division", 2, "Divide two numbers", Arrays.asList("numerator", "denominator"));
    }

    @GetMapping("/multiplication") // aggiungere {num1}/{num2} se si vuole usare la PathVariable al posto di RequestParam
    public Integer multiplication(@RequestParam Integer num1, @RequestParam Integer num2) {
        return num1 * num2;
    }

    @GetMapping("/square/{n}")
    public Integer square(@PathVariable Integer n) {
        return n * n;
    }



}
