package test;

import java.util.logging.Logger;

/**
 * Created by sorenpedersen on 21/09/2016.
 */
public class Base26 {
    Logger LOGGER = Logger.getLogger(Base26.class.getName());

    String alphabet = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
    String base26   = "0123456789abcdefghijklmnop";

    public String toString(int column){
        LOGGER.info("column: " + column);

        if (column<=0){
            throw new IllegalArgumentException("values less than 1 are not allowed");
        }
        if(column<27){
            return new Character(alphabet.charAt(column-1)).toString();
        }

        String columnInBase26 = Integer.toString(column, 26);
        LOGGER.info("columnInBase26: " + columnInBase26);

        String columnInAlphabetBase26 = toAlphabetBase26(columnInBase26);
        LOGGER.info("columnInAlphabetBase26: " + columnInAlphabetBase26);

        return columnInAlphabetBase26;
    }

    public String toAlphabetBase26(String columnInBase26) {
        StringBuilder result = new StringBuilder();
        for(int c = 0; c < columnInBase26.length(); c++){
            int index = base26.indexOf(columnInBase26.charAt(c));
            result.append(alphabet.charAt(index-1));
        }
        return result.toString();
    }

}
