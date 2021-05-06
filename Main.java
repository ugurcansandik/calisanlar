import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
	    int secim = 0;
		String islemler = ("İşlemler...\n"
		                    + "1. Yazilimci İşlemleri.\n"
		                    + "2. Yönetici İşlemleri.\n"
		                    + "Çıkış için -1 giriniz.\n\n"
		                    + "İşlemi Seçiniz.");
        String yazilimciIslemler = ("Yazilmci İşlemleri...\n"
		                    + "1. Format At.\n"
		                    + "2. Bilgileri Göster.\n"
		                    + "Çıkış için -1 giriniz.\n\n"
		                    + "İşlemi Seçiniz => ");
        String yoneticiIslemler = ("Yonetici İşlemleri...\n"
		                    + "1. Zam yap.\n"
		                    + "2. Çalışan Sayısını Göster.\n"
		                    + "Çıkış için -1 giriniz.\n\n"
		                    + "İşlemi Seçiniz => ");
		
		System.out.println("Çalışanlar Programına Hoşgeldiniz....");
		while(secim != -1)
		{
    		System.out.println(islemler);
    		secim = scanner.nextInt();
    		switch(secim)
    		{
    		    case 1:
    		        while(secim != -1)
    		        {
    		            Yazilimci yazilimci = new Yazilimci("Uğurcan", "Sandık", 1, "Java,C,Python,C#");
    		            System.out.print(yazilimciIslemler);
    		            secim = scanner.nextInt();
    		            switch(secim)
    		            {
    		                case 1:
    		                    String isletimSistemi;
    		                    System.out.println("Hangi işletim sistemine format atmak istiyorsunuz?");
    		                    scanner.nextLine(); //isletimSistemi değişkenini boş almaması için koydum
    		                    isletimSistemi = scanner.nextLine();
    		                    yazilimci.formatAt(isletimSistemi);
    		                    break;
		                    case 2:
		                        yazilimci.bilgileriGoster();
		                        break;
	                        case -1:
	                            System.out.println("Ana Menüye Yönlendiriliyorsunuz....");
	                            break;
	                        default:
	                            System.out.println("Geçerli giriş yapmadınız. Yazilimci Menüsüne Yönlendiriliyorsunuz....");
                                break;
    		            }
    		        }
    		        break;
		        case 2:
		            while(secim != -1)
    		        {
    		            Yonetici yonetici = new Yonetici("Ugurcan", "Sandik", 2, 17);
    		            System.out.print(yoneticiIslemler);
    		            secim = scanner.nextInt();
    		            switch(secim)
    		            {
    		                case 1:
    		                    int zamMiktari;
    		                    System.out.println("Yüzde kaç zam yapmak istiyorsunuz?");
    		                    scanner.nextLine(); //isletimSistemi değişkenini boş almaması için koydum
    		                    zamMiktari = scanner.nextInt();
    		                    yonetici.zamYap(zamMiktari);
    		                    break;
		                    case 2:
		                        yonetici.bilgileriGoster();
		                        break;
	                        case -1:
	                            System.out.println("Ana Menüye Yönlendiriliyorsunuz....");
	                            break;
	                        default:
	                            System.out.println("Geçerli giriş yapmadınız. Yazilimci Menüsüne Yönlendiriliyorsunuz....");
                                break;
    		            }
    		        }
		            break;
	            case -1:
	                System.out.println("Programdan Çıkılıyor.....");
	                break;
                default:
                    System.out.println("Geçerli giriş yapmadınız. Ana Menüye Yönlendiriliyorsunuz....");
                    break;
    		}
		}
	}
}
