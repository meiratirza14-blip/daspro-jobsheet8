import java.util.Scanner;

public class Tugas328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko : ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Tidak valid : jumlah toko minimal 1");
            }
        } while (jumlahToko < 1);
        int totalSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;

            do {
                System.out.print("Masukkan jumlah pelanggan toko " + toko + " : ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak valid");
                }
            } while (jumlahPelanggan < 0); {
                int totalBarangToko = 0;
                
                for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                    int jumlahBarang;

                    do {
                    System.out.println("Jumlah barang pelanggan "+ pelanggan + " di toko " + toko + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko);
            System.out.println("Total pelanggan: " + jumlahPelanggan);
            System.out.println("Total barang: " + totalBarangToko);

            totalSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
            System.out.println();
        }
        System.out.println("===== HASIL AKHIR =====");
        System.out.println("Total barang seluruh toko : "+ totalSemua);
        System.out.println("Toko dengan jumlah barang terbanyak : "+ tokoTerbanyak);
        System.out.println("Jumlah barang terbanyak : "+ barangTerbanyak);

                }
                sc.close();
            }
        }
