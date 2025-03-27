// Multiple interface means Extending only ONE class but implementing more interfaces.
// Example:
// 1.CellPhone is SmartPhone, SmartPhone extends from CellPhone class
// 2.SmartPhone can be used as GPS device, Media Player, Camera, means implementing from the interfaces.
// Directly is not allowed into the Java, but in-directly it is.
// In interface, values can be overwritten, and no need to be assign public to method, it counts automatically just assign type: void, int, float, void.

class cell_Phone{
    void turning_on(){
        System.out.println("Cell Phone is turning On.");
    }
    void turning_off(){
        System.out.println("Cell Phone is turning Off.");
    }
}

interface gps{
    void turning_on_GPS();
    void tracking_device();
    void turning_off_GPS();
}

interface camera{
    void opening_on_camera();
    void taking_picture();
    void opening_off_camera();
}

interface musicPlayer{
    void opening_on_player();
    void playing_media();
    void stop_player();
    void opening_off_player();
}

class SmartPhone extends cell_Phone implements gps,camera,musicPlayer{

//    void turning_on(){
//        System.out.println("Turning on SmartPhone.");
//    }
//    void turning_off(){
//        System.out.println("Turning off SmartPhone.");
//    }
    @Override
    public void opening_on_camera() {
        System.out.println("Opening on Camera.");
    }

    @Override
    public void taking_picture() {
        System.out.println("Taking Picture.");
    }

    @Override
    public void opening_off_camera() {
        System.out.println("Opening Off Camera.");
    }

    @Override
    public void turning_on_GPS() {
        System.out.println("Turning on GPS");
    }

    @Override
    public void tracking_device() {
        System.out.println("Tracking_device.");
    }

    @Override
    public void turning_off_GPS() {
        System.out.println("Turning_off_GPS");
    }

    @Override
    public void opening_on_player() {
        System.out.println("opening_on_player.");
    }

    @Override
    public void playing_media() {
        System.out.println("Playing Media.");
    }

    @Override
    public void stop_player() {
        System.out.println("Stopping Player.");
    }

    @Override
    public void opening_off_player() {
        System.out.println("Opening Off Player.");
    }
    public void GPS(){
        System.out.println("GPS has been tracked.");
    }
}

public class multipleInterfaces {
    public static void main(String[] args) {
        SmartPhone sm1 = new SmartPhone();
        sm1.turning_on();
        sm1.turning_off();
        sm1.opening_on_camera();
        sm1.taking_picture();
        sm1.opening_off_camera();
        sm1.turning_on_GPS();
        sm1.tracking_device();
        sm1.turning_off_GPS();
        sm1.opening_on_player();
        sm1.playing_media();
        sm1.stop_player();
        sm1.opening_off_player();
    }
}