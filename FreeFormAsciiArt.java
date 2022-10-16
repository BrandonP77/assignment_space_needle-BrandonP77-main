public class FreeFormAsciiArt {
    public static void main(String[] args){
        for(int i = 1; i <= 7; i++){
            System.out.print("           |");
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("__________________________");
        System.out.println("\\________________________/");
        System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
        System.out.println("     Sailboat On The Water");
        System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
    }
}
