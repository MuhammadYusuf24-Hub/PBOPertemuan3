/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class Harimau implements Berburu, Makan, Bersuara {

    String nama;

    public Harimau(String nama) {
        this.nama = nama;
    }

    public void berburu() {
        System.out.println("===== Harimau Sumatra =====");
        System.out.println(nama + " sedang berburu rusa di hutan.");
    }

    public void makan() {
        System.out.println(nama + " sedang memakan makanan hasil buruan. ");
    }

    public void bersuara() {
        System.out.println(nama + " mengaum keras: Roooarrr!");
    }

    public static void main(String[] args) {
        Harimau h = new Harimau("Harimau Sumatra");
        h.berburu();
        h.makan();
        h.bersuara();
    }

}
