import java.util.*;
import java.io.*;
public class Location
{
	private int row;
	private int col;
	
	public Location(int r, int c){
		setRow(r);
		setCol(c);
	}
	
	public boolean setRow(int r){
		if(checkValid(r)){
			row = r;
			return true;}
		else{
			row = 0;
			return false;}
	}
	
	public boolean setCol(int c){
		if(checkValid(c)){
			col = c;
			return true;}
		else{
			col = 0;
			return false;}
	}
	
	public int getRow(){
		return row;}
	
	public int getCol(){
		return col;}
	
	public boolean checkValid(int loc){
		if (loc < 0 || loc > 7){
			return false;}
		else{
			return true;}
	}
	
	public String toString(){
		return "r:" + row + ", c:" + col;}
}