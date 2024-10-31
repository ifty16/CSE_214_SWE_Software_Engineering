package offline_2;

import java.util.ArrayList;
import java.util.List;

// an interface for items
public interface Item {
    public String getFood();
    public double getPrice();
    public String getName();
}


class Burger implements Item {
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

}

class Fries implements Item {
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
}

class Wedges implements Item {
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
}

class Shawarma implements Item {
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
}

class Drinks implements Item {
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
}

class Combo implements Item {

    private List<Item> items;
    private String name;

    public Combo(String name) {
        items = new ArrayList<Item>();
        this.name = name;
        

    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    @Override
    public String getName(){
        return name;
    }
    public List<Item> getItems(){
        return items;
    }

    @Override
    public String getFood() {
        String name = this.name + "(";
        for (Item item : items) {
            name += item.getFood() ;
            if (items.indexOf(item) != items.size() - 1) {
                name += " + ";
            }
        }
        name += ")";
        return name;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }
}


abstract class ItemDecorator implements Item {
    public Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }
    public String getFood() {
        return item.getFood();
    }
    public double getPrice() {
        return item.getPrice();
    }
}

class FreeItem extends ItemDecorator {
    public FreeItem(Item item) {
        super(item);
    
    }
    @Override
    public String getName() {
        return item.getName();
    }
    public String getFood() {
        return item.getFood() + "(Free!!!)";
    }
    public double getPrice() {
        return 0;
    }
}
class DiscountedItem extends ItemDecorator {
    private double discount;
    public Combo combo;
   
    public DiscountedItem(Combo item, double discount) {
        super(item);
        this.combo =  item;
        this.discount = discount;
    }
    @Override
    public String getName() {
        return combo.getName();
    }
    public Combo getCombo(){
        return combo;
    }
    public double getDiscount(){
        return discount;
    }
    public double getPrice() {
        return Math.round(  item.getPrice()-(item.getPrice() * discount/100) );
    }
}