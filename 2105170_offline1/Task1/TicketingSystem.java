
public abstract class  TicketingSystem {

   public String packagename;
   MicroController microController;
   Display display;
   Ticketing ticketing;
   PaymentTerminal paymentTerminal;
   // InternetConnection internetConnection;
   Storage storage;
   Controller controller;
   // WebServer webServer;
   


   abstract public void buildTicketingSystem();
   public void systemPreview(){
      System.out.println(packagename);
      System.out.println("MicroController: "+microController.getMicroController());
      System.out.println("Display: "+display.getDisplay());
      System.out.println("Ticketing: "+ticketing.getTicketingMethod());
      System.out.println("PaymentTerminal: "+paymentTerminal.getPaymentTerminal());
      System.out.println("Storage: "+storage.getStorage());
      System.out.println("Controller: "+controller.getController());
   }
}

class BasicPackageBuilder extends TicketingSystem {
    @Override
    public void buildTicketingSystem() {
      microController=new ATMega32();
      ticketing=microController.getTicketing();
      storage= microController.getStorage();
      display=new LCD();
      controller=display.getController();

      paymentTerminal=new Cash();
      packagename="Basic Package";
    }
}

class StandardPackageBuilder extends TicketingSystem {
   @Override
   public void buildTicketingSystem() {
      microController=new ArduinoMega();
      ticketing=microController.getTicketing();
      storage= microController.getStorage();

      display=new LED();
      controller=display.getController();
      paymentTerminal=new Cash();
      packagename="Standard Package";
   }
}

class AdvancedPackageBuilder extends TicketingSystem {
   @Override
   public void buildTicketingSystem() {
      microController=new RaspberryPi();
      ticketing=microController.getTicketing();
      storage= microController.getStorage();

      display=new OLED();
      controller=display.getController();
      paymentTerminal=new Cash();
      packagename="Advanced package";
   }
}

class  PremiumPackageBuilder extends TicketingSystem{
   @Override
   public void buildTicketingSystem() {
      microController=new RaspberryPi();
      ticketing=microController.getTicketing();
      storage= microController.getStorage();

      display=new TouchScreen();
      controller=display.getController();
      paymentTerminal=new Cash();
      packagename="Premium Package";
   }
}

