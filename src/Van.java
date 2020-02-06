public class Van extends Vehicle implements Move{

    int internalVolume;

    /*****************************************************************************************************
     * This method implements drive() from the Move interface
     * @return String
     ****************************************************************************************************/

    @Override
    public String drive() {
        return "Putt-putt!";
    }
}
