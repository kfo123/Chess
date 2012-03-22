import java.util.*;
public class Bishop extends Piece
{
	public Bishop(char s, int r, int c){
		super(s, r, c);}
	
	public String toString(){
		return side + "B";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		for (int x = 1; x < 8; x++){
			moves.add(new Location(loc.getRow() + x, loc.getCol() + x));
			moves.add(new Location(loc.getRow() + x, loc.getCol() - x));
			moves.add(new Location(loc.getRow() - x, loc.getCol() + x));
			moves.add(new Location(loc.getRow() - x, loc.getCol() - x));}
		return moves;
	}
}