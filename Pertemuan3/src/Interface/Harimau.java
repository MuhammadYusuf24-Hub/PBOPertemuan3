/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class Harimau implements Gerakan, Suara, Aktivitas {

    String nama;

    public Harimau(String nama) {
        this.nama = nama;
    }

    public void berjalan() {
        System.out.println(nama + " berjalan pelan di hutan");
    }

    public void berlari() {
        System.out.println(nama + " berlari kencang mengejar mangsa");
    }

    public void mengaum() {
        System.out.println(nama + " mengaum keras: ROARRR!");
    }

    public void mendengkur() {
        System.out.println(nama + " mendengkur saat beristirahat");
    }
    
    public void berburu() {
        System.out.println(nama + " sedang berburu rusa");
    }

    public void tidur() {
        System.out.println(nama + " tidur nyenyak di bawah pohon besar");
    }

    public static void main(String[] args) {
        Harimau harimauSumatra = new Harimau("Harimau Sumatra");
        
        System.out.println("===== Harimau Sumatra ======");
        harimauSumatra.berjalan();
        harimauSumatra.berlari();
        harimauSumatra.mengaum();
        harimauSumatra.mendengkur();
        harimauSumatra.berburu();
        harimauSumatra.tidur();
    }

}
