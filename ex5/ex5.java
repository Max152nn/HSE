package ex5;

public class ex5 {
    public static void main(String[] args) {
        camelCase();
    }
    public static void camelCase(){
        String s = "ILoveJavaProgramming";
        for (int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                System.out.println();
                System.out.print(s.charAt(i));
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}


