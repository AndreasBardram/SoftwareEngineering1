public class Main {
    public static void main(String[] args) {



    Employee.createEmployee( "Uffe", "Rolf");
    Employee.createEmployee( "Vaaben", "Vaab");
    Employee.createEmployee( "Adam", "Ada");
    Employee.createEmployee( "Philip", "Phil");

    Activity activity1 = new Activity("Skide", 10,11,2);
    Activity activity2 = new Activity("Spise", 10,11,2);
    Activity activity3 = new Activity("Drikke", 10,11,2);

    Employee.initials("Rolf").addActivity(activity1);
    Employee.initials("Rolf").addActivity(activity2);

    Employee.initials("Rolf").printActivities();

    Employee.requestColleague(activity3, "Rolf");
    Employee.initials("Rolf").printActivities();

    Project project1 = new Project("sutDiller", true);
    project1.addActivity(activity1);
    project1.addActivity(activity2);
    project1.getEmployeeList();

    }

}
