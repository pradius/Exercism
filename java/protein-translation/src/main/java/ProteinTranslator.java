import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {
    HashMap<String, String> proteins;

    public ProteinTranslator(){
        proteins = new HashMap<>();

        proteins.put("AUG", "Methionine");
        proteins.put("UUU", "Phenylalanine");
        proteins.put("UUC", "Phenylalanine");
        proteins.put("UUA", "Leucine");
        proteins.put("UUG", "Leucine");
        proteins.put("UCU", "Serine");
        proteins.put("UCC", "Serine");
        proteins.put("UCA", "Serine");
        proteins.put("UCG", "Serine");
        proteins.put("UAU", "Tyrosine");
        proteins.put("UAC", "Tyrosine");
        proteins.put("UGU", "Cysteine");
        proteins.put("UGC", "Cysteine");
        proteins.put("UGG", "Tryptophan");
        proteins.put("UAA", "STOP");
        proteins.put("UAG", "STOP");
        proteins.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        StringBuilder sequence = new StringBuilder(rnaSequence);
        List<String> translations = new ArrayList<>();

        while(sequence.length() > 0){
            if(proteins.get(sequence.substring(0, 3)).equals("STOP")){
                break;
            }
            translations.add(proteins.get(sequence.substring(0, 3)));
            sequence.delete(0,3);
        }
        return translations;
    }


}
