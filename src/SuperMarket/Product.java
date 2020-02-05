package SuperMarket;

public class Product {

    private String productType;
    private int priceOfProduct;

    public Product(String productType, int priceOfProduct) {
        this.productType = productType;
        this.priceOfProduct = priceOfProduct;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPriceOfProduct(int i) {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public int getPriceOfProduct(){ return priceOfProduct ; }}





















