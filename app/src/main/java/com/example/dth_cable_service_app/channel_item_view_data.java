package com.example.dth_cable_service_app;

import android.telephony.mbms.StreamingServiceInfo;

public class channel_item_view_data {
    private String name;
    private String description;
    private Integer imageIcon;

    public channel_item_view_data(String name, String description, Integer imageIcon) {
        this.name = name;
        this.description = description;
        this.imageIcon = imageIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(Integer imageIcon) {
        this.imageIcon = imageIcon;
    }

}
