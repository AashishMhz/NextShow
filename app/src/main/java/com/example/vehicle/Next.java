package com.example.vehicle;

public class Next {
    private String make;
    private Integer year;
    private String color;
    private Float Price;
    private Integer engineSize;

    public Next() {
    }

    public Next(String make, Integer year, String color, Float price, Integer engineSize) {
        this.make = make;
        this.year = year;
        this.color = color;
        Price = price;
        this.engineSize = engineSize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Integer getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Integer engineSize) {
        this.engineSize = engineSize;
    }
}
