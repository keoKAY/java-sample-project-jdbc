package model;

import java.sql.Timestamp;

public class Administrator {
    private int id;
    private String username;
    private String password;
    private Timestamp createdDate;

    public Administrator(int id, String username, String password, Timestamp createdDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createdDate  = createdDate;
    }

    public Administrator(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
