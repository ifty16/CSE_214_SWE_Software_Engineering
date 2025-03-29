// Step 1: Define the Handler Interface
abstract class Handler {
    protected Handler nextHandler;  // Next handler in the chain

    // Method to set the next handler in the chain
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Abstract method to handle the request
    public abstract void handleRequest(String request);
}

// Step 2: Create Concrete Handlers
class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request A")) {
            System.out.println("Handler A is processing the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);  // Pass the request to the next handler
        }
    }
}

class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request B")) {
            System.out.println("Handler B is processing the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);  // Pass the request to the next handler
        }
    }
}

class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request C")) {
            System.out.println("Handler C is processing the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);  // Pass the request to the next handler
        }
    }
}

// Step 3: Demonstrate the Chain of Responsibility Pattern in Action
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create the handlers
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // Set up the chain of responsibility
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        // Pass requests through the chain
        System.out.println("Sending Request A:");
        handlerA.handleRequest("Request A");  // Output: Handler A is processing the request.

        System.out.println("\nSending Request B:");
        handlerA.handleRequest("Request B");  // Output: Handler B is processing the request.

        System.out.println("\nSending Request C:");
        handlerA.handleRequest("Request C");  // Output: Handler C is processing the request.

        System.out.println("\nSending Unknown Request:");
        handlerA.handleRequest("Unknown Request");  // No handler processes the request
    }
}

