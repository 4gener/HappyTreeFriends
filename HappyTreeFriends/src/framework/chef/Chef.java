package framework.chef;

public final class Chef {
    private Chef() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Chef instance;

    public static synchronized Chef getInstance() {
        if (instance == null) {
            instance = new Chef();
        }

        return instance;
    }
}
