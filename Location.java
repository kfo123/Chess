import java.util.*;
import java.io.*;
public class Location
{
	private int xCoor;
	private int yCoor;
	
	public Location(int x, int y){
		setX(x);
		setY(y);
	}
	
	public boolean setX(int x){
		if(checkValid(x)){
			xCoor = x;
			return true;}
		else{
			xCoor = 0;
			return false;}
	}
	
	public boolean setY(int y){
		if(checkValid(y)){
			yCoor = y;
			return true;}
		else{
			yCoor = 0;
			return false;}
	}
	
	public int getX(){
		return xCoor;}
	
	public int getY(){
		return yCoor;}
	
	public boolean checkValid(int loc){
		if (loc < 0 || loc > 7){
			return false;}
		else{
			return true;}
	}
	
	public String toString(){
		return xCoor + "," + yCoor;}
}