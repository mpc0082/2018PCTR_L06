
public class Hilo implements Runnable {

	private Ball ball;
	private Board board;

	public Hilo(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			ball.move();
			board.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
