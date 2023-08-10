package com;
class CallRating {
    String callId;
    int callDuration;
    double callQuality;
    String ratingCategory;
    int c= 1;
    public CallRating(int callDuration, double callQuality) {
        this.callId = generateCallId();
        this.callDuration = callDuration;
        this.callQuality = callQuality;
        this.ratingCategory = calculateRatingCategory();
    }
    String generateCallId() {
        return "[Auto-generated ID-" + c++ + "]";
    }
    String calculateRatingCategory() {
        double ratingScore = callQuality / callDuration;
        if (ratingScore >= 0.04) {
            return "Excellent";
        } else if (ratingScore >= 0.01 && ratingScore  <=  0.03 ) {
            return "Good";
        } else {
            return "Average";
        }
    }
    public String toString() {
        return "Call ID: " + callId + ", Call Duration: " + callDuration + " minutes, Call Quality: "
                + callQuality + ", Rating Category: " + ratingCategory;
    }
}
