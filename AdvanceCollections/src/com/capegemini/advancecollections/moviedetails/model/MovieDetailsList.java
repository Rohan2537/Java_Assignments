/*	
	2)	Create class Movie_Details with field�s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
	a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
	b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
	c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 
 */

package com.capgemini.advancecollections.moviedetails.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieDetailsList  {
	private static ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();

	/**
	 * method to add movie into arraylist;
	 * 
	 * @param movieToAdd
	 */
	public ArrayList addMovie(MovieDetails movieToAdd) {
		list.add(movieToAdd);
		return list;
	}

	/**
	 * method to remove movie from the arraylist;
	 * 
	 * @param list
	 * @param movieToRemove
	 */
	public ArrayList removeMovie(MovieDetails movieToRemove) {
		list.remove(movieToRemove);
		return list;
		
	}

	@Override
	public String toString() {
		return "MovieDetailsList [list=" + list + "]";
	}

	/**
	 * method to remove all movies from the arraylist;
	 * 
	 * @param list
	 */
	public boolean removeAllMovies(ArrayList list) {
		return list.remove(list);
	}

	/**
	 * method to search movie by Name;
	 * @param movieToSearch
	 * @return
	 */
	public MovieDetails findMovieByName(String movieToSearch) {
		for (MovieDetails String : list) {
			if (String.getMovieName().matches(movieToSearch)) {
				System.out.println(String);	// prints the object;
				return String;
			}
		}
		return null;
	}

	/**
	 * method to search movie by genre; 
	 * @param movieToSearch
	 * @return
	 */
	public MovieDetailsList findMovieByGenre(String movieToSearch) {
		MovieDetailsList movies = new MovieDetailsList();
		for (MovieDetails String : list) {
			if (String.getGenre().matches(movieToSearch)) {
				movies.addMovie(String);
			}
		}
		return movies;
	}

	public ArrayList<MovieDetails> sortMovies(String sortBy, ArrayList arraylist) {
		if (sortBy.equals("movieName")) {
			Collections.sort(arraylist, MovieDetailsList.MovieNameComparator);
			return arraylist;
		} else if (sortBy.equals("leadActor")) {
			Collections.sort(arraylist, MovieDetailsList.MovieActorComparator);
			return arraylist;
		} else if (sortBy.equals("leadActress")) {
			Collections.sort(arraylist, MovieDetailsList.MovieActressComparator);
			return arraylist;
		} else if (sortBy.equals("genre")) {
			Collections.sort(arraylist, MovieDetailsList.MovieGenreComparator);
			return arraylist;
		} else
			return arraylist;
	}
	
	public static Comparator<MovieDetails> MovieNameComparator = new Comparator<MovieDetails>() {
		
		@Override
		public int compare(MovieDetails movieOne, MovieDetails movieTwo) {
			String movieNameOne = movieOne.getMovieName().toUpperCase();
			String movieNameTwo = movieTwo.getMovieName().toUpperCase();
			return movieNameOne.compareTo(movieNameTwo);
		}
	};

	public static Comparator<MovieDetails> MovieActorComparator = new Comparator<MovieDetails>() {
		
		@Override
		public int compare(MovieDetails actorOne, MovieDetails actorTwo) {
			String movieActorOne = actorOne.getLeadActor().toUpperCase();
			String movieActorTwo = actorTwo.getLeadActor().toUpperCase();
			return movieActorOne.compareTo(movieActorTwo);
		}
	};
	public static Comparator<MovieDetails> MovieActressComparator = new Comparator<MovieDetails>() {
		
		@Override
		public int compare(MovieDetails actressOne, MovieDetails actressTwo) {
			String movieActressOne = actressOne.getLeadActress().toUpperCase();
			String movieActressTwo = actressTwo.getLeadActress().toUpperCase();
			return movieActressOne.compareTo(movieActressTwo);
		}
	};

	public static Comparator<MovieDetails> MovieGenreComparator = new Comparator<MovieDetails>() {
		
		@Override
		public int compare(MovieDetails genreOne, MovieDetails genreTwo) {
			String movieGenreOne = genreOne.getGenre().toUpperCase();
			String movieGenreTwo = genreTwo.getGenre().toUpperCase();
			return movieGenreOne.compareTo(movieGenreTwo);
		}
	};
	 	
}
