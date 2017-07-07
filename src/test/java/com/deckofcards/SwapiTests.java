package com.deckofcards;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Zygimantus
 */
public class SwapiTests {

    @Test
    public void newDeckTest() throws IOException {

        DeckOfCardsApi.init();
        DeckOfCards api = DeckOfCardsApi.getApi();

        Call<DeckResponse> newDeck = api.createNewDeck();

        Response<DeckResponse> response = newDeck.execute();

        Assert.assertEquals(true, response.body().success);
    }
}
