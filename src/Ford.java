package src;

/* 
3. Create a subclass of the Car class and name it Ford.
The Ford class has the following fields and methods

- int year;
- int manufacturerDiscount;
- double getSalePrice(); // for this method implement this:
from the sale price computed from Car class, 
subtract the manufacturer Discount.
*/

public class Ford extends Car {
    int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
