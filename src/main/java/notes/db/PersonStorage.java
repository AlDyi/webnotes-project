package notes.db;

import notes.ConnectionDB;
import notes.Const;
import notes.domain.Person;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class PersonStorage {

    public static void insert(Person person) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        String sql = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USERS_FIO + ", " + Const.USERS_EMAIL + ", " +
                Const.USERS_PHONE + ", " + Const.USERS_PASS + ")" +
                "VALUES(?,?,?,?)";
        PreparedStatement prSt = connectionDB.connectionDb().prepareStatement(sql);
        prSt.setString(1, person.getFio());
        prSt.setString(2, person.getEmail());
        prSt.setLong(3, person.getPhone_number());
        prSt.setString(4, person.getPassword());

        prSt.executeUpdate();
    }
}
