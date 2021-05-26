package javapertama.praktikumPBO5;

public final class FinalClassOperasiBilangan {
    public static void main (String [] args){
        
        System.out.println("========================");
        System.out.println(" -- Operasi Bilangan -- ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        AbstractClassOperasiBilangan[] a = new AbstractClassOperasiBilangan[4];
     
        a[0] = new ClassOperasiPenjumlahan();
        a[1] = new ClassOperasiPengurangan();
        a[2] = new ClassOperasiPerkalian();
        a[3] = new ClassOperasiPembagian();
        
        for (AbstractClassOperasiBilangan a1 : a) {
            a1.setA(10.5);
            a1.setB(0.5);
            a1.tampil();
        }
        System.out.println("=======================");
    }
}
