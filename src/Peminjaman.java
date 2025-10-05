public class Peminjaman {
    private Cd cd;
    private Customer customer;
    private String  lama_pinjam;

    public Peminjaman (Customer cus, Cd cd, String lama_pinjam){
    this.customer = cus;
    this.cd =cd;
    this.lama_pinjam  = lama_pinjam;
    }

    public Customer getcustomer(){
        return customer;
    }
    public Cd getcd(){
        return cd;
    }


    public void info() {
        System.out.println("No. KTP          : " + customer.getNomer_ktp());
        System.out.println("Nama Customer    : " + customer.getNama());
        System.out.println("Nama CD          : " + cd.getNama());
        System.out.println("Lama Peminjaman  : " + lama_pinjam);
    }
}
