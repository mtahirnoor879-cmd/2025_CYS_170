public class Lab_4_TimeEntity
{
    static class JTime
    {
        public int hour;
        public int min;
        public int sec;
        public JTime()
        {
            this.hour = 0;
            this.min = 0;
            this.sec = 0;
        }
        public JTime(int hour, int min, int sec) {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }
        public JTime(int totalSeconds) {
            this.hour = totalSeconds / 3600;
            int remaining = totalSeconds % 3600;
            this.min = remaining / 60;
            this.sec = remaining % 60;
        }
        public void display() {
            System.out.printf( hour+":" +min+":" +sec);
        }
        private int toSeconds() {
            return hour * 3600 + min * 60 + sec;
        }
        public int elapsedSeconds(JTime t) {
            return Math.abs(this.toSeconds() - t.toSeconds());
        }
        public JTime elapsedTime(JTime t) {
            return new JTime(this.elapsedSeconds(t));
        }
    }
    public static void main(String[] args) {
        JTime t1 = new JTime();
        {
            t1.hour = 10;
            t1.min = 15;
            t1.sec = 30;
            JTime t2 = new JTime();
            t2.hour = 12;
            t2.min = 45;
            t2.sec = 50;
            System.out.print("Time 1 = ");
            t1.display();
            System.out.println();
            System.out.print("Time 2 = ");
            t2.display();
            System.out.println();
            System.out.println("Elapsed seconds = " + t1.elapsedSeconds(t2));
            System.out.print("Elapsed time = ");
            t1.elapsedTime(t2).display();
            System.out.println();
        }
        JTime t3 = new JTime(5000);
        System.out.print("Time from 5000 seconds = ");
        t3.display();
        System.out.println();
    }
}