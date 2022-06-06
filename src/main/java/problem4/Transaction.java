package problem4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Transaction {
    private String transactionId;
    private LocalDate transactionDate;
    private int unitPrice;
    private int quantity;

    public abstract double calculatePrice();
}
