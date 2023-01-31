public class Reto0{
    public static void main(String []argas){
        int i;
        for(i=1; i<101;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}