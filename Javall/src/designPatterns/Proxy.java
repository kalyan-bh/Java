package designPatterns;
import java.util.Arrays;
import java.util.List;

/*
The Proxy Design Pattern is a structural pattern that provides a surrogate or placeholder for another object to control access to it.
A proxy controls access to the real object, adding additional behavior like lazy initialization, logging, security, or access control.
When you want to control access to an object.
To add extra functionality like caching, logging, or permission checks without changing the actual object.
 */
interface Internet {
    void connectTo(String serverHost);
}
class RealInternet implements Internet {
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}

class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites = Arrays.asList("abc.com", "xyz.com");

    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            System.out.println("Access Denied to " + serverHost);
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}

public class Proxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectTo("google.com"); // Allowed
        internet.connectTo("abc.com");    // Blocked
    }
}
/*
A security guard (proxy) at a building checks whether you're allowed to enter before letting you talk to the company inside (real subject).
 */
