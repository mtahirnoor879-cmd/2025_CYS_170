public class Lab_3_3D_PointTask
{

    public static void main(String[] args) {

        class Point {
            private int a=3;
            private int b=4;
            private int c=6;

            public Point()
            {
                a = 3;
                b = 4;
                c = 6;
            }
            public Point(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public int getA() { return a; }
            public void setA(int a) { this.a = a; }

            public int getB() { return b; }
            public void setB(int b) { this.b = b; }

            public int getC() { return c; }
            public void setC(int c) { this.c = c; }
        }

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        System.out.println(p1.getA());
        System.out.println(p2.getB());
        System.out.println(p3.getC());
        System.out.println(p1.getA() + " " + p1.getB() + " " + p1.getC());
    }
}

