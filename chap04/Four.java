package chap04;

class Car {
    private String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;


    public Car(String color) {
        this.color = color;
        numOfCar++;

        if (color.equalsIgnoreCase("red"))
            numOfRedCar++;
    }

    static public int getNumOfCar() {
        return numOfCar;
    }

    static public int getNumOfRedCar() {
        return numOfRedCar;
    }
}

public class Four {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}
