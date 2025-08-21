import model.*;
import model.constans.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма без скидки: " + cart.getPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма со скидкой: " + cart.getPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов: " + cart.getPriceVegetarianWithoutDiscount() + " руб.");
    }
}
