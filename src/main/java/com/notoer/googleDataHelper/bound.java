package com.notoer.googleDataHelper;

import java.util.List;
import java.util.List;

public class bound {
    private coordenateInfo northeast;
    private coordenateInfo southwest;


    public bound(coordenateInfo northeast, coordenateInfo southwest) {
        this.northeast = northeast;
        this.southwest = southwest;
    }

    public coordenateInfo getNortheast() {
        return northeast;
    }

    public void setNortheast(coordenateInfo northeast) {
        this.northeast = northeast;
    }

    public coordenateInfo getSouthwest() {
        return southwest;
    }

    public void setSouthwest(coordenateInfo southwest) {
        this.southwest = southwest;
    }

    public class coordenateInfo {
        private String lat;
        private String lng;

        public coordenateInfo(String lat, String lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }
}