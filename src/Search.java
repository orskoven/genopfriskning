public class Search {


    static int searchArrayString(String[] strings, String string) throws Exception {
                int index = 0;
                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].equals(string)) {
                        index = i;
                        i = strings.length;
                    } else {
                        index = -1;
                    }

                }
                if (index <0){
                        throw new Exception("Error!/Fejl!");
                }

        return index;
    }

    public static void main(String[] args) throws Exception {
        String[] strings = {"hej","er","vejret","godt","abe"};
        System.out.println(searchArrayString(strings, "vejret"));
    }
}
