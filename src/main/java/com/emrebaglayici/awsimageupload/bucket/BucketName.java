package com.emrebaglayici.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("your bucket name");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
