package com.fyakut;

public class BabaBurger extends Hamburger {
    public BabaBurger() {
        super("bababurger", "beyaz ekmek", "kırmızı et", 14.0);
        super.ekleİlaveUrun1("cola",5);
        super.ekleİlaveUrun2("patates",3.5);
    }

    @Override
    public void ekleİlaveUrun1(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleİlaveUrun2(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleİlaveUrun3(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }

    @Override
    public void ekleİlaveUrun4(String ad, double ucret) {
        System.out.println("ilave ürün ekleyemezsiniz");
    }
}
