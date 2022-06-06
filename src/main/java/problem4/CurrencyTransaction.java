package problem4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CurrencyTransaction extends Transaction {
    private double rate;
    private CurrencyType currencyType;

    public CurrencyTransaction(String transactionId, LocalDate transactionDate, int unitPrice, int quantity, double rate, CurrencyType currencyType) {
        super(transactionId, transactionDate, unitPrice, quantity);
        this.rate = rate;
        this.currencyType = currencyType;
    }

    public CurrencyTransaction(double rate, CurrencyType currencyType) {
        this.rate = rate;
        this.currencyType = currencyType;
    }

    @Override
    public double calculatePrice() {
        if (currencyType == CurrencyType.EUR || currencyType == CurrencyType.USD) {
            return getRate() * getUnitPrice() * getQuantity();
        } else {
            return getQuantity() * getUnitPrice();
        }
    }

}
