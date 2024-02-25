package fr.mikatech.api.game.domain.model;

import fr.mikatech.api.game.domain.exception.InvalidRowException;

import static fr.mikatech.api.game.domain.model.Color.*;

public class PieceFactory {
    public static Piece createPiece(int col, int row) {
        return switch (row) {
            case 1 -> new Pawn(WHITE);
            case 6 -> new Pawn(BLACK);
            case 0 -> createByColor(col, WHITE);
            case 7 -> createByColor(col, BLACK);
            default -> throw new InvalidRowException("Cannot create a piece in this row: " + row);
        };
    }

    private static Piece createByColor(int col, Color color) {
        return switch (col) {
            case 0, 7 -> new Rook(color);
            case 1, 6 -> new Knight(color);
            case 2, 5 -> new Bishop(color);
            case 3 -> new Queen(color);
            case 4 -> new King(color);
            default -> throw new IllegalArgumentException("Invalid column: " + col);
        };
    }
}
