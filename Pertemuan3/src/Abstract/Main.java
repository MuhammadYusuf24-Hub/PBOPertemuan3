/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {

        // Anonymous class untuk mengimplementasikan method abstrak terakhir (mengeong)
        AnakKucing mimi = new AnakKucing("Mimi") {
            public void mengeong() {
                System.out.println(nama + " mengeong kecil: Myaa~");
            }
        };

        // Menjalankan semua method
        System.out.println("===== Anak Kucing =====");
        mimi.info();
        mimi.suara();
        mimi.bermain();
        mimi.mencakar();
        mimi.mengeong();
        mimi.tidur();
    }
}
