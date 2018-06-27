package com.example.donna.galwaytourapp;

public class Place {
    /**
     * String resource ID for the hotel
     */
    private int mNameID;

    /**
     * String resource ID for the dining
     */
    private int mAddressId;

    /**
     * String resource ID for the sites
     */
    private int mPhoneId;

    /**
     * Image resource ID
     */
    private int mImageId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     */
    public Place(int nameId, int adressId, int imageId,
                 int phoneId) {
        mNameID = nameId;
        mAddressId = adressId;
        mPhoneId = phoneId;
        mImageId = imageId;

    }

    /**
     * Get the string resource ID for hotel.
     */
    public int getNameId() {
        return mNameID;
    }

    /**
     * Get the string resource ID for the dining
     */
    public int getAdressId() {
        return mAddressId;
    }

    /**
     * Get the string resource ID for the dining
     */
    public int getPhoneId() {
        return mPhoneId;
    }


    /**
     * Return the image resource ID o.
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }


}


