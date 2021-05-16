package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car{
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS CALL");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        System.out.println("HASH CALL");
        return Objects.hash(model, power);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}

public class EqualsAndHashCodeDemo {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("BMW", 150));
        cars.add(new Car("BMW", 100));
        cars.add(new Car("BMW", 10));
        cars.add(new Car("BMW", 150));
        cars.forEach(System.out::println);
    }
}
