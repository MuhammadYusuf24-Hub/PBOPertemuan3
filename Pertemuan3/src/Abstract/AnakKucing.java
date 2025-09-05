/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author LENOVO
 */
public abstract class AnakKucing extends Kucing {

        public AnakKucing(String nama) {
        super(nama);
    }

    // implementasi abstrak dari Kucing
    public void bermain() {
        System.out.println(nama + " bermain dengan bola benang.");
    }

    // 1 method abstrak baru
    public abstract void mengeong();

    // 1 method konkrit
    public void tidur() {
        System.out.println(nama + " sedang tidur di teras rumah.");
    }


}
