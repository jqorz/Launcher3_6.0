package com.fly;

import com.fly.AdStrategy.InterstitialStrategy;

import java.util.HashMap;

/**
 * Created by huangshuai on 2016/7/10.
 */
public class AdsController {
    public static final int AD_POSITION_INTERSTITIAL = 1;
    private static AdsController instance;
    private static HashMap<Integer, AdStrategy> strategyHashMap = new HashMap<Integer, AdStrategy>();

    private AdsController() {

    }

    public static AdsController getInstance() {
        if (instance == null) {
            instance = new AdsController();
        }
        return instance;
    }

    public InterstitialStrategy getInterStrategy(int id) {
        if (strategyHashMap.get(id) != null) {
            return (InterstitialStrategy) strategyHashMap.get(id);
        }

        InterstitialStrategy adStrategy = new InterstitialStrategy(id);
        strategyHashMap.put(id,adStrategy);
        return adStrategy;
    }


}
