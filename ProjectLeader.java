import java.util.ArrayList;

public class ProjectLeader extends Employee{
    private ArrayList<Project> listOfProjects = new ArrayList<Project>();

    public ProjectLeader(String name, String initials, ArrayList<Activity> listOfActivities, ArrayList<Project> listOfProjects) {
        super(name, initials /*,listOfActivities*/);
        this.listOfProjects = null;
    }
}

