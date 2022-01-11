package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;
    private int firstHour;
    private int lastHour;
    private int everyMinute;

    public BusTimeTable(List<SimpleTime> timeTable){
        this.timeTable=timeTable;
        for (int i = 0; i <timeTable.size() ; i++) {
            this.firstHour=timeTable.get(0).getHours();
            this.lastHour=timeTable.get(timeTable.size()-1).getHours();
            this.everyMinute=timeTable.get(0).getMinutes();
        }
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        this.firstHour=firstHour;
        this.lastHour=lastHour;
        this.everyMinute=everyMinute;

        List<SimpleTime> timeTable2=new ArrayList<>();
        for (int i = firstHour; i <=lastHour ; i++) {
            timeTable2.add(new SimpleTime(i,everyMinute));
        }
        this.timeTable=timeTable2;
    }

    public List<SimpleTime> getTimeTable(){
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual){
        if(actual.getMinutes()<everyMinute&&actual.getHours()<=lastHour&&actual.getHours()>=firstHour){
            return new SimpleTime(actual.getHours(),everyMinute);
        }else if(actual.getMinutes()>=everyMinute&&actual.getHours()<lastHour&&actual.getHours()>=firstHour){
            return new SimpleTime(actual.getHours()+1,everyMinute);
        }else{
            throw new IllegalStateException("No more buses today!");
        }
    }

    public static void main(String[] args) {
        BusTimeTable busTimeTable=new BusTimeTable(6,23,35);
        System.out.println( busTimeTable.getNextBus(new SimpleTime(16,5)));
        System.out.println( busTimeTable.getNextBus(new SimpleTime(16,45)));
        System.out.println( busTimeTable.getNextBus(new SimpleTime(23,15)));
        System.out.println( busTimeTable.getNextBus(new SimpleTime(6,15)));
        System.out.println( busTimeTable.getNextBus(new SimpleTime(6,35)));

    }
}
