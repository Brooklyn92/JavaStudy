package com.study_io.repository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryFileImpl("users.txt");
        List<User> users = usersRepository.findAll();

        for (User user: users) {
            System.out.println(user.getAge() + " " +  user.getName() + " " + user.isWorker());
        }
        User user = new User("Игорь", 33, true);
        usersRepository.save(user);



    }
}
