package cz.filipvarga.chess.game;

import java.util.List;

public interface Position {
    Position OFF_BOARD = new Position() {
        @Override
        public int getColumn() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getRow() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Position step(int columnStep, int rowStep) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Position step(Offset2D step) {
            throw new UnsupportedOperationException();
        }

        @Override
        public List<Position> neighbours() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isNextTo(Position pos) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Position stepByPlayingSide(Offset2D dir, PlayingSide side) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean equalsTo(int i, int j) {
            return false;
        }

        @Override
        public String toString() {
            return "off-board";
        }
    };

    public int getColumn();

    public int getRow();

    public Position step(int columnStep, int rowStep);

    public Position step(Offset2D step);

    public List<? extends Position> neighbours();

    public boolean isNextTo(Position pos);

    public Position stepByPlayingSide(Offset2D dir, PlayingSide side);

    public boolean equalsTo(int i, int j);
}
