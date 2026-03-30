
public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {
        int tmp = Integer.compare(this.speed, o.speed);
        if (tmp != 0)
            return tmp;

        tmp = Integer.compare(this.price, o.price);
        if (tmp != 0)
            return tmp;

        tmp = this.model.compareTo(o.model);
        if (tmp != 0)
            return tmp;

        return this.color.compareTo(o.color);
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }
}