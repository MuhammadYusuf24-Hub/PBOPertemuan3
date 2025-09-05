/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author LENOVO
 */
public abstract class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    // implementasi abstrak dari Hewan
    public void suara() {
        System.out.println(nama + " bersuara: Meong~");
    }

    // 1 method abstrak baru
    public abstract void bermain();

    // 1 method konkrit
    public void mencakar() {
        System.out.println(nama + " sedang mencakar!");
    }
}
