package offline3;

import java.util.ArrayList;
import java.util.List;

public interface Notifier {
    public void addGenreLover(Observer observer);
    public void removeGenreLover(Observer observer);
    public void uploadMovie(Movie movie);
    public void notifyGenreLovers(String movieName, String genreName);
}
class ThrillerNotifier implements Notifier {
    private final String genreName = "Thriller";
    private final List<Observer> thrillerLovers = new ArrayList<>();

    @Override
    public void addGenreLover(Observer observer) {
        thrillerLovers.add(observer);
    }

    @Override
    public void removeGenreLover(Observer observer) {
        thrillerLovers.remove(observer);
    }

    @Override
    public void uploadMovie(Movie movie) {
        Thread uploadThread = new Thread(() -> {
            System.err.println("Movie uploading: " + movie.getName() + " as a Thriller movie . . . ");

            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }

            System.out.println("Movie uploading DONE: " + movie.getName() + " as a Thriller movie ! ! !");
        });

        uploadThread.start();

        Thread notifyThread = new Thread(() -> {
            System.out.println("Notifying Thriller lovers . . .");
            notifyGenreLovers(movie.getName(), genreName);
            System.out.println("Notifying Thriller lovers DONE");
        });

        notifyThread.start();
    }

    @Override
    public void notifyGenreLovers(String movieName, String genreName) {
        for (Observer observer : thrillerLovers) {
            observer.notifyMe(movieName, genreName);
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}

class ComedyNotifier implements Notifier {
    private final String genreName = "Comedy";
    private final List<Observer> comedyLovers = new ArrayList<>();

    @Override
    public void addGenreLover(Observer observer) {
        comedyLovers.add(observer);
    }

    @Override
    public void removeGenreLover(Observer observer) {
        comedyLovers.remove(observer);
    }

    @Override
    public void uploadMovie(Movie movie) {
        Thread uploadThread = new Thread(() -> {
            System.err.println("Movie uploading : " + movie.getName() + " as a Comedy movie . . . ");

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }

            System.out.println("Movie uploading DONE: " + movie.getName() + " as a Comedy movie ! ! !");
        });

        uploadThread.start();

        Thread notifyThread = new Thread(() -> {
            System.out.println("Notifying Comedy lovers . . .");
            notifyGenreLovers(movie.getName(), genreName);
            System.out.println("Notifying Comedy lovers DONE");
        });

        notifyThread.start();
    }

    @Override
    public void notifyGenreLovers(String movieName, String genreName) {
        for (Observer observer : comedyLovers) {
            observer.notifyMe(movieName, genreName);
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}

class HorrorNotifier implements Notifier {
    private final String genreName = "Horror";
    private final List<Observer> horrorLovers = new ArrayList<>();

    @Override
    public void addGenreLover(Observer observer) {
        horrorLovers.add(observer);
    }

    @Override
    public void removeGenreLover(Observer observer) {
        horrorLovers.remove(observer);
    }

    @Override
    public void uploadMovie(Movie movie) {
        Thread uploadThread = new Thread(() -> {
            System.err.println("Movie uploading: " + movie.getName() + " as a Horror movie . . .");

            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }

            System.out.println("Movie uploading DONE: " + movie.getName() + " as a Horror movie ! ! !");
        });

        uploadThread.start();

        Thread notifyThread = new Thread(() -> {
            System.out.println("Notifying Horror lovers . . .");
            notifyGenreLovers(movie.getName(), genreName);
            System.out.println("Notifying Horror lovers DONE");
        });

        notifyThread.start();
    }

    @Override
    public void notifyGenreLovers(String movieName, String genreName) {
        for (Observer observer : horrorLovers) {
            observer.notifyMe(movieName, genreName);
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}