package com.company;

public class ConfigService {

    private ITodoRepo todorepo;

    public ConfigService(){
        todorepo = new ITodoRepo();
    }

    public void changeTitle(Task item, String title){
        todorepo.changeTitle(item, title);
    }

    public void changeDescription(Task item, String description){
        todorepo.changeDescription(item, description);
    }
}
