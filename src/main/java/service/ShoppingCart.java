package service;
import model.Food;
import model.Discountable;

public class ShoppingCart {
private Food[]foods;
public ShoppingCart(Food[]foods){
    this.foods=foods;
}
    public double getPriceWithoutDiscount() {
        double sum = 0.0;
        for (int i=0; i< foods.length; i++) {
            sum += foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;
    }

    public double getPriceWithDiscount() {
        double sum = 0.0;
        double discount=0.0;
        for (int i=0;i< foods.length;i++) {
            discount = foods[i].getAmount()*foods[i].getPrice()*((Discountable)foods[i]).getDiscount();
            sum +=foods[i].getAmount()*foods[i].getPrice()-discount;
        }
        return sum;
    }

    public double getPriceVegetarianWithoutDiscount() {
        double sum = 0;
        for (int i=0;i< foods.length;i++) {
            if (foods[i].getIsVegetarian()==true) {
                sum+=foods[i].getAmount()*foods[i].getPrice();
            } else {
                sum=sum;
            }
        }
        return sum;
    }
}

