import java.util.HashSet;
import java.util.Set;


class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set bucket = new HashSet();

        for (var letter : phrase.toLowerCase().toCharArray()){
            if (letter == ' ' || letter == '-'){
                continue;
            }
            else if (bucket.contains(letter)){
                return false;
            }
            else{
                bucket.add(letter);
            }
        }
        return true;
    }

}
