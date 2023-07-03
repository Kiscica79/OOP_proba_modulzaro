package text;

import java.util.List;

public class Text {

    public static List<String> textList(String text) {
        if (text.length() < 25) {
            return textList(text);
        } else {
            return textList(text.substring(0, 20).concat("..."));
        }

    }
}
