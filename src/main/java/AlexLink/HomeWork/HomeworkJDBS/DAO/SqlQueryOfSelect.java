package AlexLink.HomeWork.HomeworkJDBS.DAO;

public class SqlQueryOfSelect {

    public static final String SELECT_TITLE_OF_MOVIES_BY_CURRENT_YEAR =
            "SELECT title FROM movies " +
            "WHERE EXTRACT(YEAR FROM premiere) = 2020 OR EXTRACT(YEAR FROM premiere) = 2021";

    public static final String SELECT_INFO_ABOUT_ACTORS_IN_CURRENT_MOVIE =
            "SELECT a.name_actors, a.birthday FROM movies AS m " +
                    "INNER JOIN listactors AS la ON la.ID_movies = m.id " +
                    "INNER JOIN actors AS a ON a.name_actors = la.name_actor " +
                    "WHERE m.title = ?";

    public static final String SELECT_ACTORS_BY_COUNT_MOVIES =
            "SELECT name_actor, count(*) AS count FROM listactors " +
            "GROUP BY name_actor HAVING count(*) >= ?";

    public static final String SELECT_ACTORS_WHO_WAS_A_PRODUCER =
            "SELECT name_actors FROM actors JOIN movies WHERE name_actors = producer";
}
