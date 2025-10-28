package cz.filipvarga.chess.game;

public class BoardTile implements Tile {
    @Override
    public boolean canStepOn() {
        return true;
    }

    @Override
    public boolean hasTroop() {
        return false;
    }
}
