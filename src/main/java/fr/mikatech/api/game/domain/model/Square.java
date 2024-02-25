package fr.mikatech.api.game.domain.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Square {
    private final int row;
    private final int col;
    private Piece piece;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = PieceFactory.createPiece(col, row);
    }

    //au lieu de return Map return un objet Id ...
    public Map<Integer, Integer> getRowAndCol(){
        return new HashMap<>(row, col);
    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Optional<Piece> getPiece() {
        return Optional.ofNullable(piece);
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
