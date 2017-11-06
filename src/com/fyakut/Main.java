package com.fyakut;

public class Main {
	/*


	 */

    public static void main(String[] args) {
	Hamburger hamburger=new Hamburger("sade","beyaz ekmek","kırmızı et",5.9);
	hamburger.ekleİlaveUrun1("patates kızartma",3.5);
	hamburger.ekleİlaveUrun2("kola",1.5);
	hamburger.ekleİlaveUrun3("sogan halkası",3);
	hamburger.ekleİlaveUrun4("sos",5);
        System.out.println("Toplam tutar:"+hamburger.tumBilgiler());

	SaglikliHamburger sg1=new SaglikliHamburger("kırmızı",5.0);
	sg1.ekleİlaveSaglkurun1("cips",2.0);
	sg1.ekleİlaveSaglkurun2("patpat",1.5);
	sg1.tumBilgiler();

        System.out.println("Toplam tutar:"+hamburger.tumBilgiler());
        BabaBurger ba1=new BabaBurger();
        System.out.println("toplam tutarrr:"+ba1.tumBilgiler());
    }
}
