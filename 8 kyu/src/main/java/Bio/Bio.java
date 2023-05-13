package Bio;

class Bio {
    public String dnaToRna(String dna) {
        //DNA to RNA Conversion
        dna = dna.replace('T', 'U');
        return dna;  // Do your magic!
    }
}
