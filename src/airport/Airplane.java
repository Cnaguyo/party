package airport;

public class Airplane {
    // all the fields should be up
    private String planeIdentification;
    private int numberOfPassenger;
    private int currentNumberOfPassenger;
    private boolean isCurrentlyFlying;
    private int CruiseSpeed;

    public void loadPassengers(String planeIdentification, int numberOfPassenger) {
        System.out.println(planeIdentification + "loads" + numberOfPassenger + "passengers");
        this.currentNumberOfPassenger = this.currentNumberOfPassenger + numberOfPassenger;
    }


    public void UnloadPassengers(String planeIdentification) {
        System.out.println(planeIdentification + " unload " + this.currentNumberOfPassenger + " passengers ");
        this.currentNumberOfPassenger = 0;
    }


    public void Land(String planeIdentification) {
        System.out.println(planeIdentification + " Land ");

    }
    public void takeOff(String planeIdentification) {
        System.out.println(planeIdentification + " takeOff ");

    }
}













