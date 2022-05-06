import java.util.Calendar;
import java.util.GregorianCalendar;


public class ProgramController {
    private int sequenceNumber= 0;

    private static final ProgramController instance = new ProgramController();

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void updateSeqNumber() {
        this.sequenceNumber += 1;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public static ProgramController getInstance() {
        return instance;
    }
}
