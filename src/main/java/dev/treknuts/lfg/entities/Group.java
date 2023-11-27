package dev.treknuts.lfg.entities;

public class Group {

    private int id;
    private String title;
    private String description;
    private String author;
    private int playersWanted;
    private Platform platform;

    public Group() {
    }

    public Group(String title, String description, String author, int playersWanted, Platform platform) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.playersWanted = playersWanted;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPlayersWanted() {
        return playersWanted;
    }

    public void setPlayersWanted(int playersWanted) {
        this.playersWanted = playersWanted;
    }

    @Override
    public String toString() {
        return String.format("%s needs %x players to play Rainbow Six Siege on %s", author, playersWanted, platform);
    }
}
