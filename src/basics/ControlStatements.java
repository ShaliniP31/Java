package basics;

public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("Break");
        for(int i = 0; i< 10;i++){
            if(i==5)
                break;
            System.out.println("i is "+ i);
        }

        System.out.println("\n\nContinue");
        for(int i = 0; i< 10;i++){
            if(i==5)
                continue;
            System.out.println("i is "+ i);
        }
    }
}
