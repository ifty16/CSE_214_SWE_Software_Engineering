import java.util.ArrayList;
import java.util.List;

// an interface for items
public interface Item2 {
    public String getFood();
    public double getPrice();
    public double getDiscountedPrice();
    public String getName();
}

class Burger implements Item2 {
    @Override
    public String getName() {
        return "Burger";
    }
    @Override
    public String getFood() {
        return "Burger";
    }
    @Override
    public double getPrice() {
        return 300;
    }
    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }
}

class Fries implements Item2 {
    @Override
    public String getName() {
        return "Fries";
    }
    @Override
    public String getFood() {
        return "Fries";
    }
    @Override
    public double getPrice() {
        return 100;
    }
    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }
}

class Wedges implements Item2 {
    @Override
    public String getName() {
        return "Wedges";
    }
    @Override
    public String getFood() {
        return "Wedges";
    }
    @Override
    public double getPrice() {
        return 150;
    }
    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }
}

class Shawarma implements Item2 {
    @Override
    public String getName() {
        return "Shawarma";
    }
    @Override
    public String getFood() {
        return "Shawarma";
    }
    @Override
    public double getPrice() {
        return 200;
    }
    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }
}

class Drinks implements Item2 {
    @Override
    public String getName() {
        return "Drinks";
    }
    @Override
    public String getFood() {
        return "Drink";
    }
    @Override
    public double getPrice() {
        return 25;
    }
    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }
}

class Combo2 implements Item2 {

    private List<Item2> items;
    private String name;
    private double discount;

    public Combo2(String name) {
        items = new ArrayList<Item2>();
        this.name = name;
        discount = 0;
    }
    public double getDiscount(){
        return discount;
    }
    public void addItem(Item2 item){
        items.add(item);
    }
    public void removeItem(Item2 item) {
        items.remove(item);
    }
    @Override
    public String getName(){
        return name;
    }
    public List<Item2> getItems(){
        return items;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    @Override
    public double getPrice(){
        double price = 0;
        for (Item2 item : items) {
            price += item.getDiscountedPrice();
        }
        return price;
    }

    @Override
    public String getFood() {
        String name = this.name + "(";
        for (Item2 item : items) {
            name += item.getFood() ;
            if (items.indexOf(item) != items.size() - 1) {
                name += " + ";
            }
        }
        name += ")";
        return name;
    }

    @Override
    public double getDiscountedPrice() {
        return this.getPrice() * (1 - discount / 100);
    }
}
