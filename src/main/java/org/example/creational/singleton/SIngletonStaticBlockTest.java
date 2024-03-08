package org.example.creational.singleton;

public class SIngletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();

        System.out.println(instance2);
        System.out.println(instance1);
    }

    public static class SingletonThreadSafe {
        private static SingletonThreadSafe threadSafeInstance;

        private SingletonThreadSafe() {

        }

        public static SingletonThreadSafe getInstance() {
            synchronized (SingletonThreadSafe.class) {
                if (threadSafeInstance == null) {
                    threadSafeInstance = new SingletonThreadSafe();
                }
            }
            return threadSafeInstance;
        }
    }
}
