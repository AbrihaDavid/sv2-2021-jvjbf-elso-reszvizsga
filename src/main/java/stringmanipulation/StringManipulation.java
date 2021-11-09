package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s){
        String evenCharacters = "";
        for (int i = 0; i<s.length(); i++){
            if (i%2 == 0){
                evenCharacters = evenCharacters + s.charAt(i);
            }
        }
        return evenCharacters;
    }
}
