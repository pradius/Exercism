public class Hamming {
    String leftStrand;
    String rightStrand;
    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        String msg = leftStrand.isEmpty() ? "left strand " : "right strand ";
        if(leftStrand.isEmpty() ^ rightStrand.isEmpty()){
            msg += "must not be empty.";
            throw new IllegalArgumentException(msg);
        }

        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        if (leftStrand.equals(rightStrand)){return 0;}
        int distance = 0;
        for(int i = 0; i <leftStrand.length(); i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) distance++;
        }
        return distance;
    }
}
