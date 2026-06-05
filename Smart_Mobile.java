interface GPS
{
    void location();
}
interface Microphone
{
    void recording();
}
abstract class Camera
{
    abstract void picture();
    abstract void video();
}
abstract class MediaPlayer
{
    abstract void playAudio();
    abstract void playVideo();
}
class Mobile extends Camera implements GPS, Microphone
{
    void picture()
    {
        System.out.println("Taking Picture");
    }
    void video()
    {
        System.out.println("Recording Video");
    }
    public void location()
    {
        System.out.println("Showing Current Location");
    }
    public void recording()
    {
        System.out.println("Recording Voice");
    }
}
class Media extends MediaPlayer
{
    void playAudio()
    {
        System.out.println("Playing Audio");
    }
    void playVideo()
    {
        System.out.println("Playing Video");
    }
}
public class Smart_Mobile
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile();
        m.picture();
        m.video();
        m.location();
        m.recording();
        Media mp = new Media();
        mp.playAudio();
        mp.playVideo();
    }
}