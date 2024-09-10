import java.util.ArrayList;
import java.util.List;

public class GameManager implements IGame {
    private List<Game> gameList;

    public GameManager() {
        gameList = new ArrayList<>();
    }

    @Override
    public void addGame(Game game) {
        gameList.add(game);
        System.out.println(game.getName() + " oyunu eklendi.");
    }

    @Override
    public void removeGame(Game game) {
        gameList.remove(game);
        System.out.println(game.getName() + " oyunu silindi.");
    }

    public List<Game> getGameList() {
        return gameList;
    }
}
