import java.util.*;
public class Queen extends Piece
{
	public Queen(char s, int r, int c){
		super(s, r, c);}
	
	public String toString(){
		return side + "Q";
	}
	
	public ArrayList<Location> getMoves(){
		ArrayList<Location> moves = new ArrayList<Location>();
		char n = isValidMove(side);
		char ne = isValidMove(side);
		char e = isValidMove(side);
		char se = isValidMove(side);
		char s = isValidMove(side);
		char sw = isValidMove(side);
		char w = isValidMove(side);
		char nw = isValidMove(side);
		for (int x = 1; x < 8; x++){
			if (e){
				moves.add(new Location(loc.getRow(), loc.getCol() + x));}
			if (w){
				moves.add(new Location(loc.getRow(), loc.getCol() - x));}
			if (s){
				moves.add(new Location(loc.getRow() + x, loc.getCol()));}
			if (n){
				moves.add(new Location(loc.getRow() - x, loc.getCol()));}
			if (se){
				moves.add(new Location(loc.getRow() + x, loc.getCol() + x));}
			if (sw){
				moves.add(new Location(loc.getRow() + x, loc.getCol() - x));}
			if (ne){
				moves.add(new Location(loc.getRow() - x, loc.getCol() + x));}
			if (nw){
				moves.add(new Location(loc.getRow() - x, loc.getCol() - x));}
			//if something blocks one of these paths, then it doesn't continue
		}
		return moves;
	}
}
