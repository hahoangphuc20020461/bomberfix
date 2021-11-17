package uet.oop.bomberman.entities;

public abstract class Animation extends Entity{
    protected int _anime = 0;
    protected final int MAX_ANIME = 7500;

    public void animate() {
        if(_anime < MAX_ANIME) {_anime++;}
        else {_anime = 0;}
    }
}
