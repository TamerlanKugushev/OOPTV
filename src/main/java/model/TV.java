package model;

import exceptions.InsufficientHeightException;

import java.util.Objects;

public class TV {
    private String brand;
    private String model;
    private double price;
    private int lifeTime;
    private Size size;

    public TV() {
        this.brand = "";
        this.model = "";
        this.size = new Size();
    }

    public TV(String brand, String model, double price, int lifeTime,
              double width, double length, double height) throws InsufficientHeightException {
        if(lifeTime < 0)
            throw new IllegalArgumentException("Life timer < 0");
        if(height < 0)
            throw new InsufficientHeightException("Height < 0");
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.lifeTime = lifeTime;
        this.size = new Size( length, width, height );
    }

    public String getBrand() throws InsufficientHeightException {

        try {
            //calc
        }
        catch (ArrayIndexOutOfBoundsException ignored){

        }

        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    /*public Size getSize() {
        return new Size(this.size);
    }*/

    public double getWidth(){
        return this.size.getWidth();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return Double.compare(tv.price, price) == 0 &&
                lifeTime == tv.lifeTime &&
                Objects.equals(brand, tv.brand) &&
                Objects.equals(model, tv.model) &&
                Objects.equals(size, tv.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, lifeTime, size);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", lifeTime=" + lifeTime +
                ", size=" + size +
                '}';
    }
}
