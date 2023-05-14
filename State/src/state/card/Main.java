package state.card;

public class Main {
    public static void main(String[] args){
        CardsGame game = new CardsGame();
        game.playRound();
        game.setState(new DrawCardState());
        game.playRound();
    }
}
