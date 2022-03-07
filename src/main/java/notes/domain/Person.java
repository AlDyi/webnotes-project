package notes.domain;

import java.util.GregorianCalendar;

public class Person {
    private int id;
    private String email;
    private String fio;
    private long phone_number;
    private String password;

    public Person(){}

    public Person (String email, String fio, String password, long phone_number) {
        this.email = email;
        this.fio = fio;
        this.password = password;
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFio() {
        return fio;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

