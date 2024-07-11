public class patterns {
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                //printing spaces (n-i number of spaces)
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //printing stars
                System.out.print("*");
            }

        
        System.out.println();
        }

    }
    public static void hollow_rectangle(int totrows,int totcolumns){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcolumns;j++){
                if(i==1 || i==totrows || j==1 || j==totcolumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(10);

    }
    
    
}
