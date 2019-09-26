package com.company;

public class CreateService {

    private ITodoRepo todorepo;

    public CreateService(){
        todorepo = new ITodoRepo();
    }

    public void create(Task item){
        todorepo.addTask(item);
    }
}
