
public class Director {
    TicketingSystem ticketingSystem;
    InternetConnection internetConnection;
    WebServer webServer;

    public FullSystem buildfullTicketingSystem(String pkg, String connection, String server){
        if(pkg.equalsIgnoreCase("Basic")){
            ticketingSystem=new BasicPackageBuilder();
        }
        else if(pkg.toLowerCase().equalsIgnoreCase("standard")){
            ticketingSystem=new StandardPackageBuilder();
        }
        else if(pkg.toLowerCase().equalsIgnoreCase("advanced")){
            ticketingSystem=new AdvancedPackageBuilder();
        }
        else if(pkg.toLowerCase().equalsIgnoreCase("premium")){
            ticketingSystem=new PremiumPackageBuilder();
        }
        else{
            System.out.println("Invalid package");
            return null;
        }
        
        ///buildig it
        ticketingSystem.buildTicketingSystem();

        if (connection.equalsIgnoreCase("Ethernet")){
            internetConnection=new Ethernet();
        }
        else if (connection.equalsIgnoreCase("WiFi")){
            internetConnection=new WiFi();
        }
        else if (connection.equalsIgnoreCase("SIM")){
            internetConnection=new Modules();
        }
        else{
            System.out.println("Invalid connection");
            return null;
        }

        if (server.equalsIgnoreCase("Django")){
            webServer=new Django();
        }
        else if (server.equalsIgnoreCase("NodeJs")){
            webServer=new NodeJs();
        }
        else if (server.equalsIgnoreCase("Ruby")){
            webServer=new Ruby();
        }
        else{
            System.out.println("Invalid server");
            return null;
        }

        FullSystem fs= new FullSystem(ticketingSystem, internetConnection, webServer);
        return fs;
    }

    
}
