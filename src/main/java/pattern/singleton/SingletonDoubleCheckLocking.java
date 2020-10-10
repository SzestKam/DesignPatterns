package pattern.singleton;

class SingletonDoubleCheckLocking {

    private static SingletonDoubleCheckLocking INSTANCE;

    public SingletonDoubleCheckLocking() {
    }

    public static SingletonDoubleCheckLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckLocking();
                }
            }
        }

        return INSTANCE;
    }
}
