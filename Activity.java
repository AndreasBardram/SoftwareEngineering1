public class Activity {

    private String name;
    private int startWeek;
    private int endWeek;
    private int expectedAmountOfHours;
    private boolean unavailability;

    public Activity (String name, int startWeek, int endWeek, int expectedAmountOfHours) {
        this.name = name;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.expectedAmountOfHours = expectedAmountOfHours;
    }

    public Activity (String name, int startWeek, int endWeek, int expectedAmountOfHours, boolean unavailability) {
        this.name = name;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.expectedAmountOfHours = expectedAmountOfHours;
        this.unavailability = unavailability;
    }




    public String toString() {
        return name;
    }


















    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartWeek() {
    return startWeek;
    }

    public void setStartWeek(int startWeek) {
        this.startWeek = startWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
    }

    public int getExpectedAmountOfHours() {
        return expectedAmountOfHours;
    }

    public void setExpectedAmountOfHours(int expectedAmountOfHours) {
        this.expectedAmountOfHours = expectedAmountOfHours;
    }
}
