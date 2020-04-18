//Extended Euclid Algorithm is used to ax + by = gcd(a,b);

//ax+by = c this equation is only possible to solve when 
//gcd(a,b) divides c then only integral solution will exist

//This will give the value of x and y where x and y are intergers
//ax+by = gcd(a,b) = gcd(b,a%b);
//bx1 = (a%b)y1 = gcd(b,a%b);
//x1 = y1
//y1 = x1-(a/b)y1
//gcd(a.b) = gcd(b,a%b);

class Triplet {
    int x;
    int y;
    int gcd;

    Triplet(int x, int y, int gcd) {
        this.x = x;
        this.y = y;
        this.gcd = gcd;
    }
}

public class extendedEuclid {
    public static Triplet eculidExt(int a, int b) {
        if (b == 0) {
            return new Triplet(1, 0, a);
        }
        Triplet smallAns = eculidExt(b, a % b);
        Triplet ans = new Triplet(smallAns.y, smallAns.x - (a / b) * smallAns.y, smallAns.gcd);
        return ans;
    }

    public static void main(String args[]) {
        int a = 16;
        int b = 10;
        Triplet ans = eculidExt(a, b);
        System.out.println(ans.x + " " + ans.y + " " + ans.gcd);
    }
}