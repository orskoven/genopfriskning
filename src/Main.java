import java.util.ArrayList;

public class Main {

    static boolean doesArraylistContainString(ArrayList<String> stringArrayList, String inpoutString){
        boolean isStringPresent = false;
        for (int i = 0; i < stringArrayList.size() && !isStringPresent; i++) {
            if (!stringArrayList.get(i).equals(inpoutString)) {
                isStringPresent = false;
            } else {
                isStringPresent = true;
                System.out.println("The String has been found");
            }
        }
        return isStringPresent;
    }

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("kaffe");
        drinks.add("the");

        System.out.println(doesArraylistContainString(drinks,"kaffe"));
    }
}
