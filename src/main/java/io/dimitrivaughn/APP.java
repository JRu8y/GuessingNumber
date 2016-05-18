package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 4/28/16.
 */
public class APP {

    public static void main(String[] args) {
        Game game = new Game();
        int count = 0;
        boolean correct = false;
        int guess;
        int secret = 5;

        game.requestPlayerInput();
        game.compare();

    }

}
