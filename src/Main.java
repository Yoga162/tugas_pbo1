//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cd cd1 = new Cd("pemrograman", 2025, 200);
        Cd cd2 = new Cd("belajar java", 2023, 300);

        Customer cus1 = new Customer("Yoga", "05065467", "Jl. Banjarangkan");
        Customer cus2 = new Customer("Adel", "05067899", "Jl. Klungkung");

        Peminjaman pinjam1 = new Peminjaman(cus1, cd1, "7 Hari");
        Peminjaman pinjam2 = new Peminjaman(cus2, cd2, "8 hari");

        System.out.println("Daftar Cd :");
        cd1.info();
        cd2.info();

        System.out.println("Daftar Custumer :");
        cus1.info();
        cus2.info();

        System.out.println("Daftar Peminjaman :");
        pinjam1.info();
        pinjam2.info();
    }
}
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

