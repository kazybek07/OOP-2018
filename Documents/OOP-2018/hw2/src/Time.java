class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toStandard(){
        int h = hour;
        String mins = "", secs = "", hours = "", half = " AM";
        if (minute < 10) mins = "0" + minute;
        else mins = "" + minute;
        if (second < 10) secs = "0" + second;
        else secs = "" + second;
        if (hour > 12) {
            half = " PM";
            h = hour - 12;
        }
        if (hour < 10) hours = "0" + h;
        else hours = "" + h;
        return hours + ":" + mins + ":" + secs + half;
    }
    public String toUniversal(){
        String mins = "", secs = "", hours = "";
        if (minute < 10) mins = "0" + minute;
        else mins = "" + minute;
        if (second < 10) secs = "0" + second;
        else secs = "" + second;
        if (hour < 10) hours = "0" + hour;
        else hours = "" + hour;
        return hours + ":" + mins + ":" + secs;
    }
    public Time add(Time t){
        int t_hour = hour + t.hour;
        int t_minute = minute + t.minute;
        int t_second = second + t.second;
        if (t_second >= 60) t_minute++;
        if (t_minute >= 60) t_hour++;
        if (t_hour >= 24) t_hour -= 24;
        Time t1 = new Time(t_hour, t_minute, t_second);
        return t1;
    }

}
 class Main {

    public static void main(String[] args) {

        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

    }
}