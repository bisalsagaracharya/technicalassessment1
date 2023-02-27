package org.example;

import java.util.List;

public class Driver {

	public static void main(String[] args) {

		MovieDao movieDao = new MovieDao();

		try {

			List<Movie> mvs = movieDao.populateMoviess();
			for (Movie m : mvs) {
				System.out.println(m);
			}
			System.out.println(movieDao.ListOfMovieFromId("1001"));
			List<Movie> mvs1 = movieDao.ListOfMovieFromYear(1998);
			for (Movie m : mvs1) {
				System.out.println(m);
			}
			System.out.println("Update revenue of movie");
//            System.out.println(movieDao.updateMovieRevenue("1001",45445.0));

			System.out.println("List of movie");

			System.out.println(movieDao.ListOfMovieFromId("1001"));
//            System.out.println(movieDao.deleteMovie("1001"));
			System.out.println(movieDao.ListOfMovieFromId("1001"));

		} catch (Exception e) {
		} finally {
			movieDao.closeConnection();
		}

	}
}
