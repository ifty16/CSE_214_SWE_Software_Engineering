package offline_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> menu = new ArrayList<Item>();
        menu.add(new Burger());     
        menu.add(new Fries());
        menu.add(new Wedges());
        menu.add(new Shawarma());
        menu.add(new Drinks());

        Combo combo1= new Combo("Combo1");
        combo1.addItem(new Burger());
        combo1.addItem(new Fries());
        combo1.addItem(new Drinks());
        ItemDecorator discountedCombo1=new DiscountedItem(combo1, 5);

        Combo combo2= new Combo("Combo2");
        combo2.addItem(new Shawarma());
        combo2.addItem(new Drinks());
        ItemDecorator discountedCombo2=new DiscountedItem(combo2, 5);

        menu.add(discountedCombo1);
        menu.add(discountedCombo2);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Press 1 to create a combo, 2 to view menu and 0 to exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter combo name:");
                    String comboName = scanner.nextLine();
                    Combo newCombo = new Combo(comboName);
                    DiscountedItem discountedCombo=null;

                    System.out.println("Enter items for the combo (type 'done' to finish):");
                    while (true) {
                        System.out.println();
                        System.out.println();

                        System.out.println("Available commands:");
                        System.out.println("Add [item]");
                        System.out.println("Remove [item]");
                        System.out.println("Free [item]");
                        System.out.println("Discount [percentage]");
                        System.out.print("Enter command: ");
                        String  option= scanner.next();


                        if (option.equalsIgnoreCase("done")) {
                            if(discountedCombo!=null){
                                menu.add(discountedCombo);


                                System.out.println();
                                System.out.println();
                                System.out.println("Your combo:");
                                System.out.println();
                                System.out.println(comboName);
                                
                                for (Item item : discountedCombo.getCombo().getItems()) {
                                    System.out.println("    - " +item.getFood());
                                }
                                System.out.println();
                                System.out.println("Total - "+discountedCombo.getCombo().getPrice());
                                System.out.println("Discount - "+ discountedCombo.getDiscount()+"%");
                                System.out.println("Discounted Total - "+ discountedCombo.getPrice());
                                System.out.println();
                            
                                break;
                            }
                            else if(newCombo!=null){
                                menu.add(newCombo);

                                System.out.println();System.out.println();


                                System.out.println("Your combo:");
                                System.out.println();
                                System.out.println(comboName);
                                System.out.println();
                                
                                for (Item item : newCombo.getItems()) {
                                    System.out.println( "      - " + item.getFood() );
                                }
                                System.out.println();
                                System.out.println("Total - "+newCombo.getPrice());
                                System.out.println();
                                break;
                                
                            }
                            else{
                                System.out.println("No items added to the combo. Try again.");
                            }
                        }
                        else if(option.equalsIgnoreCase("add")){
                            option=scanner.next();

                            for(Item item:menu){
                                if(item.getName().equalsIgnoreCase(option)){
                                    newCombo.addItem(item);
                                    break;
                                }


                            }
                        
                        }
                        else if(option.equalsIgnoreCase("remove")){
                            option=scanner.next();

                            for(Item item:newCombo.getItems()){
                                if(item.getName().equalsIgnoreCase(option)){
                                    newCombo.removeItem(item);
                                    break;
                                }
                            }
                        }
                        else if(option.equalsIgnoreCase("free")){
                            option=scanner.next();

                            switch (option.toLowerCase()) {
                                case "burger":
                                    ItemDecorator freeBurger=new FreeItem(new Burger());
                                    newCombo.addItem(freeBurger);
                                    break;
                                case "fries":
                                    ItemDecorator freeFries=new FreeItem(new Fries());
                                    newCombo.addItem(freeFries);
                                    break;
                                case "wedges":
                                    ItemDecorator freeWedges=new FreeItem(new Wedges());
                                    newCombo.addItem(freeWedges);
                                    break;

                                case "shawarma":
                                    ItemDecorator freeShawarma=new FreeItem(new Shawarma());
                                    newCombo.addItem(freeShawarma);
                                    break;
                                case "drinks":  
                                    ItemDecorator freeDrinks=new FreeItem(new Drinks());
                                    newCombo.addItem(freeDrinks);
                                    break;
                                
                                default:
                                    System.out.println("Item not recognized. Try again.");
                            }
                        }

                        else if(option.equalsIgnoreCase("discount")){
                            int percentage=scanner.nextInt();
                            discountedCombo=new DiscountedItem(newCombo, percentage);
                            Combo tempCombo=new Combo(comboName);
                            tempCombo.addItem(discountedCombo);
                            newCombo=tempCombo;
                        }
                        else{
                            System.out.println("Command not recognized. Try again.");
                        }
                    }
                    break;

                case 2:

                    System.out.println();
                    System.out.println("Menu:");
                    for (Item item : menu) {
                        System.out.println(item.getFood() + " - " + item.getPrice());
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();

        
        
    }
}
