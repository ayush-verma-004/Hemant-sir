import java.util.*;

public class Apr23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        int glo_count = 0;
        while(t!=0){
            int n = sc.nextInt();
            String str = sc.nextLine();
            for(int i=0; i<t; i++){
                int len = sc.nextInt();
                String s = sc.nextLine();
                int count = 0;
                for(int j=0; j<Math.min(str.length(), s.length()); j++){
                    if(str.charAt(j) == s.charAt(j)){ 
                        count++;
                    }
                }
            }
            t--;
        }
        sc.close();
    }
}