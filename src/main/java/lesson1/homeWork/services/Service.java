package lesson1.homeWork.services;

import lesson1.homeWork.classes.Entity;

import java.io.IOException;

public interface Service {

        boolean checkUser(Entity entity) throws IOException;

        void signUpUserData(Entity entity) throws IOException;
}
