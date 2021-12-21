package com.study_io.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {
    private String fileName;

    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        //Объявили переменные для досутпа
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            //создали читалку на основе файла
          reader = new FileReader(fileName);
          //Создали буферизированную читалку
            bufferedReader = new BufferedReader(reader);
            //прочитали строку
            String line = bufferedReader.readLine();
            // пока к нам не пришла "нелевая строка"
            while (line != null) {
                // разбиваем её по |
                String[] parts = line.split("\\|");
                //берём имя
                String name = parts[0];
                //берём возраст
                int age = Integer.parseInt(parts[1]);
                //берём статус о работе
                boolean isWorker = Boolean.parseBoolean(parts[2]);
                //создаём нового человека
                User  newUser = new User(name, age, isWorker);
                // добавляем его в список
                users.add(newUser);
                //считываем новую строку
                line = bufferedReader.readLine();

            }

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            // этот блок выполнится точно
            if(reader != null) {
                try {
                    // пытаемся закрыть ресурсы
                    reader.close();
                } catch (IOException e) {}
            }
            if (bufferedReader != null) {
                try {
                    // пытаемся закрыть ресурсы
                    bufferedReader.close();
                } catch (IOException e){}

            }

        }
        return users;
    }

    @Override
    public void save(User user) {
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(fileName, true);
            bufferedWriter   = new BufferedWriter(writer);
            bufferedWriter.write(user.getName() + "|" + user.getAge() + "|" + user.isWorker());
            bufferedWriter.flush(); // сброс буфера.
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ignore){}
            }
            if (bufferedWriter !=null){
                try {
                    bufferedWriter.close();
                } catch (IOException ignore){}
            }
        }

    }





    @Override
    public List<User> findByAge(int age) {
        //реализовать поиск пользователей по возрасту
        return null;
    }

    @Override
    public List<User> findAllIsWorker() {
        //реализовать поиск пользователей у которых isWorker = true
        return null;
    }
}
