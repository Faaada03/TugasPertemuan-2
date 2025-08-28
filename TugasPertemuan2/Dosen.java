/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author MyBook Hype AMD
 */
public class Dosen extends Manusia implements Bisnis, Mentor, Hobi {

    private String Membaca;
    private String Menulis;

    public String getMembaca() {
        return Membaca;
    }

    public String getMenulis() {
        return Menulis;
    }

    public Dosen(String Membaca, String Menulis, String berjalan, String makan, String jenisKelamin) {
        this.Membaca = Membaca;
        this.Menulis = Menulis;
        super(berjalan, makan, jenisKelamin);
    }

//dari interface Bisnis
    public void Menambah() {
        System.out.println("-Membeli stok untuk dijual.");
    }

    public void Menjual() {
        System.out.println("-Lalu Menjual baju batik secara online.");
    }

    public void Promosi() {
        System.out.println("-Dengan Mempromosikan lewat Ig,Tiktok,Facebook.");
    }

//dari interface Mentor
    public void Mengajar() {
        System.out.println("-Mengajar kelas online.");
    }

    public void Memberikan() {
        System.out.println("-Memberikan Tugas.");
    }

    public void Menilai() {
        System.out.println("-Menilai tugas setelah mengerjakan.");
    }

//dari class hobi
    public void Bermain() {
        System.out.println("-bermain Golf.");
    }

    public void Berkuda() {
        System.out.println("-Berkuda.");
    }

    public void Berenang() {
        System.out.println("-Berenang di Laut.");
    }

    public static void main(String[] args) {
        Dosen biodata = new Dosen("Membaca mata kuliah", "menulis Di papan tulis", "dan jalan-jalan ditaman", " yang suka makan makanan yang pedas", " dosen laki laki itu");

        // tampilkan biodata
        System.out.println("aldi adalah seorang" + biodata.getJenisKelamin() + biodata.getMakan());
        System.out.println("memiliki rutinitas:");
        System.out.println("1. " + biodata.getMembaca());
        System.out.println("2. " + biodata.getMenulis());
        System.out.println("3. " + biodata.getBerjalan());

        // panggil method dari interface Bisnis
        System.out.println("\nAktivitasnya sebagai pemilik Bisnis kecil kecilan :");
        biodata.Menambah();
        biodata.Menjual();
        biodata.Promosi();

        // panggil method dari interface Mentor
        System.out.println("\nAktivitasnya sebagai mentor:");
        biodata.Mengajar();
        biodata.Memberikan();
        biodata.Menilai();

        // panggil method dari Hobi
        System.out.println("\nMemiliki hobi:");
        biodata.Bermain();
        biodata.Berkuda();
        biodata.Berenang();

    }

}
