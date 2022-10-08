public class Task1 {
    public static void main(String[] args) {
        double finishedAmount = 2_459_000;
        double monthlyPayment = 29_000;
        float monthlyPercentage = 1.01f;
        int numberOfMonth = 0;
        double currentAmount = 0;
        while(currentAmount < finishedAmount) {
            currentAmount += monthlyPayment;
            currentAmount *= monthlyPercentage;
            numberOfMonth += 1;
        }
        System.out.println(numberOfMonth);
    }
}