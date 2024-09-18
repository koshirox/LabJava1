    class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        System.out.println(o.max());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.max());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int firstNumber;
    private int secondNumber;
    public MySecondClass(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int max() {
        return Math.max(firstNumber, secondNumber);
}
}