class RaindropConverter {

    String convert(int number) {
        if ((number % 3) != 0 && (number % 5) != 0 && (number % 7) != 0) {
            return Integer.toString(number);
        }
        var output = new StringBuilder();

        if ((number % 3) == 0) {
            output.append("Pling");
        }
        if ((number % 5) == 0) {
            output.append("Plang");
        }
        if ((number % 7) == 0) {
            output.append("Plong");
        }
        return output.toString();
    }

}
