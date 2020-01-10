package com.jz.emm.wx.model;

public class WeixinConfig {

    private String corpid;
    private String accessToken;
    private String gzhAccessToken;
    private String jsapiTicket;
    private String communicationToken;//通讯录token


    public String getCorpid() {
        return corpid;
    }
    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getJsapiTicket() {
        return jsapiTicket;
    }
    public void setJsapiTicket(String jsapiTicket) {
        this.jsapiTicket = jsapiTicket;
    }
    public String getGzhAccessToken() {
        return gzhAccessToken;
    }
    public void setGzhAccessToken(String gzhAccessToken) {
        this.gzhAccessToken = gzhAccessToken;
    }
    public String getCommunicationToken() {
        return communicationToken;
    }
    public void setCommunicationToken(String communicationToken) {
        this.communicationToken = communicationToken;
    }


}
