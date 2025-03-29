package offline3;

import java.util.List;

interface Observer {
        void removeFavGenre(Notifier notifier);
        void addFavGenre(Notifier notifier);
        void notifyMe(String movieName, String genre);
}

class User implements Observer {
    private final String name;

    public User(String name, List<Notifier> notifiers) {
        this.name = name;
        for (Notifier notifier : notifiers) {
            notifier.addGenreLover(this);
        }
    }

    @Override
    public void notifyMe(String movieName, String genre) {
        System.out.println("Notification to " + name + ": A new " + genre + " movie \"" + movieName + "\" has been added!");
    }
    @Override
    public void removeFavGenre(Notifier notifier) {
        if(notifier != null) {
            notifier.removeGenreLover(this);
        }
    }
    @Override
    public void addFavGenre(Notifier notifier) {
        if(notifier != null) {
            notifier.removeGenreLover(this);
        }
    }
}