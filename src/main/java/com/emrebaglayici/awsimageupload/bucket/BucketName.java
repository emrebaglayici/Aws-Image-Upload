package com.emrebaglayici.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("emrebaglayici-image-upload");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
