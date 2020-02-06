public class Boat extends Vehicle implements Move{

    boolean motorized;

    /*****************************************************************************************************
     * This method implements drive() from the Move interface
     * @return String
     ****************************************************************************************************/

    @Override
    public String drive() {
        return "“I’m on a boat!";
    }
}
