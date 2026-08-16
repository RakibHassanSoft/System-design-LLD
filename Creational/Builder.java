package Creational;
class Computer {

    private String cpu;
    private int ram;
    private int storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    static class Builder {

        private String cpu;
        private int ram;
        private int storage;

        Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }

    void showInfo() {
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(storage);
    }
}

public class Builder {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        computer.showInfo();
    }
}