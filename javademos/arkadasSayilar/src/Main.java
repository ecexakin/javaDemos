public class Main {
    public static void main(String[] args) {
        int number_1=220;
        int number_2=584;
        int total_1=0;
        int total_2=0;
        for (int i=1;i<number_1;i++){
            if (number_1%i==0){
                total_1=total_1+i;
            }
        }
        for (int j=1;j<number_2;j++){
            if (number_2 % j==0){
                total_2=total_2 +j;
            }
        }
        if (total_1==number_2 && total_2==number_1){
            System.out.println("arkadaş sayılar");
        }else{
            System.out.println("DEĞİLLER");
        }

    }
}