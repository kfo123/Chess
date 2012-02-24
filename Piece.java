public abstract class Piece
{
	protected char side;
	protected Location loc;
	
	public Piece(char s, int x, int y){
		setSide(s);
		setLocation(x, y);
	}
	
	public void setSide(char s){
		side = s;}
	
	public void setLocation(int x, int y){
		loc = new Location(x, y);}
		
	public Location getLocation(){
		return loc;}

	public abstract void move();
}