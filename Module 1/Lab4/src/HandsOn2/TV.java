package HandsOn2;

public class TV implements RemoteControl {
    String type;
    int currentVolume;
    int screenSize;
    public TV(){
        currentVolume=MIN_VOLUME;
    }
    public int volumeUp(){
        this.currentVolume=this.currentVolume+1;
        return currentVolume;
    }
}
