package mainpackage;
import personalvehicle.Bike;
import personalvehicle.Car;
import cargovehicle.Lorry;
import cargovehicle.Ship;
class Vehicle
{
public static void main(String[] a)
{
System.out.println("ur in a main");
Bike.bikeDts();
Car.carDts();
Lorry.lorryDts();
String sh=Ship.shipDts();

System.out.println(sh);
}
}