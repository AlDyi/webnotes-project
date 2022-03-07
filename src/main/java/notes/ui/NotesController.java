package notes.ui;


import notes.db.LogStorage;
import notes.db.NoteStorage;
import notes.db.PersonStorage;
import notes.domain.Note;
import notes.domain.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class NotesController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> showNotes() throws SQLException, ClassNotFoundException {
        Person human = new Person("eded@email.ru", "Иванов Иван Иванович", "yrgfefyg877", 89168554343L);
        PersonStorage.insert(human);
        human.setId(1);
        Note note = new Note("Покупки", "Arial", 14,
                "Молоко, масло, хлеб", "Arial", 11);
        NoteStorage.insert(human, note);
        note.setId(1);
        LogStorage.insert(human.getId(), note.getId(), "Создание заметки");
        return ResponseEntity.ok("Привет, это твои заметки!");
    }
}
