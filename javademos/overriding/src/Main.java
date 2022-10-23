public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] krediManagers=new BaseCrediManager[]{new TarımKrediManager(), new OgretmenKrediManager(),new OgrenciKrediManager()};
        for (BaseCrediManager krediManager:krediManagers
             ) {
            System.out.println(krediManager.Hesapla(1000));

        }
    }
}