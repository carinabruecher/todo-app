package com.company;

public class Task {

    private String title;
    private String description;
    private Boolean finished;
    private int id;
    private static int staticId = 1;

    public Task(String title, String description, Boolean finished){
        this.title = title;
        this.description = description;
        this.finished = finished;
        this.id = staticId;
        this.staticId++;
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
