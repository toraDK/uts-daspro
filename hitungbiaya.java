import java.util.Scanner;

public class hitungbiaya {

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("Pilih jenis barang (Makanan/Minuman) : ");
        String jenis = input27.nextLine();
        System.out.print("Masukkan Nama Barang                 : ");
        String nama = input27.nextLine();
        System.out.print("Masukkan Harga Barang                : ");
        int harga = input27.nextInt();
        System.out.print("Masukkan Jumlah Barang               : ");
        int jumlah = input27.nextInt();

        if (jenis.equalsIgnoreCase("minuman")) {
            if (jumlah == 3) {
                double potongan =  harga * 0.05;
                System.out.println("potongan harga                         : " + (int)potongan);
                int totalpotongan = harga - (int)potongan;
                int jumlahharga1 = totalpotongan * jumlah;
                System.out.println("=====================================");
                System.out.println("jumlah harga barang anda saat ini  : " + jumlahharga1);
                System.out.print("Apakah mau membeli kantong plastik : ");
                char plastik = input27.next().charAt(0);
                System.out.println("=====================================");
                System.out.println("\n");
                if (plastik == 'y' || plastik == 'Y') {
                    int total = jumlahharga1 + 200;
                    System.out.println("" + total);
                    if (total >= 1000000) {
                        double ppn = total * 0.07;
                        
                        int totalharga = total + (int)ppn;
                        System.out.println("nama barang                     : " + nama);
                        System.out.println("jenis barang                    : " + jenis);
                        System.out.println("harga satuan                    : " + harga);
                        System.out.println("harga diskon persatuan barang   : " + potongan);
                        System.out.println("Harga Kantong plastik         : 200");
                        System.out.println("total ppn                       : " + (int)ppn);
                        System.out.println("total harga                     : " + total);
                    }else{
                        System.out.println("nama barang                     : " + nama);
                        System.out.println("jenis barang                    : " + jenis);
                        System.out.println("harga satuan                    : " + harga);
                        System.out.println("harga diskon persatuan barang   : " + potongan);
                        System.out.println("Harga Kantong plastik         : 200");
                        System.out.println("total harga                     : " + total);
                    }
                }else if(plastik == 't' || plastik == 'T'){
                        System.out.println("nama barang                     : " + nama);
                        System.out.println("jenis barang                    : " + jenis);
                        System.out.println("harga satuan                    : " + harga);
                        System.out.println("harga diskon persatuan barang   : " + potongan);
                        System.out.println("total harga                     : " + jumlahharga1);
                }else{
                    System.out.println("inputan salah");
                }
            }else{
                int total = harga * jumlah;
                System.out.println("nama barang                     : " + nama);
                System.out.println("jenis barang                    : " + jenis);
                System.out.println("harga satuan                    : " + harga);
                System.out.println("total harga                     : " + total);
            }
        }else if(jenis.equalsIgnoreCase("makanan")){
            int total1 = harga * jumlah;
            System.out.println("=========================================");
            System.out.println("jumlah harga barang anda saat ini :" + total1);
            System.out.print("Apakah mau membeli kantong plastik : ");
            char plastik = input27.next().charAt(0);
            System.out.println("=========================================");
            if (plastik == 'y' || plastik == 'Y') {
                    int total2 = total1 + 200;
                    if (total2 >= 1000000) {
                        double ppn = total2 * 0.07;
                        System.out.println("total ppn = " + (int)ppn);
                        int totalharga = total2 + (int)ppn;
                        System.out.println("nama barang                     : " + nama);
                        System.out.println("jenis barang                    : " + jenis);
                        System.out.println("harga satuan                    : " + harga);
                        System.out.println("total ppn                     : " + ppn);
                        System.out.println("total harga                     : " + totalharga);
                    }else{
                        System.out.println("nama barang                     : " + nama);
                        System.out.println("jenis barang                    : " + jenis);
                        System.out.println("harga satuan                    : " + harga);
                        System.out.println("harga plastik                 : 200" );
                        System.out.println("total harga                     : " + total2);
                    }
                }else if(plastik == 't' || plastik == 'T'){
                    System.out.println("nama barang                     : " + nama);
                    System.out.println("jenis barang                    : " + jenis);
                    System.out.println("harga satuan                    : " + harga);
                    System.out.println("total harga                     : " + total1);
                }else{
                    System.out.println("inputan salah");
                }
        }else{
            System.out.println("inputan salah");
        }

    }
}