package com.my.learn.patterns.builder.second;

public class Car {

    private String type;
    private int horsePower;
    private boolean hasRoof;

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                ", hasRoof=" + hasRoof +
                '}';
    }

    public static class Builder{

        private Car car;

        public Builder() {
            this.car = new Car();
        }

        public Car build() {
            return car;
        }

        public Builder buildType(String type) {
            car.type = type;
            return this;
        }

        public Builder buildHorsePower(int horsePower) {
            car.horsePower = horsePower;
            return this;
        }

        public Builder buildHasRoof(boolean hasRoof) {
            car.hasRoof = hasRoof;
            return this;
        }
    }



}
