package Domain;

public class HotDrink extends Product{
    private double temp;

    public HotDrink(String name, int price, double temp) {
        super(name, price, new PrType("HotDrink"));
        this.temp = temp;
    }

    public double getHotDrinkTemp() {
        return temp;
    }

    @Override
    public String toString()
    {
        return super.toString()+"; temp="+this.temp; 
    }
    
}
