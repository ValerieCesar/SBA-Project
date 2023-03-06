package src;

/*
1. Create a superclass called Car. 
The Car class has the following fields and methods:

- int speed;
- double regularPrice;
- String color;
- double getSalePrice();
*/

public class Car {
    int speed;
   private double regularPrice;
    String color;

   public Car(int speed, double regularPrice, String color) {
       this.speed = speed;
       this.regularPrice = regularPrice;
       this.color = color;
   }

   public double getSalePrice() {
       return regularPrice;
   }
}
