
public class Recepie {

    private String name;
    private int difficulty;

    public Recepie(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return "Recepie{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}

