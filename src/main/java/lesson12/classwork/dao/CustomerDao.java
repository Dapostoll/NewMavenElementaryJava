package lesson12.classwork.dao;

import lesson12.classwork.database.Database;
import lesson12.classwork.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    private static final String INSERT =
            "INSERT INTO customers (name,surname,email,age,password) VALUES (?,?,?,?,?)";
    private static final String CUSTOMERS = "SELECT * FROM customers";

    public List<Customer> findAllCustomers() {
        List<Customer> resultList = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(CUSTOMERS);

            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setSurname(resultSet.getString("surname"));
                customer.setAge(resultSet.getInt("age"));
                customer.setEmail(resultSet.getString("email"));
                customer.setPassword(resultSet.getString("password"));

                resultList.add(customer);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList;
    }

    public void save(Customer customer) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getSurname());
            statement.setString(3, customer.getEmail());
            statement.setInt(4, customer.getAge());
            statement.setString(5, customer.getPassword());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
