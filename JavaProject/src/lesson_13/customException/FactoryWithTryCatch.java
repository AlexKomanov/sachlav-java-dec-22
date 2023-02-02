package lesson_13.customException;

public class FactoryWithTryCatch {
    public static void main(String[] args) {

        Worker worker = new Worker("Alex");

        worker.onVacation();
        try {
            worker.goToWork();
        } catch (WorkerIsNotReadyException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.toString() = " + e.toString());
            e.printStackTrace();
        }
    }
}
