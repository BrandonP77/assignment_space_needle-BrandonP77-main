public class AssignedAsciiArt {
    //
    public static void main(String[] args){
       // Space needle antnenna
        for(int i = 1; i <= 3; i++){
            System.out.println("               ||");
        }

       // Top-half of platform
        System.out.println("            __/||\\__");
        for(int j = 1; j <= 2; j++){
            for(int k = 3; k >= j; k--){
                System.out.print("   ");
            }
       // Left side of platform   
            System.out.print("__/");
            for(int l = 1; l <= j; l++){
                System.out.print(":::");
            }
       // Center of platform    
            System.out.print("||");
            for(int l = 1; l <= j; l++){
                System.out.print(":::");
            }
       // Right side of platform    
            System.out.print("\\__");
            System.out.println();
        }

       // Middle section of platform
        System.out.println("      |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");

       // Bottom-half of platform
        for(int m = 1; m <= 3; m++){
            System.out.print("    ");
            for(int n = 1; n <= m; n++){
                System.out.print("  ");
            }
            System.out.print("\\_");
            for(int o = 3; o <= 4; o++){
                for(int p = 4; p >= m; p--){
                    System.out.print("/");
                    System.out.print("\\");
                }
            }
            System.out.print("_/");
            System.out.println();
        }
       
       // Elevator Shaft Top
        for(int i = 1; i <= 3; i++){
         System.out.println("               ||");
        }

       // Elevator Shaft Lift
        for(int q = 1; q <= 9; q++){
            System.out.print("             ");
            for(int r = 1; r <= 2; r++){
                System.out.print("|%|");
            }
            System.out.println();
        } 

        // Top-half of base
            System.out.println("            __/||\\__");
               for(int j = 1; j <= 2; j++){
                   for(int k = 3; k >= j; k--){
                       System.out.print("   ");
                   }
        // Left Side of Base    
            System.out.print("__/");
                for(int l = 1; l <= j; l++){
                    System.out.print(":::");
                }
        // Center of Base    
            System.out.print("||");
                for(int l = 1; l <= j; l++){
                    System.out.print(":::");
                }
        // Right Side of Base    
            System.out.print("\\__");
            System.out.println();
               }
       
        // Bottom Part of Base
            System.out.println("      |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
    }
}
