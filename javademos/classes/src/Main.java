public class Main {
    public static void main(String[] args) {
        //class => referans tiptir.
        //bellekte iki alan
        // =stack and heap
        //heapte bir şey tutulmuyorsa garbage collector onu siler


        //değer tipler : int,double...
        //her şey stackte
        //int sayi1 : 10
        //int sayi2:20
        //sayi2:sayi1
        //sayi1=30
        //sayi2 ?  10dur


        //DİZİLER referans tiptir


        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}