package hello;

public class MultiplesOf3or5 {
    public static int solution(int number){
       int sum = 0;
       for(int i = 0; i < number; i++){
           if(i % 3 == 0 || i % 5 == 0){
               sum = sum + i;
           }
       }
       System.out.println(sum);
       return sum;
   }
}