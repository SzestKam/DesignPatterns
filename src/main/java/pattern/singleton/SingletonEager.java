package pattern.singleton;

class SingletonEager {
    private static final SingletonEager INSTANCE =
            new SingletonEager();
    private static int count;
    private static int count2;

    {
        count++;
    }

    static {
        count2++;
    }

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public int getCount() {
        return count;
    }
    public int getCount2() {
        return count2;
    }
}
