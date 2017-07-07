package com.deckofcards;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Zygimantus
 */
public class DeckResponse {

    public boolean success;

    @SerializedName("deck_id")
    public String deckId;

    public int remaining;

    public boolean shuffled;

    public List<Card> cards;

    public static class Card {

        public String code;
        public String image;
        public String id;

        public void setId(String id) {
            this.id = id;
        }
    }
}
