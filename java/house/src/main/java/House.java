class House {
    String firstPart, lastPart;
    String[] verses;

    public House() {
        firstPart = "This is the ";
        lastPart = "house that Jack built.";
        populateVerses();
    }

    public String verse(int verse) {
        if (verse == 1){return firstPart + lastPart;}
        String str = "";
        verse = verse - 2;
        str += firstPart;
        for(int i = verse; i >= 0; i--){
            str += verses[i];
        }
        str += lastPart;
        return str;
    }

    public String verses(int start, int end){
        String str = "";
        for(int i = start; i <= end; i++){
            str += verse(i) + (i == end ? "" :"\n");
        }
        return str;
    }
    public String sing(){
        return verses(1, 12);
    }

    void populateVerses() {
        verses = new String[]{
                "malt " +
                        "that lay in the ",
                "rat " +
                        "that ate the ",
                "cat " +
                        "that killed the ",
                "dog " +
                        "that worried the ",
                "cow with the crumpled horn " +
                        "that tossed the ",
                "maiden all forlorn " +
                        "that milked the ",
                "man all tattered and torn " +
                        "that kissed the ",
                "priest all shaven and shorn " +
                        "that married the ",
                "rooster that crowed in the morn " +
                        "that woke the ",
                "farmer sowing his corn " +
                        "that kept the ",
                "horse and the hound and the horn " +
                        "that belonged to the ",

        };
    }
}
