public class Counter {
    public static Long counterJAsh = 0L;
    public static Long counterChon = 0L;
    public static Long counterKoshboilu = 0L;
    public static Long counterSrochna = 0L;
    public static Long generatorJash(){return ++counterJAsh;}
    public static Long generatorChon(){return ++counterChon;}
    public static Long generatorKoshboiluu(){return ++counterKoshboilu;}
    public static Long generatorSrochna(){return ++counterSrochna;}

}
