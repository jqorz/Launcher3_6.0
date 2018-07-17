package com.fly;

/**
 * Created by huangshuai on 2016/7/10.
 */
public abstract class AdStrategy {
    protected int advertiseId;

    AdStrategy(int id) {
        advertiseId = id;
    }

    public abstract boolean shouldDisplay();

    public static class InterstitialStrategy extends AdStrategy {
        static int clickNum;

        InterstitialStrategy(int id) {
            super(id);
        }

        public boolean shouldDisplay() {
            clickNum += 1;
            return clickNum%20==0;
        }
    }

    static class NativeStrategy extends AdStrategy {
        NativeStrategy(int id) {
            super(id);
        }

        public boolean shouldDisplay() {
            return true;
        }
    }


}
