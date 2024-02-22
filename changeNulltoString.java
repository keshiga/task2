import static sun.util.locale.LocaleUtils.isEmpty;

public class changeNulltoString {
    private static String argument;
    public boolean changeNulltoString(){
        isEmpty(argument);
        return false;
    }
     public void main(String[] args) {
        if(changeNulltoString() == false){
            argument = "empty";
            System.out.println(argument);
    } } }

