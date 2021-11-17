package uet.oop.bomberman.level;

import uet.oop.bomberman.entities.Brick;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.Grass;
import uet.oop.bomberman.entities.Wall;
import uet.oop.bomberman.graphics.Sprite;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

import static uet.oop.bomberman.BombermanGame.stillObjects;
/*
public class LoadLevel {
    public static char[][] _map;
    public static int _level = 1;
    public static int _width = 0;
    public static int _height = 0;
/*
    public void createMap() {
        String path = "res/levels/Level" + _level + ".txt";
        try {
            FileReader mapFile = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(mapFile);
            bufferedReader.readLine();
            int rowCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null){
                for (int i = 0; i < line.length(); i++){
                    if (line.charAt(i) == '#') {

                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void createMap() {
        for(int i = 0; i < _width; i++) {
            for (int j = 0; j < _height; j++) {
                Entity object = null;
                switch (_map[i][j]) {
                    case '#':
                        // Thêm Wall
                        object = new Wall(i, j, Sprite.wall.getFxImage());
                        break;
                    case '*':
                        // Thêm Brick
                        object = new Brick(i, j, Sprite.brick.getFxImage());
                        break;
                   // case 'x':
                        // Thêm Portal kèm Brick che phủ ở trên
                        //_board.addEntity(j + i * _width,
                               // new LayeredEntity(j, i,
                                       // new Grass(j ,i, Sprite.grass),
                                       // new Portal(j, i, Sprite.portal, _board),
                                       // new Brick(j, i, Sprite.brick)
                               // )
                       // );
                       // break;
                    //case 'z':
                        // Thêm Portal nhưng không có Brick che phủ
                       // _board.addEntity(j + i * _width,
                             //   new LayeredEntity(j, i,
                             //           new Grass(j, i, Sprite.grass),
                             //           new Portal(j, i, Sprite.portal, _board)
                            //    )
                       // );
                        //break;
                    //case 'p':
                        // Thêm Bomber
                       // int xBomber = j, yBomber = i;
                       // _board.addCharacter( new Bomber(Coordinates.tileToPixel(xBomber), Coordinates.tileToPixel(yBomber) + Game.TILES_SIZE, _board) );
                       // _board.addEntity(xBomber + yBomber * _width, new Grass(xBomber, yBomber, Sprite.grass));
                       // break;
                    //case 'l':
                        // Thêm Blue Bomber (Link)
                       // int xBlueBomber = j, yBlueBomber = i;
                       // _board.addCharacter(new BlueBomber(Coordinates.tileToPixel(xBlueBomber), Coordinates.tileToPixel(yBlueBomber) + Game.TILES_SIZE, _board));
                       // _board.addEntity(xBlueBomber + yBlueBomber * _width, new Grass(xBlueBomber, yBlueBomber, Sprite.grass));
                      //  break;
                    //case '1':
                        // Thêm Enemy Balloon
                      //  _board.addCharacter( new Balloon(Coordinates.tileToPixel(j), Coordinates.tileToPixel(i) + Game.TILES_SIZE, _board));
                      //  _board.addEntity(j + i * _width, new Grass(j, i, Sprite.grass));
                      //  break;
                    //case '2':
                        // Thêm Enemy Oneal
                      //  _board.addCharacter( new Oneal(Coordinates.tileToPixel(j), Coordinates.tileToPixel(i) + Game.TILES_SIZE, _board));
                    // _board.addEntity(j + i * _width, new Grass(j, i, Sprite.grass));
                    //  break;
                    //case '3':
                        // Thêm Enemy Ghosts
                    //   _board.addCharacter( new Ghost(Coordinates.tileToPixel(j), Coordinates.tileToPixel(i) + Game.TILES_SIZE, _board));
                    //   _board.addEntity(j + i * _width, new Grass(j, i, Sprite.grass));
                    //   break;
                    //case '4':
                        // Thêm Pontan
                    //   _board.addCharacter( new Pontan(Coordinates.tileToPixel(j), Coordinates.tileToPixel(i) + Game.TILES_SIZE, _board));
                    //   _board.addEntity(j + i * _width, new Grass(j, i, Sprite.grass));
                    //   break;
                    //case 'b':
                        // Thêm Bomb Item kèm Brick che phủ lên
                    //  _board.addEntity(j + i * _width,
                    //       new LayeredEntity(j, i,
                    //                new Grass(j, i, Sprite.grass),
                    //                 new BombItem(j, i, Sprite.powerup_bombs),
                    //                 new Brick(j, i, Sprite.brick)
                    //         )
                    //  );
                    //   break;
                    //case 'f':
                        // Thêm Flame Item kèm Brick che phủ lên
                    //  _board.addEntity(j + i * _width,
                    //         new LayeredEntity(j, i,
                    //                 new Grass(j, i, Sprite.grass),
                    //                 new FlameItem(j, i, Sprite.powerup_flames),
                    //                  new Brick(j, i, Sprite.brick)
                    //            )
                    //   );
                    //   break;
                    //case 's':
                        // Thêm Speed Item kèm Brick che phủ lên
                    // _board.addEntity(j + i * _width,
                    //           new LayeredEntity(j, i,
                    //                   new Grass(j, i, Sprite.grass),
                    //                   new SpeedItem(j, i, Sprite.powerup_speed),
                    //                   new Brick(j, i, Sprite.brick)
                    //           )
                    //   );
                    //   break;
                    default:
                        // Thêm Grass
                        object =  new Grass(i, j, Sprite.grass.getFxImage());
                        break;
                }
                stillObjects.add(object);
            }
        }
    }
    
*/
