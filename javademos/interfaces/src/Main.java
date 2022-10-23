public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.Add();

        //yöntem 1
       /* CustomerManager customerManager= new CustomerManager();
        customerManager.customerDal= new OracleCustomerDal();
        customerManager.add();*/

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}