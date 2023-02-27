package org.example;

import java.util.List;

public class MovieController {

    public static void main(String[] args) {


        MovieDao movieDao = new MovieDao();

        try{

            System.out.println("-----------------------------------------------------------------------------------------------------");
            List<Movie> mvs = movieDao.populateMoviess();
            for(Movie m : mvs){
                System.out.println(m);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println(movieDao.ListOfMovieFromId("1001"));
            System.out.println("-----------------------------------------------------------------------------------------------------");
            List<Movie> mvs1 = movieDao.ListOfMovieFromYear(1998);
            for(Movie m : mvs1){
                System.out.println(m);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println(movieDao.updateMovieRevenue("1001",45445.0));
            System.out.println(movieDao.ListOfMovieFromId("1001"));
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println(movieDao.deleteMovie("1001"));
            System.out.println(movieDao.ListOfMovieFromId("1001"));
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------");

        } catch(Exception e){
        System.out.println(e);
    }finally {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        movieDao.closeConnection();
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }



    }


}
