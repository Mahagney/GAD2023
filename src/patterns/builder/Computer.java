package patterns.builder;

public class Computer {
    private int RAM;
    private String CPU;
    private int storage;
    private String MB;
    private int battery;
    private String color;
    private String video;

    private Computer(Builder builder){
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.color = builder.color;
        this.video = builder.video;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM=" + RAM +
                ", CPU='" + CPU + '\'' +
                ", storage=" + storage +
                ", MB='" + MB + '\'' +
                ", battery=" + battery +
                ", color='" + color + '\'' +
                ", video='" + video + '\'' +
                '}';
    }

    public static class Builder {
        private int RAM;
        private String CPU;
        private int storage;
        private String MB;
        private int battery;
        private String color;
        private String video;

        public Builder( String MB, String CPU){
            this.MB = MB;
            this.CPU = CPU;
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setVideo(String video) {
            this.video = video;
            return this;
        }
    }
}
