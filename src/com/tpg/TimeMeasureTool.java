package com.tpg;

public class TimeMeasureTool {

	public static void main(String[] args) {
		//measuring elapsed time using System.nanoTime
        long startTime = System.nanoTime();
        for(int i=0; i< 1000000; i++){
            Object obj = new Object();
        }
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Total execution time to create 1000K objects in Java in millis: "
                + elapsedTime/1000000);

	}

}
