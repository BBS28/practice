package com.my.learn.patterns.builder.first;

public class Product {

    private String name;
    private String description;
    private int price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private Product product;

        public Builder() {
            this.product = new Product();
        }

        public Product build() {
            return product;
        }

        public Builder buildName(String name) {
            product.name = name;
            return this;
        }

        public Builder buildDescription(String description) {
            product.description = description;
            return this;
        }

        public Builder buildPrice(int price) {
            product.price = price;
            return this;
        }

    }
}
