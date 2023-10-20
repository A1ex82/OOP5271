import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.PrType;
import Domain.Product;
import Services.CoinDispenser;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        PrType ptSnack = new PrType("Snack");
        Product p1 = new Product("Lays", 100, ptSnack);
        System.out.println( p1);

        
        Holder hold1 = new Holder();
        CoinDispenser disp = new CoinDispenser();

        List<Product> products = new ArrayList<Product>(); 

        Product p2 = new Product("Chokolate", 130, ptSnack);
        Product p3 = new Product("Nuts", 70, ptSnack);
        Bottle b1 = new Bottle("Cola", 100, 0.5);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(b1);

        VendingMachine venMach1 = new VendingMachine(hold1, disp, products);

        for(Product prod: venMach1.getProductList())
        {
            System.out.println(prod);
        }
        //System.out.println("Hello, World!");
    }
}
