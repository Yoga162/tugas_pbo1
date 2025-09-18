public class Customer {
    private String nama;
    private String nomer_ktp;
    private String alamat;

public Customer(String nama, String nomer_ktp, String alamat)  {
    this.nama = nama;
    this.nomer_ktp = nomer_ktp;
    this.alamat = alamat;
}

public String getNama()  {
    return nama;
}

public String getNomer_ktp()  {
    return nomer_ktp;
}

public String getAlamat()   {
    return alamat;
}

public void info() {
    System.out.println("Nama Costumer: " + nama + " Nomor KTP: " + nomer_ktp + " Alamat: " + alamat);
}
}
