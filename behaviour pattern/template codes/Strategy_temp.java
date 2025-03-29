// Step 1: Define the Strategy Interface
interface Strategy {
    void execute(); // A method that each concrete strategy will implement
}

// Step 2: Implement Concrete Strategies
class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy A");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy B");
    }
}

// Step 3: Create a Context Class
class Context {
    private Strategy strategy; // Strategy instance to use

    // Constructor to inject the strategy
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method to set/change the strategy dynamically
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Execute the strategy
    public void executeStrategy() {
        strategy.execute();
    }
}

// Step 4: Demonstrate the Strategy Pattern in Action
public class Strategy_temp {
    public static void main(String[] args) {
        // Use Strategy A
        Context context = new Context(new ConcreteStrategyA());
        System.out.println("Using Strategy A:");
        context.executeStrategy();

        // Switch to Strategy B
        System.out.println("\nSwitching to Strategy B:");
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
