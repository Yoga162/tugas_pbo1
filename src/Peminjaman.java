public class Peminjaman {
    private Cd cd;
    private Customer customer;
    private String  lama_pinjam;

    public Peminjaman (Customer cus, Cd cd, String lama_pinjam){
    this.customer = cus;
    this.cd =cd;
    this.lama_pinjam  = lama_pinjam;
    }

    public void info() {
    System.out.println(customer.getNomer_ktp() + " Nama Customer: " + customer.getNama()  + " Nama CD: " + cd.getNama() + " Lama Peminjaman: " + lama_pinjam);
    }
}
