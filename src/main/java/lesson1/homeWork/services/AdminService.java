package lesson1.homeWork.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lesson1.homeWork.classes.Entity;

public class AdminService extends AbstractService implements Service {

        @Override
        public void signUpUserData(Entity entity) throws IOException {
            File file = new File(super.getFilePath());
            FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
            writer.write(entity.toString());
            writer.close();
        }
    }
