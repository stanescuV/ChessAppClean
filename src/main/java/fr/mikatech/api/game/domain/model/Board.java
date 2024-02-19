package fr.mikatech.api.game.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<List<Square>> squares;

    public Board() {
        squares = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < 8; rowIndex++) {
            var row = new ArrayList<Square>();
            for (int col = 0; col < 8; col++) {
                row.add(new Square(rowIndex, col));
            }
            squares.add(row);
        }
    }
}
