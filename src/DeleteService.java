package com.company;

public class DeleteService {

    private ITodoRepo todorepo;

    public DeleteService(){
        todorepo = new ITodoRepo();
    }

    public void delete(Task item){
        todorepo.deleteTask(item);
    }
}
