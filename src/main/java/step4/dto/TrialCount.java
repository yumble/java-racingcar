package step4.dto;

import step4.common.MyException;

import java.util.Objects;

public class TrialCount {
    private static final int MIN_TRIAL = 0;
    private static final int CALCULATE_UNIT = 1;
    private int trialCount;

    public TrialCount(int trialCount) {
        validTrialCount(trialCount);

        this.trialCount = trialCount;
    }

    public void minusTrial() {
        this.trialCount -= CALCULATE_UNIT;
    }

    public boolean isFinalTrial() {
        return this.trialCount == MIN_TRIAL;
    }

    private void validTrialCount(int trialCount) {
        if(MIN_TRIAL >= trialCount) {
            throw new IllegalArgumentException(MyException.VALUE_GREATER_THAN_ONE.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrialCount that = (TrialCount) o;
        return trialCount == that.trialCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trialCount);
    }
}
