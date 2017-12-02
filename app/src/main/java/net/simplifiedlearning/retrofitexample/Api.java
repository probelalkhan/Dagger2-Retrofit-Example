package net.simplifiedlearning.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Belal on 10/2/2017.
 */

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
