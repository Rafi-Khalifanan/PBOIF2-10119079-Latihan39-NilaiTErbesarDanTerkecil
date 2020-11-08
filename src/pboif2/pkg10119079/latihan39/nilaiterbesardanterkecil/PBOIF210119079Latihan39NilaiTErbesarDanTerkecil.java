package pboif2.pkg10119079.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan39NilaiTErbesarDanTerkecil {
    public static void main(String[] args) {
        String nama;
        
        Scanner input = new Scanner(System.in);
        nilai nilai = new nilai();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.printf("Masukan Nama Petugas: ");
        nama = input.nextLine();
        
        nilai.mahasiswa();
        nilai.isiNilai(nilai.banyakMhs);

        
        
    }
}
    

