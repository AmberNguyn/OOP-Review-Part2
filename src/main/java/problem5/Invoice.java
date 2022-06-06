package problem5;

import lombok.Data;
import problem5.exception.OverHoursException;

import java.time.LocalDate;

@Data
public abstract class Invoice {
    private String invoiceId;
    private LocalDate billDate;
    private String customerName;
    private String roomId;
    public int roomPrice;


    public Invoice(String invoiceId, LocalDate billDate, String customerName, String roomId, int roomPrice) {
    }

    @Override
    public int hashCode()
    {
        return invoiceId.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return invoiceId.equalsIgnoreCase(((Invoice) o).invoiceId);
    }
}
