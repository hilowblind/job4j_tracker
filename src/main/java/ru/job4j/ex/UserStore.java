package ru.job4j.ex;

import ru.job4j.tracker.Item;

import java.util.Arrays;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int checkFound = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                checkFound = i;
                break;
            }
        }
        if (checkFound == -1) {
            throw new UserNotFoundException("User not found");
        }
        return users[checkFound];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException  e) {
            System.out.println("User not found");
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("User is not valid");;
        }
    }
}