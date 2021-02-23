public class ZeroTask {

    private static ZeroTask zeroTask;

    public static ZeroTask getInstance() {
        if (zeroTask == null) {
            zeroTask = new ZeroTask();
        }
        return zeroTask;
    }

    private ZeroTask() {}

    public int calculateContinuousZeroSequence(String sequence) {
        int maxContinuousZeroSequence = 0;
        int potentialMaxContinuousZeroSequence = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '0') {
                potentialMaxContinuousZeroSequence++;
                if (maxContinuousZeroSequence < potentialMaxContinuousZeroSequence) {
                    maxContinuousZeroSequence = potentialMaxContinuousZeroSequence;
                }
            } else {
                potentialMaxContinuousZeroSequence = 0;
            }
        }
        return Math.max(maxContinuousZeroSequence, potentialMaxContinuousZeroSequence);
    }
}
