package com.deckofcards;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Zygimantus
 */
public class DeckOfCardsApi {

    private DeckOfCards service;
    private static DeckOfCardsApi sInstance;

    public DeckOfCardsApi() {

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://deckofcardsapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(DeckOfCards.class);
    }

    public static void init() {
        sInstance = new DeckOfCardsApi();
    }

    public static DeckOfCards getApi() {
        return sInstance.service;
    }

    public void setApi(DeckOfCards starWarsApi) {
        sInstance.service = starWarsApi;
    }

}
