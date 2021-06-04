package AlexLink.HomeWork.HomeworkJDBS.DAO;

import AlexLink.HomeWork.HomeworkJDBS.Connection.ConnectorDB;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesDAOImpl implements SelectMoviesDAO, ChangeMoviesDAO {
    @Override
    public List<String> selectTitleOfMoviesByCurrentYear() {
        try (Connection cn = ConnectorDB.getConnection()) {
            Statement statement = cn.createStatement();
            List<String> listTitle = new ArrayList<>();
            ResultSet rs = statement.executeQuery(SqlQueryOfSelect.SELECT_TITLE_OF_MOVIES_BY_CURRENT_YEAR);
            while (rs.next()) {
                String title = rs.getString(1);
                listTitle.add(title);
            }
            return listTitle;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, LocalDate> selectInfoAboutActorsInCurrentMovie(String title) {
        Map<String, LocalDate> infoByActors = new HashMap<>();
        try (Connection cn = ConnectorDB.getConnection()) {
            PreparedStatement preparedStatement = cn.prepareStatement(SqlQueryOfSelect.SELECT_INFO_ABOUT_ACTORS_IN_CURRENT_MOVIE);
            preparedStatement.setString(1, title);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                infoByActors.put(resultSet.getString("name_actors"),
                        resultSet.getDate("birthday").toLocalDate());
            }
            return infoByActors;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> selectActorsByCountMovies(int countMovies) {
        List<String> listActors = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SqlQueryOfSelect.SELECT_ACTORS_BY_COUNT_MOVIES);
            ps.setInt(1, countMovies);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listActors.add(rs.getString(1));
            }
            return listActors;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> selectActorsWhoWasAProducer() {
        List<String> listProducers = new ArrayList<>();
        try (Connection con = ConnectorDB.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SqlQueryOfSelect.SELECT_ACTORS_WHO_WAS_A_PRODUCER);
            while (rs.next()) {
                listProducers.add(rs.getString(1));
            }
            return listProducers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int DELETE_MOVIES_BY_YEARS(int year) {
        int countOfDelete;
        try (Connection con = ConnectorDB.getConnection()) {
            PreparedStatement ps = con.prepareStatement(SqlQueryOfChange.DELETE_MOVIES_BY_YEARS);
            ps.setInt(1, year);
            countOfDelete = ps.executeUpdate();
            return countOfDelete;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
