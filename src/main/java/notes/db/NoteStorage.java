package notes.db;

import notes.ConnectionDB;
import notes.Const;
import notes.domain.Note;
import notes.domain.Person;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NoteStorage {

    public static void insert(Person person, Note note) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        String sql = "INSERT INTO " + Const.NOTE_TABLE + "(" +
                Const.NOTES_H_TEXT + ", " + Const.NOTES_H_FONT + ", " +
                Const.NOTES_H_SIZE + ", " + Const.NOTES_B_TEXT + ", " +
                Const.NOTES_B_FONT + ", " + Const.NOTES_B_SIZE + ", " +
                Const.NOTES_ID_USER + ")" + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement prSt = connectionDB.connectionDb().prepareStatement(sql);
        prSt.setString(1, note.getHeaderText());
        prSt.setString(2, note.getHeaderFont());
        prSt.setInt(3, note.getHeaderFontSize());
        prSt.setString(4, note.getBodyText());
        prSt.setString(5, note.getBodyFont());
        prSt.setInt(6, note.getBodyFontSize());
        prSt.setInt(7, person.getId());

        prSt.executeUpdate();

    }
}
