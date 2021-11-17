package uet.oop.bomberman.entities;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import uet.oop.bomberman.entities.lifesingame.LifesInGame;

public class Bomber extends LifesInGame {

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    public Bomber() {}

    public Bomber(int isMove, int swap, String direction, int countStep, int countToRun) {
        super(5, 1, "down", 0, 0);
    }

    @Override
    public void calculateMove() {

    }

    @Override
    public void update() {

    }
}
