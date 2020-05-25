class TwelveDays {
    String start;
    String[] endings;
    String[] ordinal;

    TwelveDays() {
        start = "day of Christmas my true love gave to me: ";
        endings = new String[]{
                "a Partridge in a Pear Tree.",
                "two Turtle Doves, and ",
                "three French Hens, ",
                "four Calling Birds, ",
                "five Gold Rings, ",
                "six Geese-a-Laying, ",
                "seven Swans-a-Swimming, ",
                "eight Maids-a-Milking, ",
                "nine Ladies Dancing, ",
                "ten Lords-a-Leaping, ",
                "eleven Pipers Piping, ",
                "twelve Drummers Drumming, "
        };
        ordinal = new String[]{
                "first ", "second ", "third ",
                "fourth ", "fifth ", "sixth ",
                "seventh ", "eighth ", "ninth ",
                "tenth ", "eleventh ", "twelfth "
        };

    }

    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder();
        verse.append("On the " + ordinal[verseNumber - 1] + start);
        for (var i = verseNumber - 1; i >= 0; i--) {
            verse.append(endings[i]);
        }
        verse.append("\n");
        return verse.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder();
        while(startVerse!= endVerse + 1){
            verses.append(verse(startVerse));
            if ((startVerse != endVerse)) {
                verses.append("\n");
            }
            startVerse++;
        }
        return verses.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
