package fr.mikatech.api.game.application;

import fr.mikatech.api.game.domain.service.GamePanelService;

public class AwtGamePannel {
    private final GamePanelService gamePanelService;

    public AwtGamePannel(GamePanelService gamePanelService) {
        this.gamePanelService = gamePanelService;
    }

    private void promoting() {
        if(mouse.pressed){
            for(Piece piece : promoPieces){
                if(piece.col == mouse.x/Board.SQUARE_SIZE && piece.row == mouse.y/Board.SQUARE_SIZE){

                }
            }
        }

    }
}
