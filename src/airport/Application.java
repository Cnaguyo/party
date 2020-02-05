package airport;

public class Application {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        airplane.loadPassengers(" ABC123 ", 43);
        airplane.UnloadPassengers(" ABC123 ");
        airplane.Land(" ABC123 ");
        airplane.takeOff(" ABC123 ");

        Airplane airplane2 = new Airplane();
        airplane2.loadPassengers(" DDD888 ",23 );
            airplane2.UnloadPassengers(" DDD888 ");
            airplane2.Land(" ABC123 ");
            airplane2.takeOff(" DDD888 ");

    }
}



