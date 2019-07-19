package com.notoer;

import retrofit2.Call;
import retrofit2.http.*;

public interface googleDirectionsInterface {

    //Send the Code To Api To Verify.
    @GET("direction")
//    @Headers("Authorization : Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImM2YTgxNzhhNjczNDMyOWEyYzc1MTFhYmFiYmQ2YjBjZjI4YjcwZmU1MTRlYzYzMWYyMzcwZjg2NjRmMTViNmMzODZlZWQ5NTJhOTc5Y2YxIn0.eyJhdWQiOiIxIiwianRpIjoiYzZhODE3OGE2NzM0MzI5YTJjNzUxMWFiYWJiZDZiMGNmMjhiNzBmZTUxNGVjNjMxZjIzNzBmODY2NGYxNWI2YzM4NmVlZDk1MmE5NzljZjEiLCJpYXQiOjE1NjM1MTk1ODYsIm5iZiI6MTU2MzUxOTU4NiwiZXhwIjoxNTk1MTQxOTg2LCJzdWIiOiIiLCJzY29wZXMiOltdfQ.rqEVxzL1MtxMcuA5aI_CgBQfXKvCeouuwmb96ez6NbYlsDncdSGaxA42yoRUaqcfZj-Apmhx3HBA1OB0hWhA26TQxQ2Wh5Rxng1pPSwltjRRr0zl0qsrpeWIS_9bhI8gQqvjcxK9b06Oeo8NeKBZjomoeaa2LIVBBG-80xtV6YmXHMPxDi7gRkKRzjkI76Ji9zNLuj5oQ77EzbI0xT27JbQqkIXXNZzS1hvg33PZ0ZVukICRHfWG4Vn3EPG4ZkAqLxkxMekYRYDbAvWzCpSENWSUT69ZRrVAimnvZ6DtCXVAb0mlkay65JrS2joCuzw2CYV-qd5bZoOdjoeBzFVIbv48KYMlz5VV-Pl6ccil2jcBN7zLrRxz6eaHmvo3B7FE-3mY9sLl0ihdAVojlpuDIERVnnvsPb8hsqORfTOwvI1oCFmguvDij_nujyEFQLmmH0w7V3bLbbVl5PDh4tRwoCnJT-3XY1wFUzK0FuUtbVM9Kp94H7xWEAorB7rm7tO64PWqTbS980RbcDTRzsInQIAHlbLewZ_nTEuUjLb1r8aU62fxjhO2yV8aCFa_ffteRfOgfJ0itmWtCVqSm7foZJb8odFhMv3bk7Vvg9XhAsdQH-a_Iopdao-DsprXNILXNp3bQbjW5Q2Hv6FVwKpQSjC7Ssj6hxlyNKWyFcFQjVM")
    Call<GoogleDirections> getRouteOnGoogleMap(@Query("s_longitude") String sourceLongitude,
                                               @Query("s_latitude") String sourceLatitude,
                                               @Query("place_id") String place_id);
}
