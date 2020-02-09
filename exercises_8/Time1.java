package exercises_8;

public class Time1 {

    private int hour;
    private int minute;
    private int second;

    public void seTime(int hour, int minute, int second){

        //validate hour,minute,second
        if(hour<0 || hour>=24 || minute <0 || minute >= 60 || second < 0 || second >= 60){

            throw new IllegalArgumentException("hour, minute,and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Convert to String in universal-time format (HH:MM:SS)
    public  String toUniversalString(){
        return String.format("%02d:%02d",  hour, minute, second);
    }

    //convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour<12 ? "AM" : "PM"));
    }
}