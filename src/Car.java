public class Car extends Vehicle implements Move{

    int numberOfPassengers;

    /*****************************************************************************************************
     * This method implements drive() from the Move interface
     * @return String
     ****************************************************************************************************/

    @Override
    public String drive() {
        return "Vroom!";
    }
}
