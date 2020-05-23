import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    public static String translate(String word) {
        word.toLowerCase();
        String delimiter = " ";
        String[] words = word.split(delimiter);
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        var phrase = new StringBuilder();
        var pos = 0;

        for (var s : words) {
            var str = new StringBuffer(s);

            if (vowels.contains(s.charAt(0)) || s.substring(0, 2).equals("xr") || s.substring(0, 2).equals("yt")) {
                phrase.append(s.concat("ay"));
            } else if (s.charAt(1) == 'y' || s.charAt(2) == 'y') {
                if (s.length() == 2) {
                    str.deleteCharAt(s.indexOf('y'));
                    str.insert(0, 'y');
                    str.append("ay");
                }else {
                    str.delete(0, s.indexOf('y') + 1);
                    str.insert(0, 'y');
                    str.append(s.substring(0, s.indexOf('y')) + "ay");
                }
                phrase.append(str.toString());

            } else if (s.contains("qu")) {
                str.delete(0, s.indexOf("qu") + 2);
                str.append(s.substring(0, s.indexOf("qu") + 2));
                str.append("ay");
                phrase.append(str.toString());

            } else {
                int index = 0;
                for (var letter : s.toCharArray()) {
                    if (vowels.contains(letter)) {
                        break;
                    }
                    index++;
                }
                str.delete(0, index);
                str.append(s.substring(0, index));
                str.append("ay");
                phrase.append(str.toString());
            }
            pos++;
            if (words.length > 1 && words.length != pos ){phrase.append(" ");}

        }
        return phrase.toString();
    }
}
