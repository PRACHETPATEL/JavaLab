public class Time {
    int hour,minute,second;
    Time(int x,int y,int z){
        this.hour=x;
        this.minute=y;
        this.second=z;
    }
    public static void main(String[] args) {
        Time a=new Time(10,25,33);
        Time b=new Time(9,12,59);
        System.out.println("Time one: "+a.hour+" Hours "+a.minute+" Minutes "+a.second+" Seconds");
        System.out.println("Time two: "+b.hour+" Hours "+b.minute+" Minutes "+b.second+" Seconds");
        time_sum(a,b);
    }
    static void time_sum(Time X,Time Y){
        int h=0,m=0,s=0;
        if((X.second+Y.second)>60){
            s=X.second+Y.second-60;
            m+=1;
        }
        else
        s=X.second+Y.second;
        if((X.minute+Y.minute+m)>60){
            m+=X.minute+Y.minute-60;
            h+=1;
        }
        else
        m+=X.minute+Y.minute;
        if((X.hour+Y.hour+h)>12){
            h+=X.hour+Y.hour-12;
        }
        else
        h+=X.minute+Y.minute;
        System.out.println("Time sum: "+h+" Hours "+m+" Minutes "+s+" Seconds");
    }
}
