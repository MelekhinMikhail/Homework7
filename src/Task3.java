public class Task3 {
    public static void main(String[] args) {
        int population = 12_000_000;
        int birthrate, mortality;
        for(int i=1; i<11; i++) {
            birthrate = (population/1000)*17;
            mortality = (population/1000)*8;
            population += (birthrate - mortality);
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
    }
}
