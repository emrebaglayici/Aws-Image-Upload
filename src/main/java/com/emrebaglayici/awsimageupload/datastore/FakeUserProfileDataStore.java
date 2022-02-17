package com.emrebaglayici.awsimageupload.datastore;

import com.emrebaglayici.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES=new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("188f4618-04c9-465e-b6c2-495a94b7cc4b"),"ahmet",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("49bacde1-40b9-46c5-ade3-f51117f8fe0f"),"mehmet",null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
