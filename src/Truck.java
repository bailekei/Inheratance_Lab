public class Truck extends  Vehicle implements Move{

    double towingCapacity;

    /*****************************************************************************************************
     * This method implements drive() from the Move interface
     * @return String
     ****************************************************************************************************/

    @Override
    public String drive() {
        return "Chugg!";
    }
}
