package com.deckofcards;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 *
 * @author Zygimantus
 */
public interface DeckOfCards {

    @GET("deck/new/shuffle/?deck_count=2")
    Call<DeckResponse> createNewDeck();

    @GET("deck/{deckId}/draw/")
    Call<DeckResponse> drawCard(@Path("deckId") String deckId, @Query("count") int count);
}
