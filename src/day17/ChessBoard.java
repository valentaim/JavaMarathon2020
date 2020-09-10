package day17;

public class ChessBoard {

    private ChessPiece[][] figures;

    public ChessBoard(ChessPiece[][] figures) {
        this.figures = figures;
    }

    public void print() {
        for (ChessPiece[] line : figures) {
            for (ChessPiece chessPiece : line) {
                System.out.print(chessPiece.getNotation());
            }
            System.out.println();
        }
    }
}
