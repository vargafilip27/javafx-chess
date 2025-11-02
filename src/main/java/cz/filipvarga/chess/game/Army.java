package cz.filipvarga.chess.game;

import cz.filipvarga.chess.game.position.BoardPosition;
import cz.filipvarga.chess.game.position.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Army {
    private final BoardFigures boardFigures;
    private final List<Figure> stack;
    private final List<Figure> captured;

    public Army(PlayingSide playingSide, List<Figure> stack) {
        this(new BoardFigures(playingSide), stack, Collections.emptyList());
    }

    public Army(BoardFigures boardTroops, List<Figure> stack, List<Figure> captured) {
        this.boardFigures = boardTroops;
        this.stack = stack;
        this.captured = captured;
    }

    public PlayingSide side() {
        return boardFigures.playingSide();
    }

    public BoardFigures boardFigures() {
        return boardFigures;
    }

    public List<Figure> stack() {
        return stack;
    }

    public List<Figure> captured() {
        return captured;
    }

    public Army troopFigure(BoardPosition origin, BoardPosition target) {
        return new Army(boardFigures.figureStep(origin, target), stack, captured);
    }

    public Army removeFigure(BoardPosition target) {
        return new Army(boardFigures.removeFigure(target), stack, captured);
    }

    public Army capture(Figure figure) {
        List<Figure> newCaptured = new ArrayList<Figure>(captured);
        newCaptured.add(figure);

        return new Army(boardFigures, stack, newCaptured);
    }
}
