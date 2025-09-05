/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overload_Override;

/**
 *
 * @author LENOVO
 */
public class Motor extends Kendaraan {

    public Motor(String merk) {
        super(merk); // panggil constructor induk
    }

    @Override
    public void berjalan() {
        System.out.println("Motor merk " + merk + " melaju di jalan raya...");
    }

    // class utama
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan("Honda");
        Motor m = new Motor("Yamaha");
        
        k.berjalan();   // output: Kendaraan dengan merk Honda  sedang berjalan...
        m.berjalan();   // output: Motor merk Yamaha melaju di jalan raya...
    }
}

