package tw.waterball.survive.io.game.world;

import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.role.Monster;
import tw.waterball.survive.io.game.sprite.role.Player;
import tw.waterball.survive.io.game.sprite.terrain.Terrain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - a89010531111@gmail.com
 */
public class SpriteContainer {
    private final List<Sprite> sprites = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();
    private final List<Monster> monsters = new ArrayList<>();
    private final List<Terrain> map = new ArrayList<>();

    public List<Sprite> getSprites() {
        return sprites;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public List<Terrain> getMap() {
        return map;
    }

    public void addSprite(Sprite sprite) {
        sprites.add(sprite);
    }
}
