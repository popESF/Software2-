import java.util.ArrayList;

public class TextUtils {

    public static String[] split(String text) {
        ArrayList<String> tokens = new ArrayList<String>();
        String word = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                if (!word.isEmpty()){
                    tokens.add(word);
                    word = "";
                }
            } else {
                word += text.charAt(i);
            }
        }
        if (!word.isEmpty()){
            tokens.add(word);
        }
        String[] output = new String[tokens.size()];
        output = tokens.toArray(output);
        return output;
    }

    public static String[] split(String text, String separator) {
        ArrayList<String> tokens = new ArrayList<String>();
        String word = "";
        for(int i = 0; i < text.length(); i++){
            if(separator.indexOf(text.charAt(i)) >= 0){
                if (!word.isEmpty()){
                    tokens.add(word);
                    word = "";
                }
            } else {
                word += text.charAt(i);
            }
        }
        if (!word.isEmpty()){
            tokens.add(word);
        }
        String[] output = new String[tokens.size()];
        output = tokens.toArray(output);
        return output;
    }


    public static void main(String[] args) {
        String text = "For this week practical, you should create a Java project (see last week introduction to VS Code), and write all your classes in the src folder.";
        String[] tokens = TextUtils.split(text);
        for(String word: tokens){
            System.out.println(word);
        }
        
        System.out.println("-----------------------------");
        tokens = TextUtils.split(text, ".,().");
        for(String word: tokens){
            System.out.println(word);
        }
    }
}
