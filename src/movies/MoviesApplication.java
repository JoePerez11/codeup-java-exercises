package movies;

import util.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        List<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
        boolean isRunning = true;

        while(isRunning){
            System.out.println(" ");
            System.out.println("What would you like to do?");
            System.out.println(" ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - animated");
            System.out.println("3 - drama");
            System.out.println("4 - horror");
            System.out.println("5 - scifi");
            System.out.println("6 - Add new movie");
            System.out.println(" ");
            int userInput = in.getInt(0,6);

            switch(userInput){
                case 0:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;
                case 1:
                    for(Movie movie: movies){
                        movie.displayInfo();
                    }
                    break;
                case 2:
                    for(Movie movie: movies){
                        if(movie.getCategory().equalsIgnoreCase("animated")){
                            movie.displayInfo();
                        }
                    }
                    break;
                case 3:
                    for(Movie movie: movies){
                        if(movie.getCategory().equalsIgnoreCase("drama")){
                            movie.displayInfo();
                        }
                    }
                    break;
                case 4:
                    for(Movie movie: movies){
                        if(movie.getCategory().equalsIgnoreCase("horror")){
                            movie.displayInfo();
                        }
                    }
                    break;
                case 5:
                    for(Movie movie: movies){
                        if(movie.getCategory().equalsIgnoreCase("scifi")){
                            movie.displayInfo();
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter name of movie: ");
                    String name = in.getString();
                    System.out.print("Enter category: ");
                    String category = in.getString();
                    Movie newMovie = new Movie(name, category);
                    movies.add(newMovie);
                    System.out.println("Added " + name + " - " + category + " to database.");
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }
}