package problem5;


import lombok.Data;
import problem5.exception.OverHoursException;

import java.time.LocalDate;

public class HourlyInvoice extends Invoice{
    private int rentedHours;

    public HourlyInvoice(String invoiceId, LocalDate billDate, String customerName, String roomId, int roomPrice, int rentedHours) {
        super(invoiceId, billDate, customerName, roomId, roomPrice);
        this.rentedHours = rentedHours;
    }

    public int getRentedHours() {
        return rentedHours;
    }

    public void setRentedHours(int rentedHours) {
        this.rentedHours = rentedHours;
    }

    public double calculatePrice() throws OverHoursException {
        double price;
        if (rentedHours < 24)
        {
            price = rentedHours * super.roomPrice;
        } else if (rentedHours < 30)
        {
            price = 24 * super.roomPrice;
        }
        else {
            throw new OverHoursException("Exceed hours for hourly invoice");
        }
        return price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof HourlyInvoice)) return false;
        else return super.equals(o);
    }
}
