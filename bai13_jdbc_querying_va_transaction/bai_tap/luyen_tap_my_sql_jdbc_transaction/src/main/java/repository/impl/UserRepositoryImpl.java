package repository.impl;

import bean.User;
import repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;

public class UserRepositoryImpl implements UserRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";
    @Override
    public ArrayList<User> findAll() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall("call find_all()");
            ResultSet resultSet = callableStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public User findById(Integer id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from users where id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public void updateUser(Integer id, String name, String email, String country) {
        try {
            CallableStatement callableStatement = baseRepository.getConnection().
                    prepareCall("call update_user(?,?,?,?)");
            callableStatement.setInt(1, id);
            callableStatement.setString(2, name);
            callableStatement.setString(3, email);
            callableStatement.setString(4, country);
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteUser(Integer idDelete) {
        PreparedStatement preparedStatement = null;
        try {
            CallableStatement callableStatement = baseRepository.getConnection().
                    prepareCall("call delete_user(?)");
            callableStatement.setInt(1, idDelete);
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void createUser(Integer idCreate, String nameCreate, String emailCreate, String countryCreate) {
        Connection connection = baseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            connection.setAutoCommit(false);
            preparedStatement = connection.
                    prepareStatement("insert into users(id,name,email,country) value (?,?,?,?)");
            preparedStatement.setInt(1, idCreate);
            preparedStatement.setString(2, nameCreate);
            preparedStatement.setString(3, emailCreate);
            preparedStatement.setString(4, countryCreate);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException throwables) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }
    }

    @Override
    public ArrayList<User> countrySearch(String countrySearch) {
        PreparedStatement preparedStatement = null;
        ArrayList<User> userList = new ArrayList<>();
        try {
            preparedStatement = baseRepository.getConnection().prepareStatement("select * from users where country like ?");
            preparedStatement.setString(1, "%" + countrySearch + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public ArrayList<User> sortName() {
        PreparedStatement preparedStatement = null;
        ArrayList<User> userList = new ArrayList<>();
        try {
            preparedStatement = baseRepository.getConnection().prepareStatement("select * from users order by name");
            ResultSet resultSet = preparedStatement.executeQuery();
            User user;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{CALL get_user_by_id(?)}";
        // Step 1: Establishing a Connection
        Connection connection = baseRepository.getConnection();
        // Step 2:Create a statement using connection object
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(query);
            callableStatement.setInt(1, id);
            // Step 3: Execute the query or update query
            ResultSet rs = callableStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}

