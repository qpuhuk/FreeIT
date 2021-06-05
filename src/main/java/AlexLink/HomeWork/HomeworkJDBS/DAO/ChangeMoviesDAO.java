package AlexLink.HomeWork.HomeworkJDBS.DAO;

public interface ChangeMoviesDAO {
    int deleteMoviesByYears(int year);
    int updatePremiereByTitle(String title,String date);
}
