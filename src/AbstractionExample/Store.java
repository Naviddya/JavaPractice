package AbstractionExample;

abstract class Store {

    abstract  void inventorylist();

      void backup()

    {
        System.out.println("backup method has been called ");
    }

}
class outletOne extends Store
{

    @Override
    void inventorylist() {
        System.out.println("he is inventory list for base class");
    }
}

