package offline3;

import java.util.ArrayList;
import java.util.List;

public class DesiflixServer {
    public static void main(String[] args) {
        Notifier thrillerNotifier= new ThrillerNotifier();
        Notifier comedyNotifier = new ComedyNotifier();
        Notifier horrNotifier = new HorrorNotifier();

        Observer user1 = new User("User1_triller", List.of(thrillerNotifier));
        Observer user2 = new User("User2_comedy", List.of(comedyNotifier));
        Observer user3 = new User("User3_horr", List.of(horrNotifier));
        Observer user4 = new User("User4_triller_comedy", List.of(thrillerNotifier, comedyNotifier));
        Observer user5 = new User("User5_triller_horr", List.of(thrillerNotifier, horrNotifier));
        Observer user6 = new User("User6_comedy_horr", List.of(comedyNotifier, horrNotifier));
        Observer user7 = new User("User7_triller_comedy_horr", List.of(thrillerNotifier, comedyNotifier, horrNotifier));

        Movie movie1 = new Movie("The dictator", "Comedy");
        Movie movie2 = new Movie("Shutter Island", "Thriller");
        Movie movie3 = new Movie("Anabella", "Horror");

        comedyNotifier.uploadMovie(movie1);
        thrillerNotifier.uploadMovie(movie2);
        horrNotifier.uploadMovie(movie3);
    }
}
