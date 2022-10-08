public class Task5 {
    public static void main(String[] args) {
        float depositAmount = 15_000f;
        int currentMonth = 1;
        while(depositAmount < 12_000_000) {
            depositAmount *= 1.07;
            if(currentMonth % 6 == 0) {
                System.out.println("Накопление в "+currentMonth+" месяце равно "+depositAmount+" рублей.");
            }
            currentMonth += 1;
        }
    }
}
