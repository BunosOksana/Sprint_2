package model;
import model.constans.Colour;
import model.constans.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price,String colour){
        super(amount, price, true);
        this.colour=colour;
    }


@Override
public double getDiscount(){
 if (Colour.RED.equalsIgnoreCase(colour)){
     return Discount.RED_APPLE_DISCOUNT;
 } else {
     return 0;
 }
}
public String getColour(){
        return colour;
}
}
