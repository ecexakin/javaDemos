public class Main {
    public static void main(String[] args) {
        int number=1;
        boolean isPrime=true;
        for (int i=2;i<24;i++){
            if (number%i==0){
                isPrime=false;
            }
        }
        if (number==1){
            System.out.println("SAYI ASAL DEĞİLDİR");
            return;
        }
        if (number<1){
            System.out.println("GEÇERSİZ SAYI");
        }
        if (isPrime){
            System.out.println("sayı asal");
        }else{
            System.out.println("asal değil");
        }
    }
}