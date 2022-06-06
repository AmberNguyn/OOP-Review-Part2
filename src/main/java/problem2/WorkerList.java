package problem2;

import lombok.*;
import problem2.exception.InvalidProductionAmountException;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkerList {
    List<Worker> workerList = new ArrayList<>();

    //Add worker into the List
    public void addWorker() throws InvalidProductionAmountException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter worker ID: ");
        String workerID = keyboard.nextLine();
        System.out.println("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter the number of product: ");
        int numberOfProduct = keyboard.nextInt();

        Worker newWorker = new Worker(workerID, lastName, firstName, numberOfProduct);
        workerList.add(newWorker);
        System.out.println("Successfully added");
    }

    //Show all workers in the list
    public void showWorkers() {
        for (Worker worker : workerList
        ) {
            System.out.println(worker.toString());
        }
    }

    //Calculate the number of workers in the list
    public int countNumberOfWorkers() {
        return workerList.size();
    }

    //Show workers who produce more than 200 products
    public List<Worker> showWorkersWhoProduceMoreThan200Products() {
        List<Worker> workersWhoProduceMoreThan200Products = new ArrayList<>();

        for (Worker worker : workerList
        ) {
            if (worker.getNumberOfProduct() > 200) {
                workersWhoProduceMoreThan200Products.add(worker);
            }
        }
        return workersWhoProduceMoreThan200Products;
    }

    //Sort workers by numberOfProuct in descending order
    public List<Worker> sortWorkersByNumberOfProductInDescendingOrder() {
        List<Worker> listOfWorkersInDescendingOrder = new ArrayList<>(workerList);
        Collections.sort(listOfWorkersInDescendingOrder, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return -(o1.getNumberOfProduct() - o2.getNumberOfProduct());
            }
        });
        return listOfWorkersInDescendingOrder;
    }
}
