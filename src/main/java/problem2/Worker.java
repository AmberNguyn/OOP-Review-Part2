package problem2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Worker {
    private String workerId;
    private String lastName;
    private String firstName;
    private int numberOfProduct;
}
