import java.util.*;
public abstract class Piece
{
	protected char side;
	protected Location loc;
	private Board board; 
	
	public Piece(char s, int r, int c){
		setSide(s);
		setLocation(r, c);
	}
	
	public void setSide(char s){
		side = s;}
	
	public void setLocation(int r, int c){
		loc = new Location(r, c);}
		
	public Location getLocation(){
		return loc;}
		
	public char getSide(){
		return side;}

	public void setBoard(Board b){
		board = b;}
	
	public Board getBoard(){
		return board;}

	public abstract ArrayList<Location> getMoves();
}