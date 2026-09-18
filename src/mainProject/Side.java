package mainProject;

public enum Side {

    RED("RED"), BLUE("BLUE");

    private String name;

    private Side(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
