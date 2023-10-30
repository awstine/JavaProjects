package FirstClass.src;

public class DiskDriveNotReady extends Exception{
    public DiskDriveNotReady() {
        super("Disk drive not ready");
    }
    public DiskDriveNotReady(String message){
        super(message);
    }
}