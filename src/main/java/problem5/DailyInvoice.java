package problem5;

import lombok.Data;

import java.time.LocalDate;

public class DailyInvoice extends Invoice{
    private int rentedDays;

    public DailyInvoice(String invoiceId, LocalDate billDate, String customerName, String roomId, int roomPrice, int rentedDays)
    {
        super(invoiceId,billDate,customerName,roomId,roomPrice);
        this.rentedDays = rentedDays;
    }

    public int getRentedDays() {
        return rentedDays;
    }

    public void setRentedDays(int rentedDays) {
        this.rentedDays = rentedDays;
    }

    public double calculatePrice() {
        double price;
        if (rentedDays < 7)
        {
            price = rentedDays * super.roomPrice;
        }
        else {
            price = 7 * super.roomPrice + ((rentedDays - 7) * 0.2) * super.roomPrice;
        }
        return price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof DailyInvoice)) return false;
        else return super.equals(o);
    }
}
