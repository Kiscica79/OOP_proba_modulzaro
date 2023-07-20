package text;

import java.util.List;

public class Text {

    public void modifyStrings(List<String> texts) {
        for (int i = 0; i < texts.size(); i++) {
            String text = texts.get(i);
            if (text.length() > 25) {
                texts.set(i, text.substring(0, 20) + "...");
            }
        }
    }
}
