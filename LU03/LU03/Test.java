public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.new B().start();
    }

    class A {
        public void start() {
            System.out.println(getP());
        }

        public int getP() {
            return 1;
        }
    }

    class B extends A {
        public int getP() {
            return 2 + super.getP();
        }
    }
}

