package words;


public abstract class Word {

    private String name;

    private Level level;

    public Word() {
    }

    public Word(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Word{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
