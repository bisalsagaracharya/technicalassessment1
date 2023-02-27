package com.globallogic.service;

import com.globallogic.Entity.Game;
import com.globallogic.config.DbConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GameService {
    Connection connect;

    PreparedStatement preparedStatement;

    private final String INSERT_Game = "INSERT INTO game VALUES (?,?,?,?)";
    // private final String SELECT_MOVIES_BY_YEAR = "SELECT * FROM movie WHERE releasedin = ?";
    private final String UPDATE_Game_BY_ID = " UPDATE game SET gameName = ? WHERE gameId = ?";
    private final String SELECT_Game_BY_ID = "SELECT * FROM game WHERE gameId = ?";
    private final String getAllGame = "SELECT * FROM game";


    public GameService() {
        connect = new DbConfig().connect();

    }

    public Game findGame(int game_id) throws SQLException {
        Game game = new Game();
        CallableStatement preparedStatement = connect.prepareCall("call findGame(?)");
        //preparedStatement = connect.prepareStatement(SELECT_STUDENT_BY_ID);
        preparedStatement.getInt(1);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {

            game.setGame_id(rs.getInt(1));
            game.setGame_name(rs.getString("Rakesh"));
            game.setNo_of_players(rs.getInt(2));

        }
        return game;
    }
    public boolean addGame(Game game) throws SQLException
    {
        CallableStatement callableStatement = connect.prepareCall(INSERT_Game);


        callableStatement.setInt(1,game.getGame_id());


        callableStatement.setString(2, game.getGame_name());
        callableStatement.setInt(3,game.getNo_of_players());


        int i = callableStatement.executeUpdate();

        return i > 0 ? true : false;
    }

    public List<Game> findAllGame(Game game) throws SQLException
    {
        List<Game> game1 = new ArrayList<>();
        CallableStatement callableStatement = connect.prepareCall(getAllGame);

        ResultSet rs =callableStatement.executeQuery();
        while(rs.next())
        {
             game1.add(new Game(1,"rocky",3));
        }
        return game1;
    }

    public void  updateGame() throws SQLException
    {
        try {

            CallableStatement callableStatement = connect.prepareCall(UPDATE_Game_BY_ID);
            callableStatement.setString(1,"singh");
            callableStatement.setInt(2, 1);

            callableStatement.executeUpdate();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



}