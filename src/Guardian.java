public class Guardian {

    public String name;
    public int defenseRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(int defenseRating) {
        if (defenseRating > 0 ) {
            this.defenseRating = defenseRating;
        }  else {
            System.out.println("Warning: Defense rating must be greater than 0.");
        }
    }

    public boolean isLegendary() {
        return defenseRating > 100;
    }
}
