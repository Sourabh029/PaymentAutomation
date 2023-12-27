public class ThreadSleeper {
    private long duration;

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void sleeper(long duration)
    {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
