public class Main {

    public static void main(String[] agrs){
        pacman();
    }

    public static void pacman(){

        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            System.out.print(":v ");    
            if (i%50==0) {
                System.out.println();
            }        
        }

    }

}
