package com.deckofcards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Zygimantus
 */
public class DeckOfCardsApiTests {

    @Test
    public void newDeckTest() throws IOException {

        DeckOfCardsApi.init();
        DeckOfCards api = DeckOfCardsApi.getApi();

        Call<DeckResponse> newDeck = api.createNewDeck();

        Response<DeckResponse> response = newDeck.execute();

        if (response.body() != null) {

            DeckResponse body = response.body();

            Assert.assertEquals(true, body.isSuccess());
        }
    }

    @Test
    public void drawCardsTest() throws IOException {

        DeckOfCardsApi.init();
        DeckOfCards api = DeckOfCardsApi.getApi();

        Call<DeckResponse> newDeck = api.createNewDeck();

        Response<DeckResponse> response = newDeck.execute();

        if (response.body() != null) {

            DeckResponse body = response.body();

            String deckIdForTest = body.getDeckId();
            int remainingForTest = body.getRemaining();

            List<DeckResponse.Card> cards = new ArrayList<>();
            for (int i = 0; i < remainingForTest; i++) {
                // draw one card
                Call<DeckResponse> card = api.drawCard(deckIdForTest, 1);
                response = card.execute();

                if (response.body() != null) {

                    body = response.body();

                    Assert.assertEquals(deckIdForTest, body.getDeckId());
                    Assert.assertEquals(true, body.isSuccess());

                    cards.addAll(body.getCards());
                }
            }
            Assert.assertEquals(remainingForTest, cards.size());
        }
    }
}
