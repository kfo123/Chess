import java.util.*;
public class Rook extends Piece
{
	public Rook(char s, int r, int c){
		super(s, r, c);}
	
	public String toString(){
		return side + "R";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow(), loc.getCol() + x), side) == 'o'){
				moves.add(new Location(loc.getRow(), loc.getCol() + x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow(), loc.getCol() + x), side) == 'n'){
				moves.add(new Location(loc.getRow(), loc.getCol() + x));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow(), loc.getCol() - x), side) == 'o'){
				moves.add(new Location(loc.getRow(), loc.getCol() - x));
				break;}
			else if (getBoard().getType(new Location(loc.getRow(), loc.getCol() - x), side) == 'n'){
				moves.add(new Location(loc.getRow(), loc.getCol() - x));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol()), side) == 'o'){
				moves.add(new Location(loc.getRow() + x, loc.getCol()));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() + x, loc.getCol()), side) == 'n'){
				moves.add(new Location(loc.getRow() + x, loc.getCol()));}
			else{
				break;}
		}
		for (int x = 1; x < 8; x++){
			if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol()), side) == 'o'){
				moves.add(new Location(loc.getRow() - x, loc.getCol()));
				break;}
			else if (getBoard().getType(new Location(loc.getRow() - x, loc.getCol()), side) == 'n'){
				moves.add(new Location(loc.getRow() - x, loc.getCol()));}
			else{
				break;}
		}
		return moves;
	}
}
