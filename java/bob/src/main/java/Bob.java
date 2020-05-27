
class Bob {

    public String hey(String s) {
        s = s.trim();
        if(s.isBlank()){
            return "Fine. Be that way!";
        }
        if (!containsLowerCaseLetters(s) && containsUpperCaseLetters(s)) {
            return s.endsWith("?") ? "Calm down, I know what I'm doing!" : "Whoa, chill out!" ;
        }
        else {
            return s.endsWith("?") ? "Sure." : "Whatever.";
        }
    }

    private boolean containsLowerCaseLetters(String s){
        for(char letter : s.toCharArray()){
            if (letter > 96 && letter < 123) {
                return true;
            }
        }
        return false;
    }

    private boolean containsUpperCaseLetters(String s){
        for(char letter : s.toCharArray()){
            if (letter > 64 && letter < 91) {
                return true;
            }
        }
        return false;
    }

}