public class AssignedAsciiArt {
    public static void main(String[] args){
        for(int i = 1; i <= 3; i++){
            System.out.println("               ||");
        }
        System.out.println("            __/||\\__");
        for(int j = 1; j <= 3; j++){
            // come back to this loop when you get back
            for(int k = 3; k >= j; k--){
                System.out.print("   ");
            }
            System.out.print("__/");
            for(int l = 1; l <= j; l++){
                System.out.print(":::");
            }
            System.out.print("||");
            for(int l = 1; l <= j; l++){
                System.out.print(":::");
            }
            System.out.print("\\__");
            System.out.println();
        }
        System.out.println("   |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
    }
}
