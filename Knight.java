import java.util.*;
public class Knight extends Piece
{
	public Knight(char s, int r, int c){
		super(s, r, c);}
	
	public String toString(){
		return side + "Kn";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		moves.add(new Location(loc.getRow() + 1, loc.getCol() + 2));
		moves.add(new Location(loc.getRow() + 1, loc.getCol() - 2));
		moves.add(new Location(loc.getRow() - 1, loc.getCol() + 2));
		moves.add(new Location(loc.getRow() - 1, loc.getCol() - 2));
		moves.add(new Location(loc.getRow() + 2, loc.getCol() + 1));
		moves.add(new Location(loc.getRow() + 2, loc.getCol() - 1));
		moves.add(new Location(loc.getRow() - 2, loc.getCol() + 1));
		moves.add(new Location(loc.getRow() - 2, loc.getCol() - 1));
		return moves;
	}
}