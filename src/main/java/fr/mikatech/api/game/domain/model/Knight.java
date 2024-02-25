package fr.mikatech.api.game.domain.model;

public class Knight implements Piece {
    public Knight(Color color) {
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
