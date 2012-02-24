public class Pawn extends Piece
{
	private boolean firstMove;
	public Pawn(char s, int x, int y){
		super(s, x, y);
		firstMove = true;}
		
	public String toString(){
		return side + "P";
	}
	
	public void move(){
	}
}
