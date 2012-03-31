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
			if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol() + x), side) == 'o'){
				moves.add(new Location(loc.getRow() + x, loc.getCol() + x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol() + x), side) == 'n'){
				moves.add(new Location(loc.getRow() + x, loc.getCol() + x));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol() - x), side) == 'o'){
				moves.add(new Location(loc.getRow() - x, loc.getCol() - x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol() - x), side) == 'n'){
				moves.add(new Location(loc.getRow() - x, loc.getCol() - x));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol() + x), side) == 'o'){
				moves.add(new Location(loc.getRow() - x, loc.getCol() + x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol() + x), side) == 'n'){
				moves.add(new Location(loc.getRow() - x, loc.getCol() + x));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol() - x), side) == 'o'){
				moves.add(new Location(loc.getRow() + x, loc.getCol() - x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol() - x), side) == 'n'){
				moves.add(new Location(loc.getRow() + x, loc.getCol() - x));}
			else{
				break;}
		}
		return moves;
	}
}
