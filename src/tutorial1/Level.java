package tutorial1;

public enum Level { // enum is a special class that can only contain constants

    // Calling these will call the constructor
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    // Creating methods to interact with the private lvlNum variable
    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num;
    }
}
