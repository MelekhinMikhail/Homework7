public class Task6 {
    public static void main(String[] args) {
        double depositAmount = 15_000;
        for(int i=1; i<109; i++) {
            depositAmount *= 1.07;
            if(i%6 == 0) {
                System.out.println("Накопление в "+(i/6)+" полугодии равно "+depositAmount+" рублей.");
            }
        }
    }
}
