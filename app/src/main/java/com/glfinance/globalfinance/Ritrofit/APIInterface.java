package com.glfinance.globalfinance.Ritrofit;

import com.glfinance.globalfinance.Requestpojo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);

    @POST("createUser")
    Call<User> createUser(@Body User user);

}
