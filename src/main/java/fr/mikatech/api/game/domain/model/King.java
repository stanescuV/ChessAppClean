package fr.mikatech.api.game.domain.model;

public class King implements Piece {
    public King(Color color) {

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
