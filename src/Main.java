public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Starting application...");

        new Main().run();
    }

    public void run()
    {
        Game ticTacToe = new Game();

        ticTacToe.runGame();
    }
}
