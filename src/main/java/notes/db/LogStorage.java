package notes.db;

import notes.ConnectionDB;
import notes.Const;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class LogStorage {
    public static void insert(int id_user, int id_note, String type_action) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        String sql = "INSERT INTO " + Const.LOG_TABLE + "(" +
                Const.LOG_ID_USER + ", " + Const.LOG_TYPE + ", " +
                Const.LOG_ID_NOTE+ ", " + Const.LOG_TIME + ")" +
                "VALUES(?,?,?,?)";
        PreparedStatement prSt = connectionDB.connectionDb().prepareStatement(sql);
        prSt.setInt(1, id_user);
        prSt.setString(2, type_action);
        prSt.setInt(3, id_note);
        prSt.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

        prSt.executeUpdate();
    }
}
