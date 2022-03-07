package notes;

import notes.db.PersonStorage;
import notes.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

public class LogInSignUp {

    public String logIn(Person person) throws SQLException, ClassNotFoundException {
        PersonStorage.insert(person);
        return "Регистрация прошла успешно!";
    }
}
