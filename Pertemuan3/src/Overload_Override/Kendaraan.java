/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overload_Override;

/**
 *
 * @author LENOVO
 */
public class Kendaraan {
    
    protected String merk;

    // constructor
    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void berjalan() {
        System.out.println("Kendaraan dengan merk " + merk + " sedang berjalan...");
    }

}


