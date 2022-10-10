public class Main {
    public static void main(String[] args) {
        char grade = 'J';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
                System.out.println(" ÇOK GÜZEL GEÇTİNİZ");
                break;
            case 'C':
                System.out.println("iyi geçtinşz");
                break;
            case 'D':
                System.out.println("iyi geçtinşz");
                break;
            case 'F':
                System.out.println("geçemediniz");
                break;
            default:
                System.out.println("geçersiz not");
                break;



        }

    }
}