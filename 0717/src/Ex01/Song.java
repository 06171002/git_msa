package Ex01;

public class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song() {
    }

    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public void show(){
        System.out.println(year +"년 " +country+ "국적의 " +artist+"가 부른 "+ title);
    }
}
