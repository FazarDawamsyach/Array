import java.util.Scanner;
class Mahasiswa {
   protected String nim;
   protected String nama;
   protected String jurusan;
   protected float ipk;

   public Mahasiswa (String nim,String nama,String jurusan,float ipk) {
    this.nim = nim;
    this.nama = nama;
    this.jurusan = jurusan;
    this.ipk =ipk ;

   }
   public String getNim () {
    return nim;
   }
   public String getNama () {
    return nama;
   }
   public String getJurusan () {
    return jurusan;
   }
   public float getIpk () {
    return ipk;
   }
    public void setNim ( String nim) {
        this.nim = nim;
    }
    public void setNama ( String nama) {
        this.nama = nama;
    }
    public void setJurusan ( String jurusan) {
        this.jurusan = jurusan;
    }
    public void setIpk (float ipk) {
        this.ipk = ipk;
    }
}
public class BacaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x;
        String NIM,NAMA,JUR;
        float IPK;
        System.out.print("Silakan masukkan jumlah data : ");
        x=scan.nextInt();
        Mahasiswa[] arrayMhs = new Mahasiswa [x];
        for (int i = 0;i<x;i++){
            scan.nextLine();
        System.out.print("Masukkan NIM : ");
        NIM = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        NAMA = scan.nextLine();
        System.out.print("Masukkan Jurusan: ");
        JUR = scan.nextLine();
        System.out.print("Masukkan IPK : ");
        IPK = scan.nextFloat();
        Mahasiswa mhs = new Mahasiswa (NIM,NAMA,JUR,IPK);
        arrayMhs [i] = mhs;
        System.out.println (" ");
        }
        System.out.println("==DAFTAR MAHASISWA YANG TELAH DIINPUT==");
        for (int i = 0; i<arrayMhs.length; i++ ) {
            
            System.out.println("\nMahasiswa ke-"+(i+1));
            System.out.println("NIM     : "+arrayMhs[i].getNim());
            System.out.println("Nama    : "+arrayMhs[i].getNama());
            System.out.println("Jurusan : "+arrayMhs[i].getJurusan());
            System.out.println("IPK     : "+arrayMhs[i].getIpk());
}
}
}