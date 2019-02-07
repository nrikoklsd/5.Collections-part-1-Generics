package main;

public class Droid{
    private String name;
    private int ID;
    private int priority;

    public Droid() {
        this.ID = 0;
        this.name = "";
    }
    public Droid(String name, int ID, int priority) {

        this.name = name;
        this.ID = ID;
        this.priority = priority;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", priority=" + priority +
                '}';
    }

}
