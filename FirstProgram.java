import java.util.*;


class FirstProgram{

public static void main(String[] args) {
Map mp = new HashMap<String,Integer>();
    mp.put("Aahul",new Integer(1));
        mp.put("Sam",new Integer(2));
    mp.put("Rahuls",new Integer(3));
    mp.put("zako",new Integer(4));


  List ls =   mp.keySet().stream().map(e -> mp.get(e)).forEach(e -> System.out.println(e+" 0----> "+mp.get(e)));

System.out.println("here in main --->  --"+ls.get(0));


}

// find square of number


}

// find square of number: