package ph.coreproc.android.uhac3.domain.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by johneris on 26/11/2016.
 */

public class MobileNumberVerification {

    @SerializedName("mobile_no")
    private String mMobileNumber;

    @SerializedName("code")
    private String mVerificationCode;

    public String getMobileNumber() {
        return mMobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        mMobileNumber = mobileNumber;
    }

    public String getVerificationCode() {
        return mVerificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        mVerificationCode = verificationCode;
    }
}
