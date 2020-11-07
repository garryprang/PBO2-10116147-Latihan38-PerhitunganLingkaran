/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program perhitungan lingkaran berbasis objek.
 */
package pbo2.pkg10116147.latihan38.perhitunganlingkaran;
/**
 *
 * @author Corazon
 */
public class PBO210116147Latihan38PerhitunganLingkaran {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.println("======= Perhitungan Lingkaran =======");
        lingkaran.inputDiameter();
        System.out.println("");
        System.out.println("========= Hasil Perhitungan =========");
        System.out.println("Jari-Jari Lingkaran = "+ lingkaran.hitungJariJari() +" cm");
        System.out.println("Luas Lingkaran      = "+ lingkaran.hitungLuas() + " cm");
        System.out.println("Keliling Lingkaran  = "+ lingkaran.hitungKeliling()+" cm");
    }
}
