package MODELOS;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;

public class Task extends ModeloBase{

private int idTarea;
    private String title;

    private String description;
    private Date dateTime;
    private Date deadline;

     private boolean status;
     private User user;

    public Task() {
    }

    public Task(int idTarea, String title, String description,
                Date dateTime, Date deadline,
                boolean status, User user) {
        this.idTarea = idTarea;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.deadline = deadline;
        this.status = status;
        this.user = user;
    }


    // Getter y Setter para idTarea
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    // Getter y Setter para title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter y Setter para description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter y Setter para dateTime
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    // Getter y Setter para deadline
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    // Getter y Setter para status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Getter y Setter para user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected String getNombreTabla() {
        return "task";
    }


    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }

}




