package model;

import java.util.Objects;

public class Size implements Comparable<Size>{
    private double length;
    private double width;
    private double height;
    private double diag;

    public Size() {
    }

    public Size(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.setDiag();
    }

    public Size(Size other){
        this.width = other.width;
        this.length = other.length;
        this.height = other.height;
        this.diag = other.diag;
    }

    private void setDiag() {
        diag = Math.sqrt( length * length + height * height );
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDiag() {
        return diag;
    }

    public void setLength(double length) {
        this.length = length;
        this.setDiag();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
        this.setDiag();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Double.compare(size.length, length) == 0 &&
                Double.compare(size.width, width) == 0 &&
                Double.compare(size.height, height) == 0 &&
                Double.compare(size.diag, diag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height, diag);
    }

    @Override
    public String toString() {
        return "Size{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", diag=" + diag +
                '}';
    }

    @Override
    public int compareTo(Size o) {
        //return Double.compare(this.diag, o.diag);
        if(this.diag == o.diag)
            return Double.compare(this.width, o.width);
        return Double.compare(this.diag, o.diag);
    }
}
