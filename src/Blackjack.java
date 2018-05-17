public class Blackjack extends blackjackMain {

    public int returnClosestValue(int x, int y) {
        int a = 21 - x;
        int b = 21 - y;

        if ((a==0)||(b==0)) {           // if either number is 21...
            return 21;
        } else if ((a>b)&&(a>0)) {      // if x > y and x !> 21...
            return x;
        } else if ((b>a)&&(b>0)) {      // if y > x and y !> 21...
            return y;
        } else if ((a==b)&&(a>0)) {     // if x == y...
            return x;
        } else if ((a<0)&&(b<0)) {      // if x > 21 and y > 21...
            return 0;
        }
        return 0;
    }
}
