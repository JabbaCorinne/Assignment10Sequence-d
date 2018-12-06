public class Main {

    public static void main(String[] args) {

        //Perfect squares
        //1 4 9 16 25 36 49 64 81 100
        int val = 0;
        System.out.print("Perfect squares: ");
        while (val < 10) {
            val++;
            int square = val * val;
            System.out.printf("%d ", square);
        }
        System.out.println();


        //Perfect cubes
        //1 8 27 64 125 216 343 512 729 1000
        val = 0;
        System.out.print("Perfect cubes: ");
        while (val < 10) {
            val++;
            int cube = val * val * val;
            System.out.printf("%d ", cube);
        }
        System.out.println();


        //Fibonacci sequence (WAY #1)
        //1 2 3 5 8 13 21 34 55 89
        System.out.print("Fibonacci: ");
        int a = 0;
        int b = 0;
        int fib = 1;
        do {
            a = b;
            b = fib;
            fib = a + b;
            System.out.printf("%d ", fib);
        } while (fib <= 55);
        System.out.println();

        //Fibonacci sequence (WAY #2) --just here for extra practice/studying--
        int prevVal = 1;
        int prevPrevVal = 0;
        int currVal;
        do {
            //Add the two numbers
            currVal = prevVal + prevPrevVal;
            //"Bump" up prevPrevVal to prevVal, and prevVal to currVal
            prevPrevVal = prevVal;
            prevVal = currVal;
            //Output
            //System.out.print(currVal+ " ");
        } while (currVal <= 55);


        //Prime numbers
        //2 3 5 7 11 13 17 19 23 29
        System.out.print("Prime numbers: ");
        val = 1;
        while (val <= 29) {
            val++;
            boolean p = false;
            int num = 1;
            while (num <= val / 3) {
                ++num;
                if (val % num == 0) {
                    p = true;
                    break;
                }
            }
            if (!p)
                System.out.printf("%d ", val);
        }
        System.out.println();

        //Triangle numbers
        //1 3 6 10 15 21 28 36 45 55
        System.out.print("Triangle Numbers: ");
        int value=1;
        int number=1;
        while(value<=10){
            int triangle= value+number;
            number= triangle;
            value++;
            System.out.print(triangle-1 + " ");
        }
        System.out.println();
    }
    }


