public class JenkinsCalc {

    public int addition(int a, int b){
        return a+b;
    }

    public int sustraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        if (b == 0){
            return a;
        }
        return a/b;
    }
}
