public class Task8 {
    public static void main(String[] args) {
        int currentYear = 2022;
        for(int i=currentYear-200; i<=currentYear+79; i++) {
            if(i%79 == 0) {
                System.out.println(i);
            }
        }
    }
}
