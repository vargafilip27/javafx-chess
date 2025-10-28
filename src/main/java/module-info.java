module cz.filipvarga.chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens cz.filipvarga.chess to javafx.fxml;
    exports cz.filipvarga.chess;
    exports cz.filipvarga.chess.game;
    opens cz.filipvarga.chess.game to javafx.fxml;
    exports cz.filipvarga.chess.game.tile;
    opens cz.filipvarga.chess.game.tile to javafx.fxml;
}