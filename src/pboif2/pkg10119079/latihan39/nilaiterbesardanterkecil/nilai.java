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
public class nilai {
 public int banyakMhs,max,min;
    
 public void mahasiswa(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan banyaknya mahasiswa: ");
    banyakMhs = input.nextInt();
 }
    
 public int [] isiNilai(int parBanyakMhs){ 
    Scanner input = new Scanner(System.in);
    int [] nilaiMhs = new int [banyakMhs];
    for (int i = 0; i < banyakMhs; i++){
    System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
    nilaiMhs[i] = input.nextInt();
    }
    max = nilaiMhs[0];
    min = nilaiMhs[0];
    for (int i = 0; i < banyakMhs; i++){
        if (nilaiMhs[i] > max){
            max = nilaiMhs[i];
            }
        else if (nilaiMhs[i] < min){
            min = nilaiMhs[i];
        }
    }
        
    System.out.println("Nilai max = " + max);
    System.out.println("Nilai min = " + min);
    return nilaiMhs;
    }     
}