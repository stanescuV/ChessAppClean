package fr.mikatech.api.game.domain.model;

public class Bishop implements Piece {
    public Bishop(Color color) {
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
