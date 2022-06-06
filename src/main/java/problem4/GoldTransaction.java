package problem4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@ToString
public class GoldTransaction extends Transaction {
    private String goldType;

    public GoldTransaction(String transactionId, LocalDate transactionDate, int unitPrice, int quantity, String goldType) {
        super(transactionId, transactionDate, unitPrice, quantity);
        this.goldType = goldType;
    }

    public GoldTransaction(String goldType) {
        this.goldType = goldType;
    }


    @Override
    public double calculatePrice() {
        return getUnitPrice() * getQuantity();
    }

}
