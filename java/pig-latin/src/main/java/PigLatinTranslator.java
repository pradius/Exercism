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

            if (vowels.contains(s.charAt(0)) || s.startsWith("xr") || s.startsWith("yt")) {
                phrase.append(s.concat("ay"));
            } else if (s.charAt(1) == 'y' || s.charAt(2) == 'y') {
                if (s.length() == 2) {
                    str.deleteCharAt(s.indexOf('y')).insert(0, 'y').append("ay");
                }else {
                    str.delete(0, s.indexOf('y') + 1).insert(0, 'y').append(s.substring(0, s.indexOf('y')) + "ay");
                }
                phrase.append(str);

            } else if (s.contains("qu")) {
                str.delete(0, s.indexOf("qu") + 2).append(s.substring(0, s.indexOf("qu") + 2) + "ay");
                phrase.append(str);

            } else {
                int index = 0;
                for (var letter : s.toCharArray()) {
                    if (vowels.contains(letter)) {
                        break;
                    }
                    index++;
                }
                str.delete(0, index).append(s.substring(0, index) + "ay");
                phrase.append(str);
            }
            pos++;
            if (words.length > 1 && words.length != pos ){phrase.append(" ");}
        }
        return phrase.toString();
    }
}
