package problem4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> listOfTransaction = new ArrayList<>();

        GoldTransaction goldTransaction1 = new GoldTransaction("G123", LocalDate.of(2000, 10, 10), 5000, 10, "SJC");
        GoldTransaction goldTransaction2 = new GoldTransaction("G999", LocalDate.of(2001, 11, 16), 2000, 2, "9999");
        GoldTransaction goldTransaction3 = new GoldTransaction("G002", LocalDate.of(2002, 2, 1), 3000, 20, "SJC");

        CurrencyTransaction currencyTransaction1 = new CurrencyTransaction("C333", LocalDate.of(2000, 2, 3), 2400, 2, 0.3, CurrencyType.USD);
        CurrencyTransaction currencyTransaction4 = new CurrencyTransaction("C323", LocalDate.of(2000, 3, 23), 2400, 4, 0.3, CurrencyType.USD);
        CurrencyTransaction currencyTransaction5 = new CurrencyTransaction("C321", LocalDate.of(2000, 3, 12), 2400, 5, 0.3, CurrencyType.USD);

        CurrencyTransaction currencyTransaction2 = new CurrencyTransaction("C327", LocalDate.of(2003, 3, 23), 2300, 10, 0.1, CurrencyType.VND);
        CurrencyTransaction currencyTransaction6 = new CurrencyTransaction("C100", LocalDate.of(2002, 7, 22), 2000000000, 100, 0.1, CurrencyType.VND);
        CurrencyTransaction currencyTransaction7 = new CurrencyTransaction("C123", LocalDate.of(2001, 8, 21), 2300, 13, 0.1, CurrencyType.VND);

        CurrencyTransaction currencyTransaction3 = new CurrencyTransaction("C345", LocalDate.of(2003, 5, 21), 2000000000, 4, 0.3, CurrencyType.EUR);
        CurrencyTransaction currencyTransaction8 = new CurrencyTransaction("C009", LocalDate.of(2002, 3, 29), 600, 2, 0.3, CurrencyType.EUR);
        CurrencyTransaction currencyTransaction9 = new CurrencyTransaction("C007", LocalDate.of(2001, 5, 26), 600, 4, 0.3, CurrencyType.EUR);


        listOfTransaction.add(goldTransaction1);
        listOfTransaction.add(goldTransaction2);
        listOfTransaction.add(goldTransaction3);
        listOfTransaction.add(currencyTransaction1);
        listOfTransaction.add(currencyTransaction2);
        listOfTransaction.add(currencyTransaction3);
        listOfTransaction.add(currencyTransaction4);
        listOfTransaction.add(currencyTransaction5);
        listOfTransaction.add(currencyTransaction6);
        listOfTransaction.add(currencyTransaction7);
        listOfTransaction.add(currencyTransaction8);
        listOfTransaction.add(currencyTransaction9);


        System.out.println("-------------- TOTAL QUANTITY FOR GOLD, USD, VND, EUR TRANSACTION --------------");
        int totalGoldQuantity = 0;
        int totalCurrencyQuantity = 0;

        for (Transaction transaction : listOfTransaction
        ) {
            if (transaction instanceof GoldTransaction) {
                totalGoldQuantity = totalGoldQuantity + transaction.getQuantity();
            } else {
                totalCurrencyQuantity = totalCurrencyQuantity + transaction.getQuantity();
            }
        }

        System.out.println("Gold quantity: " + totalGoldQuantity + "\n");
        System.out.println("Currency quantity: " + totalCurrencyQuantity + "\n");


        System.out.println("-------------- AVERAGE PRICE OF CURRENCY TRANSACTION --------------");
        double totalCurrencyTransactionPrice = 0;
        double averageCurrencyTransactionPrice;
        int count = 0;
        for (Transaction transaction : listOfTransaction
        ) {
            if (transaction instanceof CurrencyTransaction) {
                totalCurrencyTransactionPrice = totalCurrencyTransactionPrice + transaction.getUnitPrice();
                count++;
            }
        }
        averageCurrencyTransactionPrice = totalCurrencyTransactionPrice / count;
        System.out.println("Average: " + averageCurrencyTransactionPrice);

        System.out.println("-------------- LIST OF TRANSACTIONS THAT HAVE UNIT PRICE GREATER THAN 1 BILLION --------------");
        List<Transaction> listOfTransactionsThatHaveUnitPriceGreaterThan1Billion = new ArrayList<>();
        for (Transaction transaction: listOfTransaction
             ) {
            if (transaction.getUnitPrice() > 1000000000)
            {
                listOfTransactionsThatHaveUnitPriceGreaterThan1Billion.add(transaction);
            }
        }

        for (Transaction transaction: listOfTransactionsThatHaveUnitPriceGreaterThan1Billion
             ) {
            System.out.println(transaction);
            System.out.println("======");
        }


    }
}
