import java.util.*;
public class Pawn extends Piece
{
	private boolean firstMove;
	public Pawn(char s, int r, int c){
		super(s, r, c);
		firstMove = true;}
		
	public String toString(){
		return side + "P";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		if (side == 'w'){
			if (firstMove){
				moves.add(new Location(loc.getRow(), loc.getCol() - 2));}
			moves.add(new Location(loc.getRow(), loc.getCol() - 1));
		}
		if (side == 'b'){
			if (firstMove){
				moves.add(new Location(loc.getRow(), loc.getCol() + 2));}
			moves.add(new Location(loc.getRow(), loc.getCol() + 1));
		}
		return moves;
	}
}
