class Main{
    public static void main(String[] args){

        for(int i = 10; i > 0; i -= 5){
            System.out.println("* " + i );
        }

        boolean test = false;

        while(test){
            System.out.println("* ");
        }

        do{
            System.out.println("* ");
        }while(test);

    }
}