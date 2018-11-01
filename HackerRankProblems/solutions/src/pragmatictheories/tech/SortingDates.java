package pragmatictheories.tech;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingDates {



    public static void main(String args[]){

         System.out.println("Test "+sortDates(Stream.of("01 Dec 2018","13 Mar 2018","03 Jan 1985","04 Jan 1993","05 Jul 1993","06 Jun 2014").collect(Collectors.toList())));
    }


    public static List<String> sortDates(List<String> dates) {

        // worong !
        return sort(3,6,sort(7,11,dates));

    }

    private static List<String> sort(int startIndx, int endIndx,List<String> dates){

        HashMap<String, Integer> datesBeingSorted = new HashMap<>();
        for (int i =0;i<dates.size();i++)
            if((startIndx==3) &&(endIndx==6))
                datesBeingSorted.put(dates.get(i),getMonth((dates.get(i).substring(startIndx,endIndx))));
            else
                datesBeingSorted.put(dates.get(i),Integer.parseInt(dates.get(i).substring(startIndx,endIndx)));


        Map<String, Integer> sortedDates =
                datesBeingSorted.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        //Map<Integer, String> sortedDates = new TreeMap<>(datesBeingSorted); // no duplicates in treemaps !
        return new ArrayList(sortedDates.keySet());
    }

    private static int getMonth(String m){

        HashMap<String,Integer> months = new HashMap<>();
        List<String> monthsStrings=  Arrays.asList("Jan", "Feb", "Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
        List<Integer> monthsInts=  Arrays.asList(01, 02, 03,04,05,06,07,00,00,10,11,12);
        for (int i =0;i<monthsStrings.size();i++)
            months.put(monthsStrings.get(i),monthsInts.get(i));

        return months.get(m);
    }

}
