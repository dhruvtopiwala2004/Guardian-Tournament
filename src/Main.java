public class Main {
    public static void main(String[] args) {

        Guardian guardian1 = new Guardian();
        guardian1.name = "Arthor";
        guardian1.defenseRating = 80;

        Guardian guardian2 = new Guardian();
        guardian2.name = "Galahad";
        guardian2.defenseRating = 110;

        System.out.println(
                guardian1.getName() +
                        " Defense Rating: " +
                        guardian1.getDefenseRating()
        );

        System.out.println(
                " Legendary: " +
                        guardian1.isLegendary()
        );

        System.out.println();

        System.out.println(
                guardian2.getName() +
                        " Defense Rating: " +
                        guardian2.getDefenseRating()
        );

        System.out.println(
                " Legendary " +
                        guardian2.isLegendary()
        );

        guardian2.setDefenseRating(-20);

        System.out.println(
                guardian1.getName() +
                        " Defense Rating after invalid attempt: " +
                        guardian1.getDefenseRating()
        ):
    }
}