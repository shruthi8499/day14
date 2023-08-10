package com;
public class CallRatingSystem {
	 public static CallRating[] rateCalls(int[] callDurations, double[] callQualities) {
	        int numCalls = Math.min(callDurations.length, callQualities.length);
	        CallRating[] callRatings = new CallRating[numCalls];
	        for (int i = 0; i < numCalls; i++) {
	            callRatings[i] = new CallRating(callDurations[i], callQualities[i]);
	        }
	        return callRatings;
	    }
	    public static void main(String[] args) {
	        int[] callDurations = { 5, 10, 7, 8, 15 };
	        double[] callQualities = { 0.35, 0.48, 0.21, 0.12, 0.30 };
	        CallRating[] callRatings = rateCalls(callDurations, callQualities);
	        for (CallRating callRating : callRatings) {
	            System.out.println(callRating);
	        }
	    }
	}
