/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overload_Override;

/**
 *
 * @author LENOVO
 */
public class Lagu {

    void putarLagu(String judul) {
        System.out.println("Memutar lagu berjudul: " + judul);
    }

    void putarLagu(String judul, String penyanyi) {
        System.out.println("Memutar lagu: " + judul + " - " + penyanyi);
    }

    void putarLagu(String judul, String penyanyi, int durasi) {
        System.out.println("Memutar lagu: " + judul + " - " + penyanyi
                + " (Durasi: " + durasi + " menit)");
    }

    public static void main(String[] args) {
        Lagu l = new Lagu();

        l.putarLagu("Heathens");
        l.putarLagu("Fix You", "Coldplay");
        l.putarLagu("Bohemian Rhapsody", "Queen", 6);
    }

}
