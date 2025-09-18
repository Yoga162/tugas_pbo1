public class Cd {
    private String nama;
    private int tahun;
    private int jumlah;

    public Cd (String nama, int tahun, int jumlah){
       this.nama = nama;
       this.tahun = tahun;
       this.jumlah = jumlah;
    }

    public String getNama(){
        return nama;
    }

    public int getTahun(){
        return tahun;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void info () {
        System.out.println("Nama Cd: " + nama + " Tahun: " + tahun + " Jumlah: " + jumlah );
    }


}
