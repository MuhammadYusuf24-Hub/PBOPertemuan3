/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author LENOVO
 */
public abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // 1 method abstrak
    public abstract void suara();

    // 1 method sudah diimplementasikan
    public void info() {
        System.out.println("Ini adalah hewan bernama " + nama);
    }

}
