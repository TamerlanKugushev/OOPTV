package program;

import exceptions.InsufficientHeightException;
import model.TV;

public class Program {
    public static void main(String[] args) {
        /*Size size1 = new Size();
        Size size2 = new Size();
        if (size1 == size2) {

        } else {

        }

        if (size1.equals(size2)) {

        } else {

        }

        if(size1.compareTo(size2) > 0){

        }

        Size[] sizes = new Size[5];
        Arrays.sort(sizes);

        Arrays.sort(sizes, new Comparator<Size>() {
            @Override
            public int compare(Size o1, Size o2) {
                if(o1.getDiag() == o2.getDiag())
                    return -Double.compare(o1.getWidth(), o2.getWidth());
                return -Double.compare(o1.getDiag(), o2.getDiag());
            }
        });

        MyComp myComp = new MyComp();
        Arrays.sort(sizes, myComp);*/

        /*Size size1 = new Size();
        Size size2 = new Size(size1);

        TV tv1 = new TV();

        Size size = tv1.getSize();
        size.setWidth(45);

        System.out.println(tv1);*/

        try {
            TV tv1 = new TV("fd", "fd", 67, 7, 8, 8, 9);
            System.out.println(tv1);

            try {
                tv1.getBrand();
            } catch (ClassCastException exception) {
                exception.printStackTrace();
            }


            tv1.hashCode();
        } catch (InsufficientHeightException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("fdfd");
    }
}
