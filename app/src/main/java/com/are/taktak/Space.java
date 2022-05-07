package com.are.taktak;

import android.widget.ImageView;

public class Space {

    public ImageView spaceImage;
    public String spaceName,spaceDescription,spaceSector;

    public Space(){

    }

    public Space(ImageView spaceImage,String spaceName,String spaceDescription,String spaceSector){

        this.spaceImage = spaceImage;
        this.spaceName = spaceName;
        this.spaceDescription = spaceDescription;
        this.spaceSector = spaceSector;
    }


}
