interface Calculator{
    int calculate(int a , int b );
}

class Main {
    public static void main(String[] args) {
         Calculator cal = (a, b) -> a+b;
        int result = cal.calculate(10,20);
        System.out.println(result);
    }
}
