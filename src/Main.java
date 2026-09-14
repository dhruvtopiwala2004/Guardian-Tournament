public class Main {
    public static void main(String[] args) {

        Guardian guardian1 = new Guardian();
        guardian1.name = "Arthor";
        guardian1.defenseRating = 80;

        Guardian guardian2 = new Guardian();
        guardian2.name = "Galahad";
        guardian2.defenseRating = 110;

        System.out.println("Guardian 1: " + guardian1.name);
        System.out.println("Defense Rating: " + guardian1.defenseRating);

        System.out.println();

        System.out.println("Guardian 2: " + guardian2.name);
        System.out.println("Defense Rating: " + guardian2.defenseRating);
    }
}