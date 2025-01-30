import java.util.ArrayList;

class VideoLibrary {
    ArrayList<String> movies = new ArrayList<>();

    void addMovie(String movieTitle) {
        System.out.println("dodano " + movieTitle + "!!!!!!!!!!");
        movies.add(movieTitle);

    }

    void displayMovies() {
        System.out.println("lista filmow w wideotece: ");
        System.out.println(movies);

    }

    boolean searchMovie(String movieTitle) {
        System.out.println("wyszukiwanie: ");
        movies.contains(movieTitle);
        System.out.println("czy film" + movieTitle + "znajduje sie w kolekcji?");

        if (movieTitle.isEmpty()) {
            System.out.println("nie");
        } else {
            System.out.println("tak");
        }
        return movies.contains(movieTitle);

    }

    void removeMovie(String movieTitle) {
        System.out.println("usuwanie " + movieTitle);
        movies.remove(movieTitle);
        System.out.println("usunieto film " + movieTitle);

        System.out.println("lista filmow po usunieciu: " + movies);
    }

    void countMovies() {
        System.out.println("liczba filmow w bibliotece: " + movies.size());
    }

    void FilterMovies(char letter) {
        ArrayList<String> filteredmovies = new ArrayList<>();
        for (String movie : movies) {
            if (movie.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                filteredmovies.add(movie);
            }
        }
        System.out.println("wyszukiwanie na "+ letter + " " + filteredmovies);
    }
    void WelcomeMessage(){
        System.out.println("ELO");
    }

}





public class Main {
    public static void main(String[] args) {

    VideoLibrary library = new VideoLibrary();
    library.WelcomeMessage();
    library.addMovie("olek mowi halo" );
    library.addMovie("olek na wczasach");
    library.addMovie("olek na jajku");
    library.addMovie("pindolek na grzybach");
    library.displayMovies();
    library.searchMovie("olek mowi halo");
    library.removeMovie("olek na grzybach");
    library.countMovies();
    library.FilterMovies('o');

    }
}
















