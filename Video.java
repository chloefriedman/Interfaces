public class Video implements Playable
{
   @Override
   public void stop()
   {
        System.out.println("Stopping video");
   } 
    @Override
    public void play()
    {
        System.out.println("Playing video");
    }
}
