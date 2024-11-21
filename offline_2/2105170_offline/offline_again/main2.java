import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main2 {
    
    public static void main(String[] args) {
        List<Item2> menu = new ArrayList<Item2>();
        menu.add(new Burger());     
        menu.add(new Fries());
        menu.add(new Wedges());
        menu.add(new Shawarma());
        menu.add(new Drinks());

        Combo2 combo1= new Combo2("Combo1");
        combo1.addItem(new Burger());
        combo1.addItem(new Fries());
        combo1.addItem(new Drinks());
        combo1.setDiscount(5);
        

        Combo2 combo2= new Combo2("Combo2");
        combo2.addItem(new Shawarma());
        combo2.addItem(new Drinks());
        combo2.setDiscount(5);


        menu.add(combo1);
        menu.add(combo2);

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
                    Combo2 newCombo = new Combo2(comboName);


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
                            if(newCombo!=null){
                                menu.add(newCombo);

                                System.out.println();
                                System.out.println();
                                System.out.println("Your combo:");
                                System.out.println();
                                System.out.println(comboName);
                                for (Item2 item : newCombo.getItems()) {
                                    if (item instanceof Combo2) {
                                        System.out.println("    - " + item.getName() + "(" + ((Combo2) item).getItems().get(0).getFood() + ")");
                                    } else {
                                        System.out.println("    - " + item.getFood());
                                    }
                                }
                                
                                for (Item2 item : newCombo.getItems()) {
                                    System.out.println("    - " +item.getFood());
                                }
                                System.out.println();
                                System.out.println("Total - "+newCombo.getPrice());
                                System.out.println("Discount - "+ newCombo.getDiscount()+"%");
                                System.out.println("Discounted Total - "+ newCombo.getDiscountedPrice());
                                System.out.println();
                            
                                break;
                            }
                            
                            else{
                                System.out.println("No items added to the combo. Try again.");
                            }
                        }
                        else if(option.equalsIgnoreCase("add")){
                            option=scanner.next();

                            for(Item2 item:menu){
                                if(item.getName().equalsIgnoreCase(option)){
                                    newCombo.addItem(item);
                                    break;
                                }
                            }
                        
                        }
                        else if(option.equalsIgnoreCase("remove")){
                            option=scanner.next();

                            for(Item2 item:newCombo.getItems()){
                                if(item.getName().equalsIgnoreCase(option)){
                                    newCombo.removeItem(item);
                                    break;
                                }
                            }
                        }
                        else if(option.equalsIgnoreCase("free")){
                            option=scanner.next();

                            for(Item2 item:menu){
                                if(item.getName().equalsIgnoreCase(option)){
                                    Combo2 temp=new Combo2(item.getName()+"(Free!!!)");
                                    temp.addItem(item);
                                    temp.setDiscount(100);
                                    newCombo.addItem(temp);
                                    break;
                                }
                            }
                        }

                        else if(option.equalsIgnoreCase("discount")){
                            int percentage=scanner.nextInt();
                            newCombo.setDiscount(percentage);
                        }
                        else{
                            System.out.println("Command not recognized. Try again.");
                        }
                    }
                    break;

                case 2:

                    System.out.println();
                    System.out.println("Menu:");
                    for (Item2 item : menu) {
                        System.out.println(item.getFood() + " - " + item.getDiscountedPrice());
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
