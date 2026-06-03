public class Lab_3_Time
{
    static class Time
    {
        private int h;
        private int m;
        private int s;

        public int getH() { return h; }
        public void setH(int h) { this.h = h; }

        public int getM() { return m; }
        public void setM(int m) { this.m = m; }

        public int getS() { return s; }
        public void setS(int s) { this.s = s; }

        public void what_Time(int no_of_sec) {
            int total_sec = 43200 - no_of_sec;
            h = total_sec / 3600;
            int remaining = total_sec % 3600;
            m = remaining / 60;
            s = remaining % 60;

            System.out.print(h+ ":" +m+ ":" +s+ " ");
            if (h < 12) {
                System.out.println("am");
            } else {
                System.out.println("pm");
            }
        }
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.what_Time(5000);
    }
}
