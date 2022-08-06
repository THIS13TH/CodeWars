package Exercise;

public class Main {
    public static void main(String[] args) {

        Sum s = new Sum();

        System.out.println(s.GetSum(0, -1));
       System.out.println(s.GetSum(0, 1));
    }
}


class Sum
{
    public int GetSum(int a, int b)
    {
        int sum = 0;
        if(a == b){
            return a;
        }
        if(b > a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }else{
            for (int i = b; i <= a ; i++) {
                sum += i;
            }
        }

        return sum;
    }
}