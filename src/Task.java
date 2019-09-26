package com.company;

public class Task {

    private String title;
    private String description;
    private Boolean finished;
    private int id;

    public Task(String title, String description, Boolean finished, int id){
        this.title = title;
        this.description = description;
        this.finished = finished;
        this.id = id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

}
