package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHashMapEx {

    public static String getRandomString(int length){

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();

    }

    public static Map<String, String> modifyMap(Map<Integer, Map<String,String>> mainMap){

        return mainMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

    }

    public static void main(String[] args) {

        Map<Integer, Map<String, String>> mainMap;

        mainMap = new HashMap<>();

        int i, j;

        System.out.println("\nInput : \n");

        for (i = 1; i <= 5; i++) {

            HashMap<String , String> stringHashMap = new HashMap<>();

            for (j = 1; j <= 3; j++) {

                stringHashMap.put(getRandomString(3),getRandomString(3));

            }

            mainMap.put(i,stringHashMap);

        }

        for (Map.Entry<Integer, Map<String, String >> entry : mainMap.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        System.out.println("\nOutput : \n");

//        System.out.println(modifyMap(mainMap));

        HashMap<String , String > outputMap = (HashMap<String, String>) modifyMap(mainMap);

        for (Map.Entry<String, String> entry : outputMap.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }





    }



}
