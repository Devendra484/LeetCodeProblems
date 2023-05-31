public class FirstOccurrenceOfString {
    public static void main(String[] args) {
        String s1="dspdbutsid";
        String  s2="sad";
        int i=m1(s1,s2);
        System.out.println(i);
    }
    public static int m1(String s1,String s2){
        return  s1.indexOf(s2);
    }
}
