package state.card;

public class WaitState implements ComputerPlayerState{
    @Override
    public void play(int value) {
        System.out.println("Waiting...");
    }
}