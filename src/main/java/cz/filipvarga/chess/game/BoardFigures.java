package cz.filipvarga.chess.game;

import cz.filipvarga.chess.game.position.BoardPosition;
import cz.filipvarga.chess.game.position.Position;
import cz.filipvarga.chess.game.tile.FigureTile;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BoardFigures {
    private final PlayingSide playingSide;
    private final Map<BoardPosition, FigureTile> troopMap;
    private final Position leaderPosition;
    private final int guards;

    public BoardFigures(PlayingSide playingSide) {

    }

    public BoardFigures(
            PlayingSide playingSide,
            Map<BoardPosition, FigureTile> troopMap,
            Position leaderPosition,
            int guards) {

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
