package cz.filipvarga.chess.game.tile;

import cz.filipvarga.chess.game.PlayingSide;

public class BoardTile implements Tile {
    private final PlayingSide color;

    public BoardTile(PlayingSide color) {
        this.color = color;
    }
    
    @Override
    public boolean canStepOn() {
        return true;
    }

    @Override
    public boolean hasTroop() {
        return false;
    }
    
    public PlayingSide getColor() {
        return color;
    }
}
