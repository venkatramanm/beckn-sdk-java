package in.succinct.beckn;

import org.json.simple.JSONObject;

import java.util.Date;

public class Subscriber extends BecknObject{
    public static final String SUBSCRIBER_TYPE_BAP = "BAP";
    public static final String SUBSCRIBER_TYPE_BPP = "BPP";
    public static final String SUBSCRIBER_TYPE_LOCAL_REGISTRY = "LREG";
    public static final String SUBSCRIBER_TYPE_COUNTRY_REGISTRY = "CREG";
    public static final String SUBSCRIBER_TYPE_ROOT_REGISTRY = "RREG";
    public static final String SUBSCRIBER_TYPE_BG = "BG";
    public static final String SUBSCRIBER_STATUS_SUBSCRIBED = "SUBSCRIBED";

    public Subscriber() {
    }

    public Subscriber(String payload) {
        super(payload);
    }

    public Subscriber(JSONObject object) {
        super(object);
    }


    public String getCountry(){
        return get("country");
    }
    public void setCountry(String country){
        set("country",country);
    }
    public String getCity(){
        return get("city");
    }
    public void setCity(String city){
        set("city",city);
    }

    public String getDomain(){
        return get("domain");
    }
    public void setDomain(String domain){
        set("domain",domain);
    }
    public String getStatus(){
        return get("status");
    }
    public void setStatus(String status){
        set("status",status);
    }

    public String getType(){
        return get("type");
    }
    public void setType(String type){
        set("type",type);
    }

    public String getSubscriberId(){
        return get("subscriber_id");
    }
    public void setSubscriberId(String subscriber_id){
        set("subscriber_id",subscriber_id);
    }

    public String getSubscriberUrl(){
        return get("subscriber_url");
    }
    public void setSubscriberUrl(String subscriber_url){
        set("subscriber_url",subscriber_url);
    }

    public String getUniqueKeyId(){
        return get("unique_key_id");
    }
    public void setUniqueKeyId(String unique_key_id){
        set("unique_key_id",unique_key_id);
    }

    public String getSigningPublicKey(){
        return get("signing_public_key");
    }
    public void setSigningPublicKey(String signing_public_key){
        set("signing_public_key",signing_public_key);
    }
    public String getEncrPublicKey(){
        return get("encr_public_key");
    }
    public void setEncrPublicKey(String encr_public_key){
        set("encr_public_key",encr_public_key);
    }

    public String getNonce(){
        return get("nonce");
    }
    public void setNonce(String nonce){
        set("nonce",nonce);
    }

    public Date getValidFrom(){
        return getDate("valid_from",TIMESTAMP_FORMAT);
    }
    public void setValidFrom(Date valid_from){
        set("valid_from",valid_from,TIMESTAMP_FORMAT);
    }
    public Date getValidTo(){
        return getDate("valid_to",TIMESTAMP_FORMAT);
    }
    public void setValidTo(Date valid_to){
        set("valid_to",valid_to,TIMESTAMP_FORMAT);
    }

}
