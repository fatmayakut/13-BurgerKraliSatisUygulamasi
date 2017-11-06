package com.fyakut;

public class SaglikliHamburger extends Hamburger {
    private String ilaveUrunSglikad1;
    private double ilaveUrunSaglkucret1;
    private String ilaveUrunSaglikad2;
    private double ilaveUrunSaglikucret2;

    public SaglikliHamburger( String etcesidi, double fiyati) {
        super("Saglıklı burger", "Kepekli ekmek", etcesidi, fiyati);
    }
     public void ekleİlaveSaglkurun1(String ad,double ucret){
        this.ilaveUrunSglikad1=ad;
        this.ilaveUrunSaglkucret1=ucret;

     }

    public void ekleİlaveSaglkurun2(String ad,double ucret){
        this.ilaveUrunSaglikad2=ad;
        this.ilaveUrunSaglikucret2=ucret;

    }

    @Override
    public double tumBilgiler() {
        double toplamUcret=super.tumBilgiler();
        if (ilaveUrunSglikad1!=null)
            toplamUcret+=this.ilaveUrunSaglkucret1;
        System.out.println("ilave saglık urun:"+this.ilaveUrunSglikad1+"ilave urun ucreti:"+this.ilaveUrunSaglkucret1);
        if (ilaveUrunSaglikad2!=null)
            toplamUcret+=this.ilaveUrunSaglikucret2;
        System.out.println("ilave sağlık urun:"+this.ilaveUrunSaglikad2+"ilave urun ucreti:"+this.ilaveUrunSaglikucret2);
      return   toplamUcret;
    }
}
