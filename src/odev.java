import java.util.HashMap;

public class odev {


    //Create a method name is map1()
//        parameters are one Integer -String map and one integer
//        return type is String
//        return the value of the integer
//        Example:
//        Map is
//        1 ,  "Lion"
//        2 ,  "Tiger"
//        3 ,  "Elephant"
//        4 ,  "Cat"
//        5  , "Dog"
//        Integer 3
//        Result should be Elephant

    public static String map1(HashMap<Integer, String> list, int x){

        return list.get(x);



    }
}
