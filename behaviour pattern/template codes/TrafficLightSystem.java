// Step 1: State Interface
interface TrafficLightState {
    void switchLight(TrafficLight trafficLight);
}

// Step 2: Concrete States
class RedState implements TrafficLightState {
    @Override
    public void switchLight(TrafficLight trafficLight) {
        System.out.println("Red Light ON for 5 seconds.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.setState(new YellowState());
    }
}

class YellowState implements TrafficLightState {
    @Override
    public void switchLight(TrafficLight trafficLight) {
        System.out.println("Yellow Light ON for 2 seconds.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.setState(new GreenState());
    }
}

class GreenState implements TrafficLightState {
    @Override
    public void switchLight(TrafficLight trafficLight) {
        System.out.println("Green Light ON for 10 seconds.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        trafficLight.setState(new RedState());
    }
}

// Step 3: Context Class
class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        this.currentState = new RedState(); // Initial state is Red
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void operate() {
        while (true) {
            currentState.switchLight(this);
        }
    }
}

// Step 4: Main Class
public class TrafficLightSystem {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.operate();
    }
}