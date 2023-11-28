public class EngineVehicle extends Vehicle {
    protected boolean engineStarted;

    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    protected boolean isEngineStarted() {
        return engineStarted;
    }

}