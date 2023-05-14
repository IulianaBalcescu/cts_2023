package state.mobil;

import state.mobil.AlertStateContext;

public class Main {

    /*
    * În exemplul de mai jos, am implementat un scenariu de stare mobilă.
    * În ceea ce privește alertele, un mobil poate fi în diferite stări.
    * De exemplu, vibrația și liniștea. Pe baza acestei stări de alertă,
    * comportamentul mobilului se schimbă atunci când urmează să fie efectuată o alertă.
     * */
    public static void main(String[] args) {
        AlertStateContext stateContext
                = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}