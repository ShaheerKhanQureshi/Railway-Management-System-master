package railway.management;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class TrainSchedule {

    Calendar cal = new GregorianCalendar();
    int m, s, h;
    String month[] = {"JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC"};

    String weekDay[] = {"Mon", "Tues", "Thurs", "Wed", "Fri", "Sat", "Sun"};

    String time[] = {"11:20 AM", "12:15 PM", " 1:10 PM", " 2:30 PM", " 3:10 PM", " 4:05 PM", " 5:00 PM", " 7:45 PM", "11:30 PM",
        " 1:20 AM"};

    public void showSchedule() {
        h = 11;
        m = 20;
        System.out.println("------------------------------");
        System.out.println("TODAYS SCHEDULE For ARRIVAL");
        System.out.println("------------------------------\n\n\n\n");
        for (int i = 0; i < time.length; i++) {
            System.out.print(month[cal.get(Calendar.MONTH)] + " "
                    + weekDay[cal.get(Calendar.DAY_OF_WEEK)] + " "
                    + cal.get(Calendar.DAY_OF_MONTH) + " ");
            System.out.println(time[i]);
            System.out.println("------------------------------");

            System.out.println("\n");
        }
    }

    public void Departure() {
        int m, s, h;
        String month[] = {"JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String weekDay[] = {"Mon", "Tues", "Thurs", "Wed", "Fri", "Sat", "Sun"};
        String time[] = {"11:50 AM", "12:45 PM", " 1:40 PM", " 3:00 PM", " 3:40 PM", " 4:35 PM", " 5:30 PM", " 8:15 PM",
            "12:00 PM", " 1:50 AM"};
        h = 11;
        m = 20;
        System.out.println("------------------------------");
        System.out.println("TODAYS SCHEDULE For Departure!");
        System.out.println("------------------------------\n\n\n\n");
        for (int i = 0; i < time.length; i++) {
            System.out.print(month[cal.get(Calendar.MONTH)] + " "
                    + weekDay[cal.get(Calendar.DAY_OF_WEEK)] + " "
                    + cal.get(Calendar.DAY_OF_MONTH) + " ");
            System.out.println(time[i]);
            System.out.println("------------------------------");
            System.out.println();
        }

    }

}
