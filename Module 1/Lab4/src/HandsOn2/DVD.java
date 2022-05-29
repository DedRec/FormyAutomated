package HandsOn2;

public class DVD implements RemoteControl {
    String type;
    int currentVolume;
    public DVD(){
        currentVolume=MIN_VOLUME;
    }
    public int volumeUp(){
        this.currentVolume=this.currentVolume+2;
        return currentVolume;
    }
}
