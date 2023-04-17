package devhope.Ex7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ArithmeticOperation {

    private String name;
    private int minNumberOfOperands;
    private String description;
    private List<String> properties;


}
