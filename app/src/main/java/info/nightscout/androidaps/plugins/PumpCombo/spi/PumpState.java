package info.nightscout.androidaps.plugins.PumpCombo.spi;

import java.util.Date;

/**
 * State representing the state of the MAIN_MENU.
 */
public class PumpState {
    public Date timestamp = new Date();
    public boolean tbrActive = false;
    public int tbrPercent = -1;
    public double tbrRate = -1;
    public int tbrRemainingDuration = -1;
    /**
     * This is the error message (if any) displayed by the pump if there is an alarm,
     * e.g. if a "TBR cancelled alarm" is active, the value will be "TBR CANCELLED".
     * Generally, an error code is also displayed, but it flashes and it might take
     * longer to read that and the pump connection gets interrupted if we're not
     * reacting quickly.
     */
    public String errorMsg;
    public boolean suspended;
    public boolean lowBattery;
    public int insulinState = -1;
    public int reservoirLevel = -1;

    public PumpState tbrActive(boolean tbrActive) {
        this.tbrActive = tbrActive;
        return this;
    }

    public PumpState tbrPercent(int tbrPercent) {
        this.tbrPercent = tbrPercent;
        return this;
    }

    public PumpState tbrRate(double tbrRate) {
        this.tbrRate = tbrRate;
        return this;
    }

    public PumpState tbrRemainingDuration(int tbrRemainingDuration) {
        this.tbrRemainingDuration = tbrRemainingDuration;
        return this;
    }

    public PumpState errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public PumpState suspended(boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    public PumpState lowBattery(boolean lowBattery) {
        this.lowBattery = lowBattery;
        return this;
    }

    public PumpState insulinState(int insulinState) {
        this.insulinState = insulinState;
        return this;
    }

    public PumpState reservoirLevel(int reservoirLevel) {
        this.reservoirLevel = reservoirLevel;
        return this;
    }

    public String getStateSummary() {
        if (suspended)
            return "Suspended";
        else if (errorMsg != null)
            return errorMsg;
        return "Normal";
    }

    @Override
    public String toString() {
        return "PumpState{" +
                "tbrActive=" + tbrActive +
                ", tbrPercent=" + tbrPercent +
                ", tbrRate=" + tbrRate +
                ", tbrRemainingDuration=" + tbrRemainingDuration +
                ", errorMsg=" + errorMsg +
                ", suspended=" + suspended +
                ", lowBattery=" + lowBattery +
                ", insulinState=" + insulinState +
                ", reversoirLevel=" + reservoirLevel +
                ", timestamp=" + timestamp +
                '}';
    }
}