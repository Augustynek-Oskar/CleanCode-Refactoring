public class NonEngineVehicle extends Vehicle{
    @Override
    protected void stopEngine() {
        System.out.println("There is no engine!");
    }

    @Override
    protected void startEngine() {
        System.out.println("There is no engine!");
    }

    @Override
    protected boolean isEngineStarted() {
        return false;
    }
}
