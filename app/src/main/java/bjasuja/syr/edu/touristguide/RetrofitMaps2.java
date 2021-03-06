package bjasuja.syr.edu.touristguide;


import bjasuja.syr.edu.touristguide.POJO2.Example;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface RetrofitMaps2 {
    @GET("api/directions/json?key= YOUR API KEY")
    Call<Example> getDistanceDuration(@Query("units") String units, @Query("origin") String origin, @Query("destination") String destination, @Query("mode") String mode);

}
