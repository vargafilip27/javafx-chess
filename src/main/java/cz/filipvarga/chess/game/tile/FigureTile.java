package cz.filipvarga.chess.game.tile;

import cz.filipvarga.chess.game.Figure;
import cz.filipvarga.chess.game.PlayingSide;

public class FigureTile implements Tile {
    private final Figure figure;
    private final PlayingSide playingSide;

    public FigureTile(Figure figure, PlayingSide playingSide) {
        this.figure = figure;
        this.playingSide = playingSide;
    }

    @Override
    public boolean canStepOn() {
        return false;
    }

    @Override
    public boolean hasTroop() {
        return true;
    }

    public Figure getFigure() {
        return figure;
    }

    public PlayingSide getPlayingSide() {
        return playingSide;
    }
}
