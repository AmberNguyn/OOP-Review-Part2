package problem5;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class InvoiceList {
    private Set<Invoice> invoiceList = new HashSet<>();
    private int count = 0;


    //list of Invoices
    public Set<Invoice> getInvoiceList() {
        return invoiceList;
    }

    //add invoice
    public boolean addInvoice(Invoice inputInvoice)
    {
        for (Invoice invoice : invoiceList
             ) {
            if (invoice.getInvoiceId().equalsIgnoreCase(inputInvoice.getInvoiceId()))
            {
                System.out.println("Duplicated ID. Cannot add");
                return false;
            }
            else {
                invoiceList.add(inputInvoice);
            }
        }
        return true;
    }

    //show Invoices
    public void showInvoices()
    {
        for (Invoice invoice: invoiceList
             ) {
            System.out.println(invoice);
        }
    }

    //count the number of HourlyInvoice in list
    public int countNumberOfHourlyInVoice()
    {
        for (Invoice invoice : invoiceList
             ) {
            if (invoice instanceof HourlyInvoice)
            {
                count++;
            }
        }
        return count;
    }

    public int countNumberOfDailyInvoice()
    {
        for (Invoice invoice : invoiceList
        ) {
            if (invoice instanceof DailyInvoice)
            {
                count++;
            }
        }
        return count;
    }

}
