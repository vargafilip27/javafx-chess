package cz.filipvarga.chess.game;

import cz.filipvarga.chess.game.tile.BoardTile;
import cz.filipvarga.chess.game.tile.Tile;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final Map<Position, Tile> tiles;
    private final int dimension;

    // Constructor, creates square game board of given size (dimension = width = height)
    public Board(int dimension) {
        tiles = new HashMap<>();
        this.dimension = dimension;

        for (int i = 0; i < dimension; ++i) {
            for (int j = 0; j < dimension; ++j) {
                PlayingSide color;

                if (i % 2 == j % 2) color = PlayingSide.BLACK;
                else color = PlayingSide.WHITE;

                tiles.put(new BoardPosition(dimension, i, j), new BoardTile(color));
            }
        }
    }

    // Constructor using already existing array
    private Board(int dimension, Map<Position, Tile> tiles){
        this.dimension = dimension;
        this.tiles = tiles;
    }

    // Size of the board
    public int getDimension() {
        return dimension;
    }

    // Returns a tile on a provided position
    public Tile at(Position pos) {
        return tiles.get(pos);
    }

    // Creates new board with new tiles provided by the ats parameter. All the other tiles stay the same
    public Board withTiles(TileAt... ats) {
        Map<Position, Tile> newTiles = tiles;

        for (TileAt at : ats) {
            newTiles.put(at.pos, at.tile);
        }

        return new Board(dimension, newTiles);
    }

    public static class TileAt {
        public final BoardPosition pos;
        public final BoardTile tile;

        public TileAt(BoardPosition pos, BoardTile tile) {
            this.pos = pos;
            this.tile = tile;
        }
    }
}

