
public class FullSystem {
    TicketingSystem ticketingSystem;
    InternetConnection internet;
    WebServer webServer;

    public FullSystem(TicketingSystem tkt, InternetConnection internet, WebServer webServer){
        ticketingSystem=tkt;
        this.internet=internet;
        this.webServer=webServer;
    }

    public void systemPreview(){

        System.out.println("");
        ticketingSystem.systemPreview();
        System.out.println("Internet Connection: "+internet.getInternetConnection());
        System.out.println("Web Server: "+webServer.getWebServer());
    }
}
