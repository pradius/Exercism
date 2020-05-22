class RaindropConverter {

    String convert(int number) {
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
        if (output.toString().isEmpty()) {
            return Integer.toString(number);
        }
        return output.toString();
    }

}
