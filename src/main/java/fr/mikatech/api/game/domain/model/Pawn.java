package fr.mikatech.api.game.domain.model;

public class Pawn implements Piece {

    private final Color color;

    public Pawn(Color color) {
        this.color = color;
    }

    @Override
    public boolean canMove(Square from, Square to) {
        return false;
    }

    public Color getColor() {
        return color;
    }
}
