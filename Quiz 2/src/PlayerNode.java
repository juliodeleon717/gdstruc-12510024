public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    @Override
    public String toString() {
        return "PlayerNode{" +
                "player=" + player +
                ", nextPlayer=" + nextPlayer +
                '}';
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
