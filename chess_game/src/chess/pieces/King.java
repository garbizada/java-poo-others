package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
		
	}
	
	private boolean testRookCastling(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount()==0;
	
	}




	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//above
		p.setValues(position.getRow() -1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//below
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//left
		p.setValues(position.getRow(), position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//right
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//above left
		p.setValues(position.getRow() -1, position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//below left
		p.setValues(position.getRow() -1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//above right
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//below right
		p.setValues(position.getRow() +1, position.getColumn()+1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// #SPECIAL MOVE CASTLING
		if (getMoveCount() == 0 && !chessMatch.getCheck()) {
			
			//littleCASTLING
			Position pt1 = new Position(position.getRow(), position.getColumn() + 3);
			if (testRookCastling(pt1)) {
				Position pd1 = new Position(position.getRow(), position.getColumn() + 1);
				Position pd2 = new Position(position.getRow(), position.getColumn() + 2);
				if  (getBoard().piece(pd1) == null && getBoard().piece(pd2) == null) {
					mat[position.getRow()][position.getColumn() + 2] = true;
				}
			}
			
			//bigCASTLING
			Position pt2 = new Position(position.getRow(), position.getColumn() - 4);
			if (testRookCastling(pt2)) {
				Position pd1 = new Position(position.getRow(), position.getColumn() - 1);
				Position pd2 = new Position(position.getRow(), position.getColumn() - 2);
				Position pd3 = new Position(position.getRow(), position.getColumn() - 3);
				
				if  (getBoard().piece(pd1) == null && getBoard().piece(pd2) == null && getBoard().piece(pd3) == null) {
					mat[position.getRow()][position.getColumn() - 2] = true;
				}
			}
			
			
			
		}
		
		return mat;
	}
	

}
