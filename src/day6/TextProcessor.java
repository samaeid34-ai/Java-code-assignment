package day6;

public class TextProcessor {
    public static void main(String[] args) {
//        countAndPrintWords("I Love Route Academy");
//        reverseText("Ahmed");
//        addSpaces("ILoveRouteAcademy");
//        String name1 = "     Ahmed";
//        String name2 = name1.trim();
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name1.trim());
//        System.out.println(name1);
//        name1 = "Mohamed";
//        System.out.println(name1);

        String s1 = "Ahmed";
        String s2 = "Ahmed";
        String s3 = new String("Ahmed");
        String s4 = new String("Ahmed");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2);        //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1==s3);        //false
        System.out.println(s3.equals(s4)); //true
        System.out.println(s3==s4);        //false
    }

    public static void countAndPrintWords(String text){
        String [] words=text.split(" ");
//        System.out.println("Your text contains "+words.length+" words");
        System.out.println(String.format("Your Text Contains %d words",words.length));
        for (String word:words){

        }
    }
    public static void reverseText(String text){
        String reversed = "";
        for(int i=text.length()-1;i>=0;i--){
            reversed = reversed+text.charAt(i);
        }
        System.out.println(reversed);
    }
    public static void addSpaces(String text){
        StringBuilder modifiedText = new StringBuilder(text);
        System.out.println(modifiedText);
        for(int i=1;i<modifiedText.length();i++){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
