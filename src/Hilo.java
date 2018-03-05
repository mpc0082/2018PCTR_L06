
public class Hilo implements Runnable {

	private Ball ball;
	private Board board;

	public Hilo(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		while (true) {
			ball.move();
			board.repaint();
		}
	}

}
