package fr.mikatech.api.game.domain.model;

public class Rook implements Piece {
    public Rook(Color color) {
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public boolean canMove(Square from, Square to) {
        return false;
    }
}
