package com.deckofcards;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Zygimantus
 */
public class DeckResponse {

    private boolean success;

    @SerializedName("deck_id")
    private String deckId;

    private int remaining;

    private boolean shuffled;

    private List<Card> cards;

    public static class Card {

        public String code;
        public String image;
        public String id;

        public void setId(String id) {
            this.id = id;
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public boolean isShuffled() {
        return shuffled;
    }

    public void setShuffled(boolean shuffled) {
        this.shuffled = shuffled;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
