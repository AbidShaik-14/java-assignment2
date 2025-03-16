abstract class Telephone {
    abstract void call();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    void call() {
        System.out.println("Called");
    }
    void lift() {
        System.out.println("Lifted");
    }
    void disconnect() {
        System.out.println("Disconnected");
    }
    void browseInternet() {
        System.out.println("Browsing");
    }
}
public class telephoneMain {
    public static void main(String[] args) {
        Telephone s = new SmartTelephone();
        s.call();
        s.lift();
        s.disconnect();

        SmartTelephone t = new SmartTelephone();
        t.browseInternet();
    }
}
