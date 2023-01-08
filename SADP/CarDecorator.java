class MainClass6 {

    interface Car {
        public void assemble();
    }

    static class BasicCar implements Car {
        public void assemble() {
            System.out.print("Basic Car.");
        }
    }

    static class CarDecorator implements Car {
        Car car;
        public CarDecorator(Car c) {
            this.car = c;
        }

        public void assemble() {
            this.car.assemble();
        }
    }

    static class SportsCar extends CarDecorator {
        public SportsCar(Car c) {
            super(c);
        }

        public void assemble() {
            car.assemble();
            System.out.print(" Adding features of Sports Car.");
        }
    }

    static class LuxuryCar extends CarDecorator {
        public LuxuryCar(Car c) {
            super(c);
        }

        public void assemble() {
            car.assemble();
            System.out.print(" Adding features of Luxury Car.");
        }
    }

    public static class Decorator {
        public static void main(String[] args) {

            Car s1 = new SportsCar(new BasicCar());
            s1.assemble();
            Car s2 = new LuxuryCar(new BasicCar());
            s2.assemble();
        }
    }
}
