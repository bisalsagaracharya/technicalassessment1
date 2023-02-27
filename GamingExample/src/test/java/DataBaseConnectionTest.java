import org.example.Game;
import org.example.GameDaoImpl;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DataBaseConnectionTest {

    GameDaoImpl gameDao = new GameDaoImpl();

    @Test
    public void testDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Admin@123");
            assertNotNull("Connection should not be null", connection);
        } catch (SQLException e) {
            fail("Could not connect to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            fail("Could not load the MySQL JDBC driver: " + e.getMessage());
        }
    }

    @Test
    public void addGameTest() {
        gameDao.deleteGame(2000);
        Game game = new Game(2000, "Polo", 20);
        boolean isAdded = gameDao.addGame(game);
        assertNotNull(game);
        assertEquals(true, isAdded);
        gameDao.deleteGame(2000);
    }

    @Test
    public void deleteGame() {
        Game game=new Game(101,"Football",20);
        assertNotNull(game);
        gameDao.addGame(game);
        boolean isAdded =gameDao.deleteGame(101);
        assertEquals(true,isAdded);


    }
    @Test
    public void updateGame() {
            Integer gameID=2;
            Game verification=gameDao.findByGameId(2);
            Game game = new Game(2,"cricket",20);
            game.setGameId(game.getGameId());
            game.setGameName(game.getGameName());
            game.setNoOfPlayer(game.getNoOfPlayer());
            gameDao.updateGame(game);
            assertEquals(game.getNoOfPlayer(),game.getNoOfPlayer());

        }
       @Test
        public void getAllGame(){
        assertEquals(3, gameDao.getAllGame().size());

        }

    @Test
    public void test_getGames() {
        int gameId = 2;
        assertEquals(2, gameDao.findByGameId(gameId).getGameId());

    }


}