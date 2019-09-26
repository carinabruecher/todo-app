import java.util.ArrayList;

public class TodoRepoTest implements ITodoRepo {
    private ArrayList<Task> _todos = new ArrayList<Task>();
    public ArrayList<Task> getToDos(){
    return _todos;
    };


}
