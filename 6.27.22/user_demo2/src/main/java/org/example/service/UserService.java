package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.User;

import java.util.Scanner;

// a layer of business logic that exists between the user and the next layer (DAO)
public class UserService {

    public static User create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        // at this point, we have a user that's ready to be inserted:
        User user = new User(username, password);

        System.out.println("This is the user you created: " + user.toString());

        // This is bad form because we would want this logic to sit in a factory
        // Factories are just classes that manage the creation of objects
        UserDao userDao = new UserDaoImpl();

        // call the method that we made in the user dao
        user = userDao.create(user);
        return user;


    }
}
