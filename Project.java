import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Project {

    private String name;
    private boolean isInternal;
    public int projectID;
    private static List<Activity> activities = new ArrayList<>();
    private ProjectLeader projectLeader;
    private static DoublyLinkedList projectList = new DoublyLinkedList();

    public Project(String name, boolean isInternal) {
        this.name = name;
        this.isInternal = isInternal;
        projectID = calculateProjectID();
    }

    public Project(String name, boolean isInternal, ProjectLeader projectLeader) {
        this.name = name;
        this.isInternal = isInternal;
        projectID = calculateProjectID();
        this.projectLeader = projectLeader;
    }

    public static void createProject(String name, boolean isInternal) {
        Project project = new Project(name, isInternal);
        projectList.addNode(project);
    }

    public static void deleteProject(String name) {
        projectList.removeByProjectName(name);
    }


    public void setProjectLeader(Project project,ProjectLeader projectLeader) {
        project.projectLeader =projectLeader;
    }

    public void addActivity(Activity activity) {

        activities.add(activity);
    }

    public static void printActivities(Project project) {
        System.out.println("Activities in " + project + ":");
        for(int i = 0; i < activities.size(); i++) {

            System.out.println("aktivitet " + (i+1) + ":" + activities.get(i));
        }
        if(activities.isEmpty()) {
        System.out.println("There is no activities in this project yet");
        }

    }

    public static int calculateProjectID() {
        ProgramController controller = ProgramController.getInstance();
        Calendar calendar = new GregorianCalendar() ;
        int year = calendar.get(Calendar.YEAR);
        year %= 100;
        int projectID = year * 10000 + controller.getSequenceNumber();
        controller.updateSeqNumber();

        return projectID;
    }

    public String toString() {
        String projectIDString =String.valueOf(projectID);
    return  name + ", projectID: " + projectIDString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInternal() {
        return isInternal;
    }

    public void setInternal(boolean internal) {
        isInternal = internal;
    }

    public static DoublyLinkedList getProjectList() {
        return projectList;
    }

    //virker ikke
    public void getEmployeeList() {
        Employee employee = new Employee(null, null);
        for(int i = 0; i < activities.size(); i++) {
            for(int j=0; j < employee.getListOfActivities().size(); j++)
            if(activities.get(i) ==  employee.getListOfActivities().get(j)) {
                System.out.println(employee.getName());
            }
        }
    }


}
