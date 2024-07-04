package Backtrackings;

public class permutations {
    static int count=0;
    static void printPerm(String str,String perm,int index){
       
        if(str.length()==0){
            System.out.println(perm);
            count++;
            return;
        }
       
        for (int i = 0; i < str.length(); i++) {
            char currchar=str.charAt(i);
            String newString=str.substring(0,i)+str.substring( i+1);
            printPerm(newString, perm+currchar, index+1);
            
        }
    }
    public static void main(String[] args) {
        String str="1234";
        printPerm(str, "", 0);
        System.out.println("total permutations :"+count);
    }
}
