interface Playable {

    void play();
    void stop();
}
class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3Player is playing music.");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player has stopped playing music.");
    }
}

class Radio implements Playable {
    @Override
    public void play() {
        System.out.println("Radio is playing.");
    }

    
    @Override
    public void stop() {
        System.out.println("Radio has been turned off.");
    }
}

public class Music {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        Radio radio = new Radio();

    
        System.out.println("Using MP3Player:");
        mp3Player.play();
        mp3Player.stop();

        System.out.println("\nUsing Radio:");
        radio.play();
        radio.stop();
    }
}
