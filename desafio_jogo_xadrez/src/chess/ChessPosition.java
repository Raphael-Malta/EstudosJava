package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error na posição. Valores validos de a1 até h8");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	protected Position toPosition () {
		//Lógica Na matriz a posição d 8 é 0, 7 é 1... Logo se para achar a posição correta tem de se fazer 8 - linha
		//Coluna é a mesma coisa mas com Char, se subtrair na tabela 'a'- 'a' = 0, 'b' - 'a' = 1 ... Por isso a utilização do jeito a baixo
		return new Position(8-row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		//String vazia é pra forçar o compilador a entender que é uma concatenação de strings
		return "" + column + row;
	}
}
