class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int altitude = 0, maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println("Highest Altitude: " + largestAltitude(gain));
    }
}
