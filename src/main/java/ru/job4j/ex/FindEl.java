package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args){
        String [] array = {"1", "2", "3", "4", "5"};
        try {
            indexOf(array, "8");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int indexOf(String[] value, String key) throws ElementNotFoundException{
        int rsl = -1;
        /* for-each */
        for(int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element wasn't founded");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        // if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}