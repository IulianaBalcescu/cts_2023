package state.mobil;

import state.mobil.AlertStateContext;
import state.mobil.MobileAlertState;

class Vibration implements MobileAlertState {
    @Override public void alert(AlertStateContext ctx)
    {
        System.out.println(" vibration...");
    }
}