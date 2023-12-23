package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber==2){
            System.out.println("Winter");
        } else if (monthNumber==12) {
            System.out.println("Winter");
        }else if (monthNumber==6){
            System.out.println("Summer");
        } else if (monthNumber==0) {
            System.out.println("Wrong month number");
        }
    }
}
