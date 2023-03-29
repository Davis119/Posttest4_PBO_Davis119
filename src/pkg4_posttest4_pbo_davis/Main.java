/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_posttest4_pbo_davis;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<WebtoonList > webtoonLists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== List Komik ====");
            System.out.println("1. Tambah List Komik");
            System.out.println("2. Tampilkan List Komik");
            System.out.println("3. Ubah List Komik");
            System.out.println("4. Hapus List Komik");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Masukkan Judul Komik   : ");
                String judul = scanner.nextLine();

                System.out.println("Masukkan Genre Komik   : ");
                String genre = scanner.nextLine();

                System.out.println("Masukkan Status Komik  : ");
                String status = scanner.nextLine();

                System.out.println("Masukkan Episode Komik :  ");
                int episodes = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Masukkan Author Komik  : ");
                String author = scanner.nextLine();

                System.out.println("Masukkan Rating Komik  : ");
                float rating = scanner.nextFloat();
                scanner.nextLine();

                WebtoonList  animeList = new WebtoonList (judul, genre, status, episodes, author, rating);
                webtoonLists.add(animeList);
                System.out.println("Komik sudah ditambahkan.");
            } else if (choice == 2) {
                System.out.println("==== List Komik ====");
                for (int i = 0; i < webtoonLists.size(); i++) {
                    System.out.println((i+1) + ". " + webtoonLists.get(i).toString());
                }
            }else if (choice == 3) {
                System.out.println("Masukkan nomor untuk mengubah Komik: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                if (index > 0 && index <= webtoonLists.size()) {
                    WebtoonList  animeList = webtoonLists.get(index-1);

                    System.out.println("Masukkan Judul Komik   : ");
                    String title = scanner.nextLine();
                    animeList.setJudul(title);

                    System.out.println("Masukkan Genre Komik   : ");
                    String genre = scanner.nextLine();
                    animeList.setGenre(genre);

                    System.out.println("Masukkan Status Komik  : ");
                    String status = scanner.nextLine();
                    animeList.setStatus(status);

                    System.out.println("Masukkan Episode Komik :  ");
                    int episodes = scanner.nextInt();
                    scanner.nextLine();
                    animeList.setEpisodes(episodes);

                    System.out.println("Masukkan Author Komik  :: ");
                    String author = scanner.nextLine();
                    animeList.setAuthor(author);

                    System.out.println("Masukkan Rating Komik  : ");
                    float rating = scanner.nextFloat();
                    scanner.nextLine();
                    animeList.setRating(rating);

                    System.out.println("Komik Berhasil Diubah...");
                }
            }else if (choice == 4) {
                System.out.println("Masukkan nomor untuk menghapus Komik: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                if (index > 0 && index <= webtoonLists.size()) {
                    webtoonLists.remove(index-1);
                    System.out.println("Komik berhasil dihapus");
                } else {
                    System.out.println("Pilihan Tidak Valid.");
                }
            }else if (choice == 5) {
                System.out.println("Selamat Tinggal!");
                break;
            } else {
                System.out.println("Pilihan Tidak Valid. Silakan coba lagi.");
            }
        }
    }
}