class Calisan
{
    private String ad;
    private String soyad;
    private int id;
    
    public Calisan(String ad, String soyad, int id)
    {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    
    public String getAd()
    {
        return ad;
    }
    
    public String getSoyad()
    {
        return soyad;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setAd(String ad)
    {
        this.ad = ad;
    }
    
    public void setSoyad(String soyad)
    {
        this.soyad = soyad;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void bilgileriGoster()
    {
        System.out.println("Çalışan Bilgileri....." + "\nAd: " + ad + "\nSoyad: " + soyad + "\nId: " + id);
    }
}
