package singleton;

public class JavaSingleton {
    private static volatile JavaSingleton instance;

    public static JavaSingleton getInstance() {
        JavaSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (JavaSingleton.class) {
            if (instance == null) {
                instance = new JavaSingleton();
            }
            return instance;
        }
    }
}
