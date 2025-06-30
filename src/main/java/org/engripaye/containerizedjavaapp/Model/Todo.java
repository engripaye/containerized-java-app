package org.engripaye.containerizedjavaapp.Model;

public class Todo {

    private Long id;
    private String task;

    public Todo() {}

    public Todo(Long id, String task){
        this.id = id;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTask(String task){
        this.task = task;
    }


}
