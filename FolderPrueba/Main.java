public class Main {

    public static void main(String[] agrs){
        pacman();
    }

    public static void pacman(){

        for (int i = 0; i <= 10000; i++) {
            System.out.print(":v ");    
            if (i%50==0) {
                System.out.println();
            }        
        }

    }

}
