class TestWide{
    public static void main(String[] args){
       int a = 'x';
       long  b = 34;
       float c = 1002;
       double d = 2343.4;

       System.out.println("int a : " + a);
       System.out.println("long b : " + b);
       System.out.println("float c : " + c);
       System.out.println("double d : " + d);
    }
}

class DataTypes{
    public static void main(String[] args){
       int x = 12, y = 33;
       double d = 2.25, e  = 4.54;

       System.out.println(x < y && d < e);
       System.out.println(!(x < y));

       boolean test = 'a' > 'z';
       System.out.println(test || d - 2.1 > 0);
    }
}
\