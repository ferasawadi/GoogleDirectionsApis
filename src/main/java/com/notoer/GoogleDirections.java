package com.notoer;


import com.notoer.googleDataHelper.googleRouteData;

import java.util.List;

public class GoogleDirections {
    private List<GeocodedWaypoint> geocoded_waypoints;
    private List<googleRouteData> routes;
    private String status;
    private String error_message;

    public GoogleDirections(List<GeocodedWaypoint> geocoded_waypoints, List<googleRouteData> routes, String status, String error_message) {
        this.geocoded_waypoints = geocoded_waypoints;
        this.routes = routes;
        this.status = status;
        this.error_message = error_message;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public List<GeocodedWaypoint> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypoint> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<googleRouteData> getRoutes() {
        return routes;
    }

    public void setRoutes(List<googleRouteData> routes) {
        this.routes = routes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class GeocodedWaypoint {
        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public GeocodedWaypoint(String geocoder_status, String place_id, List<String> types) {
            this.geocoder_status = geocoder_status;
            this.place_id = place_id;
            this.types = types;
        }

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }
}
