interface MaxFinder{
    int findMax(int a, int b );
}

class Main {
    public static void main(String[] args) {

        MaxFinder maxVal = (a,b) -> Math.max(a,b);

        System.out.println(maxVal.findMax(10,20));
    }
}
