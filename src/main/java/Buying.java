import java.util.Timer;

public class Buying {

    // Instance Variables
    String name;
    String catagory;
    String color;
    int timeInMilli;

    // Constructor Declaration of Class
    public Buying(String name, String catagory,
               String color, int timeInMilli)
    {
        this.name = name;
        this.catagory = catagory;
        this.timeInMilli = timeInMilli;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTimeInMilli() {
        return timeInMilli;
    }

    public void setTimeInMilli(int timeInMilli) {
        this.timeInMilli = timeInMilli;
    }

    @Override
    public String toString() {
        return "Buying{" +
                "name='" + name + '\'' +
                ", catagory='" + catagory + '\'' +
                ", color='" + color + '\'' +
                ", timeInMilli=" + timeInMilli +
                '}';
    }
}
