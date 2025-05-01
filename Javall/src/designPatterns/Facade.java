package designPatterns;
/*
The Facade Design Pattern is a structural pattern that provides a simplified interface to a complex system of classes, libraries, or frameworks.
A facade is a single class that hides the complexities of a system and provides an easy-to-use interface to the client.
 */
class DVDPlayer {
    public void on() { System.out.println("DVD Player On"); }
    public void play() { System.out.println("DVD Player Playing"); }
    public void off() { System.out.println("DVD Player Off"); }
}

class Projector {
    public void on() { System.out.println("Projector On"); }
    public void off() { System.out.println("Projector Off"); }
}

class Lights {
    public void dim() { System.out.println("Lights Dimmed"); }
    public void on() { System.out.println("Lights On"); }
}

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        projector.on();
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvd.off();
        projector.off();
        lights.on();
    }
}

public class Facade {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, lights);

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
