package Domain;

public class Product {
    private String name;
    private int price;
    private PrType type;

    public Product(String name, int price, PrType type) {
        this.name = name;
        this.type = type;

        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
         if(price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 10;
        }
    }

    @Override
    public String toString()
    {
        return "Product: price="+ this.price+"; name="+this.name+"; type="+this.type.getName();
    }

    public PrType getType() {
        return type;
    }
    
}
