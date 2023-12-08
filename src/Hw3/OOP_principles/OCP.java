package Hw3.OOP_principles;

public class OCP {
//    2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

    public class SpeedCalculation {
        public double calculateAllowedSpeed (Vehicle vehicle){

        }
//        public double calculateAllowedSpeed(Vehicle vehicle) {
//            if (vehicle.getType().equalsIgnoreCase("Car")) {
//                return vehicle.getMaxSpeed() * 0.8;
//            } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//                return vehicle.getMaxSpeed() * 0.6;
//            }
//            return 0.0;
//        }
    }

    public class Vehicle {
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }
    }

    public class Car extends Vehicle {

        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
    }

    public class Bus extends Vehicle {

        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }
    }

}
//    Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
//    напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать
//    класс SpeedCalculation соответствующим OCP

