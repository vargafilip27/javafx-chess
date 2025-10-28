package cz.filipvarga.chess.game;

import java.util.ArrayList;
import java.util.List;

public class BoardPosition implements Position {
    private final int dimension;
    private final int column;
    private final int row;

    public BoardPosition(int dimension, int column, int row) {
        this.dimension = dimension;
        this.column = column;
        this.row = row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public int getRow() {
        return row;
    }

    public Position step(int columnStep, int rowStep) {
        int newColumn = column + columnStep;
        int newRow = row + rowStep;

        if ((newColumn >= 0 && newColumn < dimension) && (newRow >= 0 && newRow < dimension))
            return new BoardPosition(dimension, newColumn, newRow);
        else return Position.OFF_BOARD;
    }

    @Override
    public Position step(Offset2D step) {
        return step(step.x, step.y);
    }

    @Override
    public List<BoardPosition> neighbours() {
        List<BoardPosition> result = new ArrayList<>();
        Position pos = step(1, 0);
        if (pos != Position.OFF_BOARD) result.add((BoardPosition) pos);

        pos = step(-1, 0);
        if (pos != Position.OFF_BOARD) result.add((BoardPosition) pos);

        pos = step(0, 1);
        if (pos != Position.OFF_BOARD) result.add((BoardPosition) pos);

        pos = step(0, -1);
        if (pos != Position.OFF_BOARD) result.add((BoardPosition) pos);

        return result;
    }

    @Override
    public boolean isNextTo(Position pos) {
        if (pos == Position.OFF_BOARD) return false;

        if (this.getColumn() == pos.getColumn() && Math.abs(this.getRow() - pos.getRow()) == 1) return true;

        if (this.getRow() == pos.getRow() && Math.abs(this.getColumn() - pos.getColumn()) == 1) return true;

        return false;
    }

    @Override
    public Position stepByPlayingSide(Offset2D dir, PlayingSide side) {
        if (side == PlayingSide.BLACK) return step(dir);
        else return step(dir.yFlipped());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + column;
        result = prime * result + row;
        return result;
    }

    @Override
    public boolean equalsTo(int i, int j) {
        return this.column == i && this.row == j;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        BoardPosition other = (BoardPosition) obj;
        if (this.getColumn() != other.getColumn() || this.getRow() != other.getRow()) return false;
        else return true;
    }

    @Override
    public String toString() {
        char columnSymbol = (char)('a' + column);
        int rowSymbol = row + 1;

        return String.format("%c%d", columnSymbol, rowSymbol);
    }
}
