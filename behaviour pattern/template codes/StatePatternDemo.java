// Step 1: Define the State Interface
interface State {
    void handle();  // Method to be implemented by concrete states
}

// Step 2: Create Concrete States
class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("State A: Handling the request.");
    }
}

class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("State B: Handling the request.");
    }
}

// Step 3: Create the Context Class
class Context {
    private State currentState;  // Current state of the context

    // Set the initial state
    public Context(State initialState) {
        this.currentState = initialState;
    }

    // Set a new state dynamically
    public void setState(State newState) {
        this.currentState = newState;
    }

    // Delegate the request to the current state's handler
    public void request() {
        currentState.handle();
    }
}

// Step 4: Demonstrate the State Pattern in Action
public class StatePatternDemo {
    public static void main(String[] args) {
        // Create the context with an initial state
        Context context = new Context(new ConcreteStateA());

        // Handle request in the current state
        System.out.println("Initial state:");
        context.request();  // Output: State A: Handling the request.

        // Change state to ConcreteStateB
        System.out.println("\nChanging to State B:");
        context.setState(new ConcreteStateB());
        context.request();  // Output: State B: Handling the request.
    }
}

