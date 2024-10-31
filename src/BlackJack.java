import java.util.Random;

public class BlackJack {

    //region создание карт
    /*
    Карточные масти на английском (suit):
    ♣️ Трефы — clubs.
    ♦️ Бубны — diamonds.
    ♥️ Червы — hearts.
    ♠️ Пики — spades.

    Значение карты (rank):
    Ace (Туз)
    Jack (Валет / Джек)
    Queen (Дама / Королева(
    King (Король)
    Joker (Джокер)
    Остальные карты, с двойки по десятку, называются просто цифрой.
     */

    enum CardSuit {
        DIAMONDS("♦"),
        HEARTS("♥"),
        CLUBS("♣"),
        SPADES("♠"),
        ;

        public String suits;

        CardSuit(String suits) {
            this.suits = suits;
        }
    }

    enum CardRank {
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("В"),
        QUEEN("Д"),
        KING("К"),
        ACE("Т"),
        ;

        public String rank;

        CardRank(String rank) {
            this.rank = rank;
        }
    }


    //endregion


    public static void main(String[] args) {

        Random random = new Random();

        CardSuit[] cardSuits = CardSuit.values();
        CardRank[] cardRanks = CardRank.values();

        for (int i = 0; i < cardRanks.length; i++) {
            System.out.print(cardRanks[i].rank + " ");
        }
        System.out.println();
        for (int i = 0; i < cardSuits.length; i++) {
            System.out.print(cardSuits[i].suits + " ");
        }
        System.out.println();

        String[][] deck = new String[cardSuits.length][cardRanks.length];

        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                deck[i][j] = cardRanks[j].rank + cardSuits[i].suits;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[i].length; j++) {
                System.out.print(deck[i][j] + " ");
            }
            System.out.println();
        }


    }
}
