package AlexLink.HomeWork.HomeworkJDBS.DAO;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface SelectMoviesDAO {
    List<String> selectTitleOfMoviesByCurrentYear();
    Map<String, LocalDate> selectInfoAboutActorsInCurrentMovie(String title);
    List <String> selectActorsByCountMovies(int countMovies);
    List <String> selectActorsWhoWasAProducer();
}
