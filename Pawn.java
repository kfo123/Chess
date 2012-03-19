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
				moves.add(new Location(loc.getRow() - 2, loc.getCol()));}
			moves.add(new Location(loc.getRow() - 1, loc.getCol()));
			if (getBoard().getPiece(new Location(loc.getRow() - 1, loc.getCol() - 1)) != null && getBoard().getPiece(new Location(loc.getRow() - 1, loc.getCol() - 1)).getSide() != side){
				moves.add(new Location(loc.getRow() - 1, loc.getCol() - 1));
			}
			if (getBoard().getPiece(new Location(loc.getRow() - 1, loc.getCol() + 1)) != null && getBoard().getPiece(new Location(loc.getRow() - 1, loc.getCol() + 1)).getSide() != side){
				moves.add(new Location(loc.getRow() - 1, loc.getCol() + 1));
			}
		}
		if (side == 'b'){
			if (firstMove){
				moves.add(new Location(loc.getRow() + 2, loc.getCol()));}
			moves.add(new Location(loc.getRow() + 1, loc.getCol()));
			if (getBoard().getPiece(new Location(loc.getRow() + 1, loc.getCol() - 1)) != null && getBoard().getPiece(new Location(loc.getRow() + 1, loc.getCol() - 1)).getSide() != side){
				moves.add(new Location(loc.getRow() + 1, loc.getCol() - 1));
			}
			if (getBoard().getPiece(new Location(loc.getRow() + 1, loc.getCol() + 1)) != null && getBoard().getPiece(new Location(loc.getRow() + 1, loc.getCol() + 1)).getSide() != side){
				moves.add(new Location(loc.getRow() + 1, loc.getCol() + 1));
			}
		}
		return moves;
	}
}
