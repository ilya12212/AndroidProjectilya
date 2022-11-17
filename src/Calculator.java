public class Calculator implements  Sign{
    int num;
    int num1;

    public Calculator(int num, int num2) {
        this.num = num;
        this.num1 = num2;
    }

    public int getNum() {
        return num;
    }

    public int getNum1() {
        return num1;
    }


    public void setNum(int num) {
        this.num = num;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    @Override
    public void mines() {
        System.out.println(num - num1);
    }

    @Override
    public void plus() {
        System.out.println(num + num1);

    }

    @Override
    public void multiply() {
        System.out.println(num * num1);

    }

    @Override
    public void division() {
        System.out.println(num / num1);
    }
}

