interface Printer{
    boolean check(int message);
}

class Main {
    public static void main(String[] args) {
      Printer print = checker -> checker%2 ==0;

        System.out.println(print.check(15));
    }
}
