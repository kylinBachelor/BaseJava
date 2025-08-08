package 设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

public class GameStore extends Game{

    List<Game> gameList = null;

    public GameStore(String name) {
        super(name);
        gameList = new ArrayList<>();
    }
    /**
     * 展示游戏
     */
    public void display() {
        for (Game game: gameList){
            game.display();
        }
    }

    public void add(Game game){
        gameList.add(game);
    }

    public void remove(Game game){
        gameList.remove(game);
    }
}