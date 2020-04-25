package com.istegelsin.challenges.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PoolServiceTest {

    private final PoolService poolService = new PoolService();


    @Test
    public void waterValueCase1() {
        List<Integer> poolArea = Arrays.asList(7, 0, 4, 2, 5, 0, 6, 4, 0, 5);

        Integer waterVolume = poolService.waterVolue(poolArea);

        Assertions.assertEquals(25, waterVolume);
    }

    @Test
    public void waterValueCase2() {
        List<Integer> poolArea = Arrays.asList(7, 7, 7, 7, 7);

        Integer waterVolume = poolService.waterVolue(poolArea);

        Assertions.assertEquals(0, waterVolume);
    }



    @Test
    public void waterValueCase3() {
        List<Integer> poolArea = Arrays.asList(0, 1, 7, 1, 0);

        Integer waterVolume = poolService.waterVolue(poolArea);

        Assertions.assertEquals(0, waterVolume);
    }



}