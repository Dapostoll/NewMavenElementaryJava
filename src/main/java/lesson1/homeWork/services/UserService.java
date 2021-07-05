package lesson1.homeWork.services;
import lesson1.homeWork.classes.Entity;

public class UserService extends AbstractService implements Service {
    private static final String MESSAGE = "Current method is unavailable for UserService";

    @Override
    public void signUpUserData(Entity entity) {
        System.out.println(MESSAGE);
    }
}