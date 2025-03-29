// Step 1: Define the Mediator Interface
interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

// Step 2: Create the Colleague Class
abstract class Colleague {
    protected Mediator mediator;

    // Constructor to set the mediator for each colleague
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // Method to send messages via the mediator
    public abstract void send(String message);

    // Method to receive messages
    public abstract void receive(String message);
}

// Step 3: Implement Concrete Colleagues
class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague A sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague A received message: " + message);
    }
}

class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague B sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague B received message: " + message);
    }
}

// Step 4: Create the Concrete Mediator
class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    // Set the colleagues who will communicate via this mediator
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    // Send message to the appropriate colleague based on the message
    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receive(message);
        } else {
            colleagueA.receive(message);
        }
    }
}

// Step 5: Demonstrate the Mediator Pattern in Action
public class MediatorPatternDemo {
    public static void main(String[] args) {
        // Create the mediator and colleagues
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        // Set the colleagues in the mediator
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        // Colleague A sends a message to Colleague B via the mediator
        colleagueA.send("Hello, B!");

        // Colleague B sends a message to Colleague A via the mediator
        colleagueB.send("Hi, A! How are you?");
    }
}
