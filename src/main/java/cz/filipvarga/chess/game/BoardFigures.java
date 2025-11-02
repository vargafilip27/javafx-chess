package cz.filipvarga.chess.game;

import cz.filipvarga.chess.game.position.BoardPosition;
import cz.filipvarga.chess.game.position.Position;
import cz.filipvarga.chess.game.tile.FigureTile;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

// Stores info about figures of given player
public class BoardFigures {
    private final PlayingSide playingSide;
    private final Map<Position, FigureTile> figureMap;
    private final Position kingPosition;

    public BoardFigures(PlayingSide playingSide) {
        this.playingSide = playingSide;
        this.figureMap = new HashMap<>();

        switch (playingSide) {
            case WHITE:
                this.kingPosition = new BoardPosition(8, "e1");
                break;
            case BLACK:
                this.kingPosition = new BoardPosition(8, "e8");
                break;
            default:
                throw new IllegalArgumentException("Unsupported playing side: " + playingSide);
        }
    }

    public BoardFigures(PlayingSide playingSide, Map<Position, FigureTile> figureMap, Position kingPosition) {
        this.playingSide = playingSide;
        this.figureMap = figureMap;
        this.kingPosition = kingPosition;
    }

    public Optional<FigureTile> at(Position pos) {

    }

    public PlayingSide playingSide() {

    }

    public Position kingPosition() {

    }

    public boolean isKingAlive() {

    }

    public Set<BoardPosition> figurePositions() {

    }

    public BoardFigures placeFigure(Figure troop, BoardPosition target) {

    }

    public BoardFigures figureStep(BoardPosition origin, BoardPosition target) {

    }

    public BoardFigures removeFigure(BoardPosition target) {

    }
}
