package AlexLink.HomeWork.HomeworkJDBS;

import AlexLink.HomeWork.HomeworkJDBS.DAO.MoviesDAOImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestJDBC {
    public static void main(String[] args) {
        MoviesDAOImpl moviesDAO = new MoviesDAOImpl();

        System.out.println("**********************************");
        System.out.println("The list movies that released this year or last year: ");
        List<String> listTitle = moviesDAO.selectTitleOfMoviesByCurrentYear();
        System.out.println(listTitle);
        System.out.println("**********************************");

        System.out.println("Enter the title of the movie -> ");
        Map<String, LocalDate> info = moviesDAO.selectInfoAboutActorsInCurrentMovie(new Scanner(System.in).nextLine());
        System.out.println("The list of actors from current movie: ");
        System.out.println(info);
        System.out.println("**********************************");

        System.out.println("Enter count of the movie ->");
        List<String> listActors = moviesDAO.selectActorsByCountMovies(new Scanner(System.in).nextInt());
        System.out.println("The list of actors who acted not less than in choice count movies: ");
        System.out.println(listActors);
        System.out.println("**********************************");

        System.out.println("The list of actors who were producers: ");
        List<String> listProducers = moviesDAO.selectActorsWhoWasAProducer();
        System.out.println(listProducers);
        System.out.println("**********************************");

        System.out.println("Enter the number of years -> ");
        int count = moviesDAO.deleteMoviesByYears(new Scanner(System.in).nextInt());
        System.out.println("Count deleted movies = " + count);

        System.out.println("Enter a title of the movie, which you want to change and new year of release of the movie");
        int result = moviesDAO.updatePremiereByTitle(new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
        System.out.println("The movie updated? " + (result == 1));
    }
}

