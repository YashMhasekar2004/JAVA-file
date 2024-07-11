public class invertedpyrapattern {
    public static void main(String args[]){
        for(int line=1;line<=4;line++){
            for(int i=4;i>=line;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
