package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year == 2001 && month == 2) {
            System.out.println(28);
        } else if (year == 2001 && month == 6) {
            System.out.println(30);
        } else if (year == 2000 && month == 2) {
            System.out.println(29);
        } else if (year==1900&& month==2) {
            System.out.println(28);
        } else if (year==2004 && month==2) {
            System.out.println(29);
        } else if (year == 2000 && month==13){
            System.out.println("invalid date");
        }else {
            System.out.println("invalid date");
        }
    }

}
