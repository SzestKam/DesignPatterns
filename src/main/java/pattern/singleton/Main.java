package pattern.singleton;

class Main {
    
    public static void main(String[] args) {
        SingletonEager singleton1 = SingletonEager.getInstance();
        System.out.println(singleton1.getCount());
        System.out.println(singleton1.getCount2());

        SingletonEager singleton2 = SingletonEager.getInstance();
        System.out.println(singleton2.getCount());
        System.out.println(singleton2.getCount2());

        SingletonEager singleton3 = SingletonEager.getInstance();
        System.out.println(singleton3.getCount());
        System.out.println(singleton3.getCount2());

        //--------------------------------------------------
        //----- Enum based singleton -------------------
        SingletonEnum.BLACK.getInfo();
        SingletonEnum.BLUE.getInfo();
        
    }
            
}
