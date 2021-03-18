package ex4;

import ex6.ex6;

public class ex4 {
    public static void main(String[] args) {
        stroka();
    }

    public static void stroka(){
        String s1 = "abceee";
        String s2 = "vvvbbb";
        String s3 = "";

        for(int i=0;i<s1.length();i++){
            s3 = s3 + s1.charAt(i);
            if(i==(s1.length()/2)-1){
                s3 = s3 + s2;
            }
        }
        System.out.println(s3);
    }
}
