class Yazilimci extends Calisan
{
    String diller;
    public Yazilimci(String ad, String soyad, int id, String diller)
    {
        super(ad,soyad,id);
        this.diller = diller;
    }
    
    public void formatAt(String isletimSistemi)
    {
        System.out.println(isletimSistemi + " işletim sistemine format atılıyor.");
    }
    @Override
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildiği diller: " + diller);
    }
}
