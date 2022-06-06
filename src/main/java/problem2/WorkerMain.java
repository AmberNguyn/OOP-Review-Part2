package problem2;

import problem2.exception.InvalidProductionAmountException;

public class WorkerMain {
    public static void main(String[] args) throws InvalidProductionAmountException {
        WorkerList listOfWorkers = new WorkerList();
        listOfWorkers.addWorker();
        listOfWorkers.addWorker();
        listOfWorkers.addWorker();
        listOfWorkers.addWorker();
        //show all
        System.out.println("---------------- ALL WORKERS IN THE LIST ----------------");
        listOfWorkers.showWorkers();

        //calculate number of workers in the list
        System.out.println("========================");
        System.out.println("The number of workers in the list is: " + listOfWorkers.countNumberOfWorkers());
        System.out.println("========================\n");

        //show list of Workers who produce more than 200 products
        System.out.println("---------------- LIST OF WORKERS WHO PRODUCE MORE THAN 200 PRODUCTS ----------------");
        System.out.println("========================");
        for (Worker worker : listOfWorkers.showWorkersWhoProduceMoreThan200Products()
        ) {
            System.out.println(worker);
        }
        System.out.println("========================\n");


        //sort in descending order
        System.out.println("---------------- LIST OF WORKERS IN DESCENDING ORDERS ----------------");
        System.out.println("========================");
        for (Worker worker : listOfWorkers.sortWorkersByNumberOfProductInDescendingOrder()
        ) {
            System.out.println(worker);
        }
        System.out.println("========================");
    }
}
