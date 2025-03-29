import java.util.ArrayList;
import java.util.List;

// Step 1: Define the Observer Interface
interface Observer {
    void update(String message); // Method to be called when the subject updates
}

// Step 2: Create the Subject Class
class Subject {
    private List<Observer> observers = new ArrayList<>(); // List to hold all observers
    private String state; // State that observers are interested in

    // Method to add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers about a state change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // Method to change the state and notify observers
    public void setState(String state) {
        this.state = state;
        notifyObservers(); // Notify observers about the new state
    }
}

// Step 3: Implement Concrete Observers
class ConcreteObserverA implements Observer {
    private String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

class ConcreteObserverB implements Observer {
    private String name;

    public ConcreteObserverB(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

// Step 4: Demonstrate the Observer Pattern in Action
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create the subject
        Subject subject = new Subject();

        // Create and attach observers
        Observer observerA = new ConcreteObserverA("Observer A");
        Observer observerB = new ConcreteObserverB("Observer B");
        subject.addObserver(observerA);
        subject.addObserver(observerB);

        // Change the state of the subject
        System.out.println("Updating state to 'State 1':");
        subject.setState("State 1");

        // Remove one observer and update state again
        System.out.println("\nRemoving Observer A and updating state to 'State 2':");
        subject.removeObserver(observerA);
        subject.setState("State 2");
    }
}
