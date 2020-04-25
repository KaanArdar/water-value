package com.istegelsin.challenges.service;

import java.util.List;

public class PoolService {

    public Integer waterVolue(List<Integer> poolAreas) {
        return calculator(poolAreas,fieldScanningRight(poolAreas),fieldScanningLeft(poolAreas));
    }

    public Integer calculator(List<Integer> poolAreas, int[] scanningRight, int[] scanningLeft) {
        int water = 0;
        for (int i = 0; i < poolAreas.size(); i++){
            water += Math.min(scanningLeft[i], scanningRight[i]) - poolAreas.get(i);
        }
        return water;
    }


    private int[] fieldScanningLeft(List<Integer> poolAreas) {
        int[] left = new int[poolAreas.size()];
        left[0] = poolAreas.get(0);

        for (int i = 1; i < poolAreas.size(); i++) {
            left[i] = Math.max(left[i - 1], poolAreas.get(i));
        }

        return left;
    }

    private int[] fieldScanningRight(List<Integer> poolAreas) {
        int[] right = new int[poolAreas.size()];
        right[poolAreas.size() - 1] = poolAreas.get(poolAreas.size() - 1);

        for (int i = poolAreas.size() - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], poolAreas.get(i));
        }

        return right;
    }


}
