package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch(); 
		
		
		while (true) {
			try {
				Ui.clearScreen();
				Ui.printMatch(chessMatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = Ui.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = Ui.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
		
	}
}
