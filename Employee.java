import java.util.ArrayList;
import java.util.List;

public class Employee {

    private  String name;
    private  String initials;
    private ArrayList<Activity> listOfActivities = new ArrayList<Activity>();
    private static List<Employee> listOfEmployees = new ArrayList<Employee>();
    public double workHours;

    public Employee(String name, String initials, ArrayList<Activity> listOfActivities) {
        this.name = name;
        this.initials = initials;
        this.listOfActivities = listOfActivities;
        //listOfEmployees.add(this);
    }

    public Employee(String name, String initials) {
        this.name = name;
        this.initials = initials;
    }

    public static void createEmployee( String name, String initials) {
        Employee employee1 = new Employee(name, initials);
        listOfEmployees.add(employee1);
    }

    public void addActivity(Activity activity) {
        listOfActivities.add(activity);
    }

    public ArrayList<Activity> getListOfActivities() {
        return listOfActivities;
    }

    public static List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }


    public boolean isAvailable() {
        if (getListOfActivities() == null || getListOfActivities().size() < 20 ) {
            System.out.println(this.name + " is available!");
            return true;


        } else {
            return false;
        }
    }



    public static void requestColleague(Activity activity, String initials) {

        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).isAvailable() && listOfEmployees.get(i).getInitials().equals(initials)) {
                listOfEmployees.get(i).addActivity(activity);
                break;
            } else {
                System.out.println(listOfEmployees.get(i) + " is unavailable");
            }

        }
    }


    public static void findAvailableEmployees() {
        for (int i = 0; i < listOfEmployees.size(); i++) {
            System.out.print("Employee " + (i + 1) + ", ");
            if (listOfEmployees.get(i).isAvailable() == true) {

               // listOfEmployees.get(i).isAvailable();
            }
        }
    }

    public void registerWorkHours(double workHours) {
        this.workHours += workHours;
    }

    public double getRegisteredWorkHours() {
        return workHours;
    }

    public void editWorkHours(double totalWorkHours) {
        this.workHours = totalWorkHours;
    }

    public String getInitials() {
        return initials;
    }

    public String getName() {
        return name;
    }

    public static Employee initials(String initials) {


        for (int i = 0; i < listOfEmployees.size(); i++) {
            if(listOfEmployees.get(i).getInitials().equals(initials)) {
                return listOfEmployees.get(i);
            }
            else {
                System.out.println("There are no employees with those initials");
                break;

            }

        }

         return null;
    }

    public void printActivities() {
        System.out.println("This employees activities are: ");
        for (int i = 0; i < listOfActivities.size(); i++) {

            System.out.println("activity " + (i + 1) + ":" + listOfActivities.get(i));
        }
        if (listOfActivities.isEmpty()) {
            System.out.println("There are no activities connected to this employee yet");
        }



    }
    public static void printEmployees() {
        System.out.println("This employees activities are: ");
        for (int i = 0; i < listOfEmployees.size(); i++) {

            System.out.println("Employee " + (i + 1) + ".... " + "name: " +
                    listOfEmployees.get(i).getName() + ",  initials: " + listOfEmployees.get(i).getInitials());
        }
        if (listOfEmployees.isEmpty()) {
            System.out.println("There are no employees in the system yet");
        }
    }

}