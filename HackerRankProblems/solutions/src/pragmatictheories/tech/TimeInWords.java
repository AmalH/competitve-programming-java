package pragmatictheories.tech;

import java.util.HashMap;

public class TimeInWords {

    // Complete the timeInWords function below.
    public static String timeInWords(int h, int m) {

        HashMap<Integer,String> stringValues = new HashMap<>();
        stringValues.put(1,"one");
        stringValues.put(2,"two");
        stringValues.put(3,"three");
        stringValues.put(4,"four") ;
        stringValues.put(5,"five");
        stringValues.put(6,"six");
        stringValues.put(7,"seven");
        stringValues.put(8,"eight");
        stringValues.put(9,"nine");
        stringValues.put(10,"ten");
        stringValues.put(11,"eleven") ;
        stringValues.put(12,"twelve");
        stringValues.put(13,"thirteen");
        stringValues.put(14,"fourteen");
        stringValues.put(16,"sixteen");
        stringValues.put(17,"seventeen");
        stringValues.put(18,"heighteen") ;
        stringValues.put(19,"nineteen");
        stringValues.put(20,"twenty");
        stringValues.put(21,"twenty one");
        stringValues.put(22,"twenty two");
        stringValues.put(23,"twenty three");
        stringValues.put(24,"twenty four");
        stringValues.put(25,"twenty five") ;
        stringValues.put(26,"twenty six");
        stringValues.put(27,"twenty seven");
        stringValues.put(28,"twenty height");
        stringValues.put(29,"twenty nine");
        stringValues.put(31,"thirty one");
        stringValues.put(32,"thirty two") ;
        stringValues.put(33,"thirty three");
        stringValues.put(34,"thirty four");
        stringValues.put(35,"thirty five");
        stringValues.put(36,"thirty six");
        stringValues.put(37,"thirty seven");
        stringValues.put(38,"thirty height") ;
        stringValues.put(40,"fourty");
        stringValues.put(39,"thirty nine");
        stringValues.put(40,"fourty") ;
        stringValues.put(41,"fourty one");
        stringValues.put(42,"fourty two");
        stringValues.put(43,"fourty three");
        stringValues.put(44,"fourty four") ;
        stringValues.put(45,"fourty five");
        stringValues.put(46,"fourty six");
        stringValues.put(47,"fourty seven") ;

        if(m>30){
            if(m==45)
                return "quarter to "+stringValues.get(h+1);
            else
                return stringValues.get(60-m)+" minutes to "+stringValues.get(h+1);
        }

        if(m<30){
            if(m==15)
                return "quarter past "+stringValues.get(h);
            if(m==0)
                return stringValues.get(h)+" o\' clock ";
            if(m==1)
                return "one minute past "+stringValues.get(h);
            else
                return stringValues.get(m)+" minutes past "+stringValues.get(h);
        }


        if(m==30)
            return "half past "+stringValues.get(h);
        return "";
    }

}
