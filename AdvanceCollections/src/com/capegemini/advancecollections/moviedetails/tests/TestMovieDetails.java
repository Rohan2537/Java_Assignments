/*	
	2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
	a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
	b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
	c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 
 */

package com.capgemini.advancecollections.moviedetails.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Before;
import org.junit.Test;

public class TestMovieDetails {
	private MovieDetailsList movielist;
	private ArrayList list;
	private MovieDetails movieOne;
	private MovieDetails movieTwo;
	private MovieDetails movieThree;
	private MovieDetails movieFour;
	private MovieDetails movieFive;
	
	@Before
	public void setUp(){
		movieOne = new MovieDetails("Dangal", "Amir Khan", "Sakshi Tanwar","Biopic");	//Objects of class MovieDetails;
		movieTwo = new MovieDetails("Zero", "Shahrukh Khan", "Anushka Sharma","Comedy");
	        movieThree = new MovieDetails("AirLift", "Akshay Kumar","Nimrat Kaur", "Action");
	        movieFour = new MovieDetails("Three Idiots", "Amir khan","Kareena Kapoor", "Comedy");
	        movieFive = new MovieDetails("Raazi","Vicky Kaushal","Alia Bhatt","Action");
	        movielist = new MovieDetailsList();
		
		movielist.addMovie(movieOne);
		movielist.addMovie(movieTwo);
		movielist.addMovie(movieThree);
		movielist.addMovie(movieFour);

		list = new ArrayList();	//ArrayList to add objects of MovieDetailsList;
		list.add(movieOne);
		list.add(movieTwo);
		list.add(movieThree);
		list.add(movieFour);
	}
	
	@Test
	public void testToSortMovieByName() {	//test to Sort movies by name;
		String expected = "[MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy]]";
		assertEquals(expected,movielist.sortMovies("movieName", list).toString());
		
	}
	
	@Test
	public void testToSortMovieByLeadActor(){	//test to Sort movies by Lead actor;
		String expected = "[MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy]]";
		assertEquals(expected,movielist.sortMovies("leadActor", list).toString());
	}
	
	@Test
	public void testToSortMovieByLeadActress(){	//test to Sort movies by Lead Actress;
		String expected = "[MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic]]"; 
		assertEquals(expected,movielist.sortMovies("leadActress", list).toString());		
	}
	
	@Test
	public void testToSortMovieByGenre(){	//test to Sort movies by Genre;
		String expected = "[MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy]]";
		assertEquals(expected,movielist.sortMovies("genre", list).toString());				
	}
	
	@Test
	public void testToRemoveAll(){	//test to remove all elements from ArrayList;
		assertEquals(false,movielist.removeAllMovies(list));
		}
	
	@Test
	public void testToAddObjectInTheArrayList(){	//test to add object in the list;
		movielist.addMovie(movieFive);
		String expected = "MovieDetailsList [list=[MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy], MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy], MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=Zero, leadActor=Shahrukh Khan, leadActress=Anushka Sharma, genre=Comedy], MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy], MovieDetails [movieName=Raazi, leadActor=Vicky Kaushal, leadActress=Alia Bhatt, genre=Action]]]";
		assertEquals(expected,movielist.toString());
	}
	
	@Test
	public void testToRemoveObjectFromArrayList(){	//test to remove object from the list;
		movielist.removeMovie(movieTwo);
		String expected = "MovieDetailsList [list=[MovieDetails [movieName=Dangal, leadActor=Amir Khan, leadActress=Sakshi Tanwar, genre=Biopic], MovieDetails [movieName=AirLift, leadActor=Akshay Kumar, leadActress=Nimrat Kaur, genre=Action], MovieDetails [movieName=Three Idiots, leadActor=Amir khan, leadActress=Kareena Kapoor, genre=Comedy]]]";
		assertEquals(expected,movielist.toString());
	}
}
