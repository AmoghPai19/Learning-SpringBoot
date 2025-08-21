import com.example.learn_spring_framework.GamingConsole;

public class GameRunner {
    GamingConsole  game;
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Running game:"+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
