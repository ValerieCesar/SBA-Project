/*
1. Create a superclass called Car. 
The Car class has the following fields and methods:

- int speed;
- double regularPrice;
- String color;
- double getSalePrice();
*/

// public class Car {
//     int speed;
//    private double regularPrice;
//     String color;

//    public Car(int speed, double regularPrice, String color) {
//        this.speed = speed;
//        this.regularPrice = regularPrice;
//        this.color = color;
//    }

//    public double getSalePrice() {
//        return regularPrice;
//    }
// }


/*
2. Create a subclass of the Car class and name it Truck. 
The Truck class has the following fields and methods.

- int weight;
- double getSalePrice(); // for this method implement this:
If weight > 2000, 10% discount. Otherwise, 20% discount.
*/

// public class Truck extends Car {
//     private int weight;

//     public Truck(int speed, double regularPrice, String color, int weight) {
//         super(speed, regularPrice, color);
//         this.weight = weight;
//     }

//     public double getSalePrice() {
//         // for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.
//         return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
//     }
// }

/* 
3. Create a subclass of the Car class and name it Ford.
The Ford class has the following fields and methods

- int year;
- int manufacturerDiscount;
- double getSalePrice(); // for this method implement this:
from the sale price computed from Car class, 
subtract the manufacturer Discount.
*/

// public class Ford extends Car {
//     int year;
//     public int manufacturerDiscount;

//     public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
//         super(speed, regularPrice, color);
//         this.year = year;
//         this.manufacturerDiscount = manufacturerDiscount;
//     }

//     public double getSalePrice() {
//         return super.getSalePrice() - manufacturerDiscount;
//     }
// }

/*
4. Create a subclass of the Car class and name it Sedan. 
The Sedan class has the following fields and methods.

- int length;
- double getSalePrice(); // for this method implement this: 
If length > 20 feet, 5% discount, Otherwise, 10% discount 
*/

// public class Sedan extends Car {
//     private int length;

//     public Sedan(int speed, double regularPrice, String color, int length) {
//         super(speed, regularPrice, color);
//         this.length = length;
//     }

//     public double getSalePrice() {
//         // for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount
//         return super.getSalePrice() * (length < 20 ? 0.95 : 0.90);
//     }
// }

/*
5. Create MyOwnAutoShop class which contains the main() method. 
Perform the following within the main() method.

Create an instance of the Sedan class and initialize all the fields with appropriate values. 
Use super(...) method in the constructor for initializing the fields of the superclass.

Create two instances of the Ford class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the super class.

Create an instance of the Car class and initialize all the fields with appropriate values. 
Display the sale prices of all instances.
*/

// public class MyOwnAutoShop {
//     public static void main(String[] args) {
//         Sedan sedan = new Sedan(105,65000,"matte black",27);
//         Ford ford1st = new Ford(90,40000,"grey", 2012,20);
//         Ford ford2nd = new Ford(65,20000,"tan",2009,25);
//         Car car = new Car(75,50000,"white");
        
//         System.out.println("The Sedan costs "+ sedan.getSalePrice());
//         System.out.println("The first ford costs "+ ford1st.getSalePrice());
//         System.out.println("The second ford costs "+ ford2nd.getSalePrice());
//         System.out.println("The average cost of a car is "+ car.getSalePrice());
//     }
// }

/* Deliverables: Please, 
Push your code to GitHub then submit the link to the repository via Canvas.*/