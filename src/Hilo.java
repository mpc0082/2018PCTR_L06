
public class Hilo implements Runnable {

	private Ball ball;
	private Board board;

	public Hilo(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	@Override
	public void run() {
		try {
		while (!Thread.currentThread().isInterrupted()) {
			ball.move();
			board.repaint();
			
				Thread.sleep(10);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Hilo parado");
			}
		}
	

}
