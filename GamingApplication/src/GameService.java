import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GameService {
    String url="jdbc:MySQL://localhost:3306/gaming?characterEncoding=utf8";
    String userName="root";
    String password="Admin@123";
    Connection con;
    Statement stmt;
        public GameService(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                this.con = DriverManager.getConnection(url, userName, password);
                this.stmt = this.con.createStatement();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    public Boolean insertData(int id,String name,int no) throws SQLException {
        CallableStatement callableStatement=con.prepareCall("{call addGame(?,?,?)}");
        callableStatement.setInt(1,id);
        callableStatement.setString(2,name);
        callableStatement.setInt(3,no);
        callableStatement.executeUpdate();
        System.out.println("Record inserted!!!!");
        return true;
    }
    public Boolean updateData(int id,String name,int no) throws SQLException {
        CallableStatement callableStatement=con.prepareCall("{call updateGame(?,?,?)}");
        callableStatement.setInt(1,id);
        callableStatement.setString(2,name);
        callableStatement.setInt(3,no);
        callableStatement.executeUpdate();
        System.out.println("Record updated!!!!");
        return true;
    }
    public Boolean deleteData(int id) throws SQLException {
        CallableStatement callableStatement=con.prepareCall("{call deleteGame(?)}");
        callableStatement.setInt(1,id);
        callableStatement.executeUpdate();
        System.out.println("Record deleted!!!");
        return true;
    }
    public Boolean findByGameId(int id)throws SQLException {
        CallableStatement cs = con.prepareCall("{call findGameById(?)}");
        cs.setInt(1, id);
        ResultSet rs=cs.executeQuery();
        while (rs.next()) {
            Game game=new Game();
            game.setGameId(rs.getInt(1));
            game.setGameName(rs.getString(2));
            game.setNoOfPlayers(rs.getInt(3));
            System.out.println(game);
        }
        return true;
    }
    public Boolean displayData() throws SQLException {
        List<Game> gameList=new ArrayList<>();
        CallableStatement callableStatement=con.prepareCall("{call getGames()}");
        ResultSet rs=callableStatement.executeQuery();
        while(rs.next()){
            Game game=new Game();
            game.setGameId(rs.getInt(1));
            game.setGameName(rs.getString(2));
            game.setNoOfPlayers(rs.getInt(3));
            System.out.println(game);
        }
        return true;
    }
}
