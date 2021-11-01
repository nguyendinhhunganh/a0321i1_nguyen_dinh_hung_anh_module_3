package service.impl;

import bean.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private static UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public ArrayList<User> FindAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateUser(Integer id, String name, String email, String country) {
        if (findById(id) == null) {
            System.out.println("id khong dung");
        }
        if (name.equals("")) {
            System.out.println("name khong duoc de trong");
        }
        if (email.equals("")) {
            System.out.println("email khong duoc de trong");
        }
        if (country.equals("")) {
            System.out.println("country khong duoc de trong");
        }
        userRepository.updateUser(id,name,email,country);
    }

    @Override
    public void deleteUser(Integer idDelete) {
        if (findById(idDelete) == null) {
            System.out.println("id khong dung");
        }
        userRepository.deleteUser(idDelete);
    }

    @Override
    public void createUser(Integer idCreate, String nameCreate, String emailCreate, String countryCreate) {
        if (idCreate.equals("")) {
            System.out.println("id khong duoc de trong");
        }
        if (nameCreate.equals("")) {
            System.out.println("name khong duoc de trong");
        }
        if (emailCreate.equals("")) {
            System.out.println("email khong duoc de trong");
        }
        if (countryCreate.equals("")) {
            System.out.println("country khong duoc de trong");
        }
        userRepository.createUser(idCreate,nameCreate,emailCreate,countryCreate);
    }

    @Override
    public ArrayList<User> countrySearch(String countrySearch) {
        if (countrySearch.equals("")) {
            System.out.println("country khong duoc de trong");
        }
        return  userRepository.countrySearch(countrySearch);
    }

    @Override
    public ArrayList<User> sortName() {
        return userRepository.sortName();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public void addUserTransaction(User user, int[] permisions) {
        userRepository.addUserTransaction(user,permisions);

    }
}
