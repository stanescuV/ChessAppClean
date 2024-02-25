package fr.mikatech.api.game.domain.service;

public class GamePanelService {

    public void promoting(Piece piece){
        switch(piece.type){
            case ROOK: simPieces.add(new Rook(currentColor, activePiece.col, activePiece.row));break;
            case KNIGHT: simPieces.add(new Knight(currentColor, activePiece.col, activePiece.row));break;
            case BISHOP: simPieces.add(new Bishop(currentColor, activePiece.col, activePiece.row));break;
            case QUEEN: simPieces.add(new Queen(currentColor, activePiece.col, activePiece.row));break;
            default: break;
        }
        simPieces.remove(activePiece.getIndex());
        copyPieces(simPieces, pieces);
        activePiece = null;
        promotion = false;
        changePlayer();
    }

    private void changePlayer(){
        if(currentColor == WHITE){
            currentColor = BLACK;
            //reset black s two stepped status
            for(Piece piece : pieces) {
                if(piece.color == BLACK){
                    piece.twoStepped = false;
                }
            }
        } else{
            currentColor = WHITE;
            //reset white s two stepped status
            for(Piece piece : pieces) {
                if(piece.color == WHITE){
                    piece.twoStepped = false;
                }
            }
        }
        activePiece = null;
    }
}
