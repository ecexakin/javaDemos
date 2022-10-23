public class CustomerManager {
  //yöntem 1
  private     ICustomerDal customerDal;
      //yötnem 2
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal= customerDal;
    }
    public void add(){

        //yöntem 1
        customerDal.Add();
    }
}
