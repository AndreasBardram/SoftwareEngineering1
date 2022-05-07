import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        startPage();
    }

    private static void startPage() {
        printStartPage();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if(input == 1){
            projectPage();
        } else if (input == 2) {
            activityPage();
        } else if (input == 3) {
            employeePage();
        } else if (input == 4) {
            workHoursPage();
        } else {
            System.out.println("Please enter a valid number");
            startPage();
        }
    }

    private static void projectPage() {
        printProjectPage();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1){
            //Create project
        } else if (input == 2) {
            //getProjectID
        } else if (input == 3) {
            //setProjectLeader
        } else if (input == 4) {
            //Add Activity
        } else if (input == 5) {
            //Add Employees
        } else if (input == 6) {
            //Get employee list
        } else if (input == 7) {
            //Get project Overview
        } else if (input == 8) {
            startPage();
        } else {
            System.out.println("Please enter a valid number");
            projectPage();
        }
    }

    private static void activityPage() {
        printActivityPage();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1){
            //Create Activity
        } else if (input == 2) {
            //Add employees to activity
        } else if (input == 3) {
            //Edit Activity
        } else if (input == 4) {
            //Get project activity list
        } else if (input == 5) {
            startPage();
        } else {
            System.out.println("Please enter a valid number");
            activityPage();
        }
    }

    private static void employeePage() {
        printEmployeePage();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1){
            // Create employee
        } else if (input == 2) {
            // Find available employees
        } else if (input == 3) {
            // is x employee available?
        } else if (input == 4) {
            // Request help from colleague
        } else if (input == 5) {
            startPage();
        } else {
            System.out.println("Please enter a valid number");
            employeePage();
        }
    }

    private static void workHoursPage() {
        printWorkHoursPage();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1){
            // Register work hours
        } else if (input == 2) {
            // Edit work hours
        } else if (input == 3) {
            // Check work hours
        } else if (input == 4) {
            startPage();
        } else {
            System.out.println("Please enter a valid number");
            workHoursPage();
        }
    }

    private static void printStartPage() {
        System.out.println("SOFTWAREHUSET A/S");
        System.out.println("  1) Projects");
        System.out.println("  2) Activities");
        System.out.println("  3) Employees");
        System.out.println("  4) Work Hours");
    }

    private static void printProjectPage() {
        System.out.println("PROJECTS");
        System.out.println("  1) Create project");
        System.out.println("  2) Get project ID");
        System.out.println("  3) Assign or change Project Leader");
        System.out.println("  4) Add activity to project");
        System.out.println("  5) Add employees");
        System.out.println("  6) Get employee list");
        System.out.println("  7) Get project overview");
        System.out.println("  8) Go back");
    }

    private static void printActivityPage() {
        System.out.println("ACTIVITIES");
        System.out.println("  1) Create Activity");
        System.out.println("  2) Add employees");
        System.out.println("  3) Edit Activity");
        System.out.println("  4) Get project activity list");
        System.out.println("  5) Go back");
    }

    private static void printEmployeePage() {
        System.out.println("EMPLOYEES");
        System.out.println("  1) Create employee");
        System.out.println("  2) Find available employees");
        System.out.println("  3) Is x employee available");
        System.out.println("  4) Request help from colleague");
        System.out.println("  5) Go back");
    }

    private static void printWorkHoursPage() {
        System.out.println("WORK HOURS");
        System.out.println("  1) Register work hours");
        System.out.println("  2) Edit work hours");
        System.out.println("  3) Check work hours");
        System.out.println("  4) Go back");
    }
}
