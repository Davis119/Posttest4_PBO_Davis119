/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_posttest4_pbo_davis;

/**
 *
 * @author Asus
 */
public class WebtoonList extends list {
    private int episodes;

    public WebtoonList(String judul, String genre, String status, int episodes, String author, float rating) {
        super(judul, genre, status, author, rating);
        this.episodes = episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return getJudul() + " (Genre: " + getGenre() + ", Status: " + getStatus() + ", Episodes: " + episodes + ", Author: " + getAuthor() + ", Rating: " + getRating() + ")";
    }
}

