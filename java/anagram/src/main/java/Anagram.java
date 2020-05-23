
import java.util.*;
import java.util.List;

class Anagram {

    private List<Character> sortedWord;
    private String word;

    public Anagram(String word) {
        this.word = word.toLowerCase();
        sortedWord = new ArrayList<>();
        for (var letter : word.toLowerCase().toCharArray()) {
            sortedWord.add(letter);
        }
        Collections.sort(sortedWord);
    }

    public List<String> match(List<String> words) {
        List<String> output = new ArrayList<>();

        for (var w : words) {
            if (w.toLowerCase().equals(word)) {
                continue;
            } else {
                var wx = w;
                List<Character> matcher = new ArrayList<>();
                for (var x : wx.toLowerCase().toCharArray()) {
                    matcher.add(x);
                }
                Collections.sort(matcher);
                if (matcher.equals(sortedWord)) {
                    output.add(w);
                }
            }
        }
        return output;
    }
}