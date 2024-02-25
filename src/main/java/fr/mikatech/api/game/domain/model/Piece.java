package fr.mikatech.api.game.domain.model;

public interface Piece {
    Color getColor();
    boolean canMove(Square from, Square to);


}
