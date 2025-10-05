//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cd> daftar_cd = new ArrayList<>();
        ArrayList<Customer> daftar_customer = new ArrayList<>();
        ArrayList<Peminjaman> daftar_peminjaman = new ArrayList<>();

        ArrayList<String> daftar_menu = new ArrayList<>();

        daftar_menu.add("1. Tambah Customer");
        daftar_menu.add("2. Tambah CD");
        daftar_menu.add("3. Tambah Peminjaman");
        daftar_menu.add("4. Daftar Peminjaman");
        daftar_menu.add("5. Hapus Peminjaman");
        daftar_menu.add("0. Keluar");

        String selected_menu = "";

        while (!selected_menu.equals("0")) {
            System.out.println("\n== Menu ==");
            for (String menu : daftar_menu) {
                System.out.println(menu);
            }

            System.out.print("Masukan Nomor Menu yang dipilih: ");
            selected_menu = input.nextLine();


            if (selected_menu.equals("1")) {
                System.out.println("--Data Customer--");
                System.out.print("Masukann Nama Customer: ");
                String nama_customer = input.nextLine();
                System.out.print("Masukan Nomor KTP: ");
                String nomer_ktp = input.nextLine();
                System.out.print("Masukan Alamat: ");
                String alamat = input.nextLine();


                daftar_customer.add(new Customer(nama_customer, nomer_ktp, alamat));
                System.out.println("Customer berhasil ditambahkan!");
            }
            else if (selected_menu.equals("2")) {
                System.out.println("-Data CD--");
                System.out.print("Masukan Nama CD: ");
                String nama_cd = input.nextLine();
                System.out.print("Masukan Tahun CD: ");
                int tahun_cd = input.nextInt();
                System.out.println("Masukan Jumlah CD: ");
                int jumlah_cd = input.nextInt();

                daftar_cd.add(new Cd(nama_cd, tahun_cd, jumlah_cd));
                System.out.println("CD berhasil ditambahkan!");
            }
            else if (selected_menu.equals("3")) {
                System.out.println("--Data Peminjaman--");

                if (daftar_customer.isEmpty() || daftar_cd.isEmpty()) {
                    System.out.println("Data Costumer atau CD masih kosong. Sialakan tambah data terlebih dahulu!");
                } else {
                    System.out.println("Pilih Customer");
                    for (int i = 0; i < daftar_customer.size(); i++) {
                        System.out.println((i + 1) + ". " + daftar_customer.get(i).getNama());
                    }
                    System.out.print("Masukan nomor Customer: ");
                    int idcustomer = input.nextInt() - 1;
                    input.nextLine();

                    System.out.println("Pilih CD");
                    for (int i = 0; i < daftar_cd.size(); i++) {
                        System.out.println((i + 1) + ". " + daftar_cd.get(i).getNama());
                    }

                    System.out.println("Masukan Nomor Cd: ");
                    int id_cd = input.nextInt() - 1;
                    input.nextLine();

                    System.out.print("Masukan Lama Peminjaman: ");
                    String lama_pinjam = input.nextLine();

                    daftar_peminjaman.add(new Peminjaman(daftar_customer.get(idcustomer), daftar_cd.get(id_cd), lama_pinjam));
                    System.out.println("Peminjaman berhasil ditambahkan!");
                }
            }
            else if (selected_menu.equals("4")) {
                System.out.println("--Daftar Peminjaman--");
                if (daftar_peminjaman.isEmpty()) {
                    System.out.println("Belum ada data peminjaman");
                } else {
                    for (int i = 0; i < daftar_peminjaman.size(); i++) {
                        System.out.println("Data ke-" + (i + 1));
                        daftar_peminjaman.get(i).info();
                        System.out.println("---------------------");
                    }
                }

            }
            else if (selected_menu.equals("5")) {
                System.out.println("--Hapus Data Peminjaman--");

                if (daftar_peminjaman.isEmpty()) {
                    System.out.println("Belum ada data peminjaman yang bisa dihapus.");
                } else {
                    for (int i = 0; i < daftar_peminjaman.size(); i++) {
                        System.out.println((i + 1) + ". "
                                + daftar_peminjaman.get(i).getcustomer().getNama()
                                + " - " + daftar_peminjaman.get(i).getcd().getNama());
                    }

                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int nomorHapus = input.nextInt();
                    input.nextLine();

                    if (nomorHapus < 1 || nomorHapus > daftar_peminjaman.size()) {
                        System.out.println("Nomor tidak valid!");
                    } else {
                        daftar_peminjaman.remove(nomorHapus - 1);
                        System.out.println("Data peminjaman berhasil dihapus!");
                    }

                    if (daftar_peminjaman.isEmpty()) {
                        System.out.println("Sekarang tidak ada lagi data peminjaman.");
                    } else {
                        System.out.println("--Daftar Peminjaman Tersisa--");
                        for (int i = 0; i < daftar_peminjaman.size(); i++) {
                            System.out.println("Data ke-" + (i + 1));
                            daftar_peminjaman.get(i).info();
                            System.out.println("---------------------");
                        }
                    }
                }
            }
                else if (selected_menu.equals("0")) {
                    System.out.println("Keluar dari program..");
                } else {
                    System.out.println("Menu tidak tersedia, silakan pilih menu yang ada.");
                }
            }
        }
    }



