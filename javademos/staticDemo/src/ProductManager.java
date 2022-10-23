public class ProductManager {
    public void add(Product product){
        //ProductValidator validator = new ProductValidator();
      if (ProductValidator.isValid(product)){
          System.out.println("EKLENDİ");
      }
      else{
          System.out.println("eklenemedi");
      }
    }
}


//EĞER STATİKSE . YAPIP ÇAĞİRABİLİRSİN
//DİĞER TÜRLÜ ÇAĞIRILAMAZ NEW GEREKİR
//YAPICI BLOKLAR NEW LEYİNCE ÇALIŞIR JAVADA
//C3 DA ÖYLE DEĞİL
//javada bir class ı static yapınca içindeki classlarda static olmaz
//c sharpda olur // inner class



