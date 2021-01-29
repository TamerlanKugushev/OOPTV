package model;

import java.util.Comparator;

public class MyComp implements Comparator<Size> {
    @Override
    public int compare(Size o1, Size o2) {
        if(o1.getDiag() == o2.getDiag())
            return -Double.compare(o1.getWidth(), o2.getWidth());
        return -Double.compare(o1.getDiag(), o2.getDiag());
    }
}
