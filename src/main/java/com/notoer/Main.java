package com.notoer;

import com.notoer.googleDataHelper.googleRouteData;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static final String BERAR="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImM2YTgxNzhhNjczNDMyOWEyYzc1MTFhYmFiYmQ2YjBjZjI4YjcwZmU1MTRlYzYzMWYyMzcwZjg2NjRmMTViNmMzODZlZWQ5NTJhOTc5Y2YxIn0.eyJhdWQiOiIxIiwianRpIjoiYzZhODE3OGE2NzM0MzI5YTJjNzUxMWFiYWJiZDZiMGNmMjhiNzBmZTUxNGVjNjMxZjIzNzBmODY2NGYxNWI2YzM4NmVlZDk1MmE5NzljZjEiLCJpYXQiOjE1NjM1MTk1ODYsIm5iZiI6MTU2MzUxOTU4NiwiZXhwIjoxNTk1MTQxOTg2LCJzdWIiOiIiLCJzY29wZXMiOltdfQ.rqEVxzL1MtxMcuA5aI_CgBQfXKvCeouuwmb96ez6NbYlsDncdSGaxA42yoRUaqcfZj-Apmhx3HBA1OB0hWhA26TQxQ2Wh5Rxng1pPSwltjRRr0zl0qsrpeWIS_9bhI8gQqvjcxK9b06Oeo8NeKBZjomoeaa2LIVBBG-80xtV6YmXHMPxDi7gRkKRzjkI76Ji9zNLuj5oQ77EzbI0xT27JbQqkIXXNZzS1hvg33PZ0ZVukICRHfWG4Vn3EPG4ZkAqLxkxMekYRYDbAvWzCpSENWSUT69ZRrVAimnvZ6DtCXVAb0mlkay65JrS2joCuzw2CYV-qd5bZoOdjoeBzFVIbv48KYMlz5VV-Pl6ccil2jcBN7zLrRxz6eaHmvo3B7FE-3mY9sLl0ihdAVojlpuDIERVnnvsPb8hsqORfTOwvI1oCFmguvDij_nujyEFQLmmH0w7V3bLbbVl5PDh4tRwoCnJT-3XY1wFUzK0FuUtbVM9Kp94H7xWEAorB7rm7tO64PWqTbS980RbcDTRzsInQIAHlbLewZ_nTEuUjLb1r8aU62fxjhO2yV8aCFa_ffteRfOgfJ0itmWtCVqSm7foZJb8odFhMv3bk7Vvg9XhAsdQH-a_Iopdao-DsprXNILXNp3bQbjW5Q2Hv6FVwKpQSjC7Ssj6hxlyNKWyFcFQjVM";

//    if (response.isSuccessful()) {
//        GoogleDirections googleDirections = response.body();
//        googleRouteData data = googleDirections.getRoutes().get(0);
//        System.out.println(data.getCopyrights());
//
//        System.out.println("in");
//    }

    public static void main(String[] args) {
        System.out.println("main");

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("Authorization", BERAR).build();
                return chain.proceed(request);
            }
        });
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://apisnotoer.com/")
                .client(httpClient.build())
                .build();

        googleDirectionsInterface directionsInterface = retrofit.create(googleDirectionsInterface.class);
        Call<GoogleDirections> call = directionsInterface.getRouteOnGoogleMap("28.8097278", "41.0558401", "ChIJJV77bo-kyhQRfO6twmmiKGQ");
        call.enqueue(new Callback<GoogleDirections>() {
            @Override
            public void onResponse(Call<GoogleDirections> call, Response<GoogleDirections> response) {
                GoogleDirections googleDirections = response.body();
                if (response.isSuccessful()) {
                    if (!googleDirections.getRoutes().isEmpty()) {
                        googleRouteData routeData = googleDirections.getRoutes().get(0);

                        System.out.println("Start Address: " +
                                routeData
                                        .getLegs()
                                        .get(0)
                                        .getEnd_address()
                        );

                        System.out.println("Start Address: " +
                                routeData
                                        .getLegs()
                                        .get(0)
                                        .getDuration()
                                        .getText()
                        );

                        System.out.println("Travel Mode::: " +
                                routeData
                                        .getLegs()
                                        .get(0)
                                        .getSteps()
                                        .get(0)
                                        .getTravel_mode()
                        );
                    } else {
                        System.out.println(googleDirections.getError_message());
                    }

                } else {
                    System.out.println("Failed");
                }
            }

            @Override
            public void onFailure(Call<GoogleDirections> call, Throwable t) {

                t.printStackTrace();
                System.out.println("errrrrrr");
            }
        });
    }
}
