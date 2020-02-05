package SuperMarket;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // CashRegister cashRegister = new CashResgister()
        // cashRegister.addProduct(new Product("soap", 3));
        Product product = new Product(" soap ",3);
        Product product1 = new Product("cereals ", (int) 2.5);
        Product  product2 = new Product(" chinese vegetables ",5);
        Product product3 = new Product(" yoghourt ", 2);
        Product product4 = new Product(" Diapers ", 10);

        List<Product> products = new ArrayList<>();
        product.setProductType(" soap ");
        product.setPriceOfProduct(3);
        products.add(product);
        product1.setProductType(" cereals");
        product1.setPriceOfProduct((int) 2.5);
        products.add(product1);
        product2.setProductType(" chinese vegetables ");
        product2.setPriceOfProduct(5);
        products.add(product2);
        product3.setProductType(" yoghourt ");
        product3.setPriceOfProduct(2);
        products.add(product3);
        product4.setProductType(" Diapers ");
        product4.getPriceOfProduct(10);
        products.add(product4);
        for (Product p: products){
            System.out.println(p.getPriceOfProduct());
            System.out.println(p.getProductType());
        }

    }
}
