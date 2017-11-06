package com.fyakut;

public class Hamburger {
    private  String ismi;
    private String ekmekcesidi;
    private String etcesidi;
    private double fiyati;

    private String ilaveUrunad1;
    private double ilaveUrunucret1;
    private String ilaveUrunad2;
    private double ilaveUrunucret2;
    private String ilaveUrunad3;
    private double ilaveUrunucret3;
    private String ilaveUrunad4;
    private double ilaveUrunucret4;

    public void ekleİlaveUrun1(String ad,double ucret){
        this.ilaveUrunad1=ad;
        this.ilaveUrunucret1=ucret;
    }
    public void ekleİlaveUrun2(String ad,double ucret){
        this.ilaveUrunad2=ad;
        this.ilaveUrunucret2=ucret;
    }
    public void ekleİlaveUrun3(String ad,double ucret) {
        this.ilaveUrunad3 = ad;
        this.ilaveUrunucret3 = ucret;
    }
        public void ekleİlaveUrun4(String ad,double ucret){
            this.ilaveUrunad4=ad;
            this.ilaveUrunucret4=ucret;


    }

    public Hamburger() {
    }

    public Hamburger(String ismi, String ekmekcesidi, String etcesidi, double fiyati) {
        this.ismi = ismi;
        this.ekmekcesidi = ekmekcesidi;
        this.etcesidi = etcesidi;
        this.fiyati = fiyati;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekcesidi() {
        return ekmekcesidi;
    }

    public void setEkmekcesidi(String ekmekcesidi) {
        this.ekmekcesidi = ekmekcesidi;
    }

    public String getEtcesidi() {
        return etcesidi;
    }

    public void setEtcesidi(String etcesidi) {
        this.etcesidi = etcesidi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }
    public double tumBilgiler(){
            double toplamucret=this.fiyati;
        System.out.println("hamburger adı:"+ismi+"\nekmek turu:"+ekmekcesidi+"\net cesidi:"+etcesidi+"\nfiyatı:"+fiyati);

        if (ilaveUrunad1!=null)
            toplamucret+=this.ilaveUrunucret1;
        System.out.println("ilave urun:"+this.ilaveUrunad1+"ilave urun ucreti:"+this.ilaveUrunucret1);
        if (ilaveUrunad2!=null)
            toplamucret+=this.ilaveUrunucret2;
        System.out.println("ilave urun:"+this.ilaveUrunad2+"ilave urun ucreti:"+this.ilaveUrunucret2);
        if (ilaveUrunad3!=null)
            toplamucret+=this.ilaveUrunucret3;
        System.out.println("ilave urun:"+this.ilaveUrunad3+"ilave urun ucreti:"+this.ilaveUrunucret3);
        if (ilaveUrunad4!=null)
            toplamucret+=this.ilaveUrunucret4;
        System.out.println("ilave urun:"+this.ilaveUrunad4+"ilave urun ucreti:"+this.ilaveUrunucret4);
            return toplamucret;
    }
}
