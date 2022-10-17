public class FreeFormAsciiArt {
    /* Brandon Philipp
     * BIT 142
     * Fall Quarter 2022
     * A1.0
     */
    public static void main(String[] args){
      // Sail  
        for(int i = 1; i <= 7; i++){
            System.out.print("           |");
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
      // Sailboat bottom  
        System.out.println("__________________________");
        System.out.println("\\________________________/");
      // Water and text  
        System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
        System.out.println("     Sailboat On The Water");
        System.out.println("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
    }
}
