import java.io.*;
import java.util.*;

public class Solution{

	public static void main(String args[]){
		String opponentMove = "PPSRSPRPPPSRPSRPPSSR";
		int winCount = 0;

		if(opponentMove.charAt(0) == 'S'){
			winCount++;
		}

		if(opponentMove.charAt(1) == 'S'){
			winCount++;
		}

		for(int i=2; i<opponentMove.length();i++){
			if(opponentMove.charAt(i-1) == opponentMove.charAt(i-2)){
				if(opponentMove.charAt(i-1) == 'S' && opponentMove.charAt(i) == 'S'){
					winCount++;
				}
				else if(opponentMove.charAt(i-1) == 'P' && opponentMove.charAt(i) == 'P'){
					winCount++;
				}
				else if(opponentMove.charAt(i-1) == 'R' && opponentMove.charAt(i) == 'R'){
					winCount++;
				}
			}
			else if(opponentMove.charAt(i-1) != opponentMove.charAt(i-2)){
				if(((opponentMove.charAt(i-1)=='P' && opponentMove.charAt(i-2) =='S') || (opponentMove.charAt(i-1)=='S' && opponentMove.charAt(i-2) =='P')) && opponentMove.charAt(i) =='R'){
					winCount++;
				}
				else if(((opponentMove.charAt(i-1)=='P' && opponentMove.charAt(i-2) =='R') || (opponentMove.charAt(i-1)=='R' && opponentMove.charAt(i-2) =='P')) && opponentMove.charAt(i) =='S'){
					winCount++;
				}
				else if(((opponentMove.charAt(i-1)=='R' && opponentMove.charAt(i-2) =='S') || (opponentMove.charAt(i-1)=='S' && opponentMove.charAt(i-2) =='R')) && opponentMove.charAt(i) =='P'){
					winCount++;
				}
			}
		}

		System.out.println(winCount);
	}
}