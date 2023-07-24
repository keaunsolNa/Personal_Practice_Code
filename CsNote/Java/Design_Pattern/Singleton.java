package Java.Design_Pattern;


class MakeSingletonClass {
    private static class singleInstanceHolder {
        private static final MakeSingletonClass INSTANCE = new MakeSingletonClass();
    }

    public static MakeSingletonClass getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

public class Singleton {
    public static void main(String[] args) {
        MakeSingletonClass a = MakeSingletonClass.getInstance();
        MakeSingletonClass b = MakeSingletonClass.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        
        if(a == b) {
            System.out.println(true);
        }

        if(a.equals(b)){
            System.out.println(true + "2");
        }
    }
}

/*

865113938
865113938
true  

 */