package org.example;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MovieDao {
    String url;
    String user;
    String password;
    Connection myConn;
    Statement myStmt;

    public MovieDao() {

        this.url = "jdbc:MySQL://localhost:3306/justfurnishit";
        this.user ="root";
        this.password = "Admin@123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.myConn = DriverManager.getConnection(url, user, password);
            this.myStmt = this.myConn.createStatement();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

        //==============================================





    private static Scanner scanner = null;
    static List<Movie> listOfMovie = new ArrayList<>();
    public List<Movie> populateMoviess() {

        scanner = new Scanner(System.in);

        System.out.println("Please enter number of movies you want to add : ");
        int numberOfMovies = scanner.nextInt();
        for (int i = 1; i <= numberOfMovies; i++) {
            Movie movie = new Movie();

            System.out.println("Please enter id of movie" + i + " :");
            movie.setMovieId(scanner.next());

            System.out.println("Please enter name of movie" + i + " :");
            movie.setMovieName(scanner.next());

            System.out.println("Please enter movie language " + i + " :");
            movie.setLanguage(scanner.next());

            System.out.println("Please enter movie relase year" + i + " :");
            movie.setReleaseIn(scanner.nextInt());

            System.out.println("Please enter movie revenue in dollers" + i + " :");
            movie.setRevenueInDollars(scanner.nextDouble());

            listOfMovie.add(movie);


            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection myConn = DriverManager.getConnection(url, user, password);
//                Statement myStmt = myConn.createStatement();
                PreparedStatement preparedStatement = this.myConn.prepareStatement("INSERT INTO movie (movieId,movieName,language,releaseIn,revenueInDollars) VALUES(?,?,?,?,?)");
                preparedStatement.setString(1, movie.getMovieId());
                preparedStatement.setString(2, movie.getMovieName());
                preparedStatement.setString(3, movie.getLanguage());
                preparedStatement.setInt(4, movie.getReleaseIn());
                preparedStatement.setDouble(5, movie.getRevenueInDollars());
                preparedStatement.executeUpdate();
                System.out.println(i + "movie Added: " + movie);
//                this.myConn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return listOfMovie;
    }

    public List<Movie> totalListOfMovie(){
        List<Movie> movieListList = new ArrayList<>();
        try {
            ResultSet rs = this.myStmt.executeQuery("SELECT * FROM movie");
            while(rs.next()){
                Movie movie=new Movie();
                movie.setMovieId(rs.getString(1));
                movie.setMovieName(rs.getString(2));
                movie.setLanguage(rs.getString(3));
                movie.setReleaseIn(rs.getInt(4));
                movie.setRevenueInDollars(rs.getDouble(5));

                movieListList.add(movie);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movieListList;
    }
    public Movie ListOfMovieFromId(String id) {
        List<Movie> movieListList = totalListOfMovie();

        return movieListList.stream().filter(movie -> movie.getMovieId().equals(id)).collect(Collectors.toList()).get(0);
    }

    public List<Movie> ListOfMovieFromYear(Integer year) {
        List<Movie> movieListList = totalListOfMovie();

        return movieListList.stream().filter(movie -> movie.getReleaseIn().equals(year)).collect(Collectors.toList());
    }

    public Boolean deleteMovie(String movieId) {

        Boolean isRecodDeleted = false;
        String sql = "DELETE FROM movie WHERE movieId = ?";

        try {
            PreparedStatement preparedStatement = this.myConn.prepareStatement(sql);

            preparedStatement.setString(1, movieId);

            int count = preparedStatement.executeUpdate();
            if (count == 1)
                isRecodDeleted = true;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return  isRecodDeleted;

    }

    public Boolean updateMovieRevenue(String movieId,Double amount){
        Boolean isRecodUpdated = false;
        String sql = "UPDATE movie SET revenueInDollars = ?  WHERE movieId = ?";

        try {
            PreparedStatement preparedStatement = this.myConn.prepareStatement(sql);
            preparedStatement.setDouble(1, amount);
            preparedStatement.setString(2, movieId);
            int count = preparedStatement.executeUpdate();
            if (count == 1)
                isRecodUpdated = true;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return isRecodUpdated;

    }


    public void closeConnection() {
        try {
            this.myConn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }







    //===========================================================







}
