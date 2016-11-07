package com.thinkerjet.network;

import java.util.List;

/**
 * Created by Z on 2016/10/30.
 */

public class BannerListData {


    private String desc;
    private int err;
    private List<ListBean> list;



    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private String BANNER_CODE;
        private String BANNER_DESC;
        private String BANNER_HTML;
        private String BANNER_KIND;
        private String BANNER_KIND_NAME;
        private String BANNER_LOGO;
        private String BANNER_NAME;
        private int BANNER_ORDER;
        private String BANNER_TITLE;
        private String BANNER_TYPE;
        private String BANNER_TYPE_NAME;
        private long CREATE_DATE;
        private String CREATE_DATE_STR;
        private String CREATE_DEPART;
        private String CREATE_PERSON;
        private int DISABLED;
        private String DISABLED_NAME;
        private int ID;
        private String REMARK;
        private long UPDATE_DATE;
        private String UPDATE_DATE_STR;
        private String UPDATE_PERSON;

        public String getBANNER_CODE() {
            return BANNER_CODE;
        }

        public void setBANNER_CODE(String BANNER_CODE) {
            this.BANNER_CODE = BANNER_CODE;
        }

        public String getBANNER_DESC() {
            return BANNER_DESC;
        }

        public void setBANNER_DESC(String BANNER_DESC) {
            this.BANNER_DESC = BANNER_DESC;
        }

        public String getBANNER_HTML() {
            return BANNER_HTML;
        }

        public void setBANNER_HTML(String BANNER_HTML) {
            this.BANNER_HTML = BANNER_HTML;
        }

        public String getBANNER_KIND() {
            return BANNER_KIND;
        }

        public void setBANNER_KIND(String BANNER_KIND) {
            this.BANNER_KIND = BANNER_KIND;
        }

        public String getBANNER_KIND_NAME() {
            return BANNER_KIND_NAME;
        }

        public void setBANNER_KIND_NAME(String BANNER_KIND_NAME) {
            this.BANNER_KIND_NAME = BANNER_KIND_NAME;
        }

        public String getBANNER_LOGO() {
            return BANNER_LOGO;
        }

        public void setBANNER_LOGO(String BANNER_LOGO) {
            this.BANNER_LOGO = BANNER_LOGO;
        }

        public String getBANNER_NAME() {
            return BANNER_NAME;
        }

        public void setBANNER_NAME(String BANNER_NAME) {
            this.BANNER_NAME = BANNER_NAME;
        }

        public int getBANNER_ORDER() {
            return BANNER_ORDER;
        }

        public void setBANNER_ORDER(int BANNER_ORDER) {
            this.BANNER_ORDER = BANNER_ORDER;
        }

        public String getBANNER_TITLE() {
            return BANNER_TITLE;
        }

        public void setBANNER_TITLE(String BANNER_TITLE) {
            this.BANNER_TITLE = BANNER_TITLE;
        }

        public String getBANNER_TYPE() {
            return BANNER_TYPE;
        }

        public void setBANNER_TYPE(String BANNER_TYPE) {
            this.BANNER_TYPE = BANNER_TYPE;
        }

        public String getBANNER_TYPE_NAME() {
            return BANNER_TYPE_NAME;
        }

        public void setBANNER_TYPE_NAME(String BANNER_TYPE_NAME) {
            this.BANNER_TYPE_NAME = BANNER_TYPE_NAME;
        }

        public long getCREATE_DATE() {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(long CREATE_DATE) {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getCREATE_DATE_STR() {
            return CREATE_DATE_STR;
        }

        public void setCREATE_DATE_STR(String CREATE_DATE_STR) {
            this.CREATE_DATE_STR = CREATE_DATE_STR;
        }

        public String getCREATE_DEPART() {
            return CREATE_DEPART;
        }

        public void setCREATE_DEPART(String CREATE_DEPART) {
            this.CREATE_DEPART = CREATE_DEPART;
        }

        public String getCREATE_PERSON() {
            return CREATE_PERSON;
        }

        public void setCREATE_PERSON(String CREATE_PERSON) {
            this.CREATE_PERSON = CREATE_PERSON;
        }

        public int getDISABLED() {
            return DISABLED;
        }

        public void setDISABLED(int DISABLED) {
            this.DISABLED = DISABLED;
        }

        public String getDISABLED_NAME() {
            return DISABLED_NAME;
        }

        public void setDISABLED_NAME(String DISABLED_NAME) {
            this.DISABLED_NAME = DISABLED_NAME;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getREMARK() {
            return REMARK;
        }

        public void setREMARK(String REMARK) {
            this.REMARK = REMARK;
        }

        public long getUPDATE_DATE() {
            return UPDATE_DATE;
        }

        public void setUPDATE_DATE(long UPDATE_DATE) {
            this.UPDATE_DATE = UPDATE_DATE;
        }

        public String getUPDATE_DATE_STR() {
            return UPDATE_DATE_STR;
        }

        public void setUPDATE_DATE_STR(String UPDATE_DATE_STR) {
            this.UPDATE_DATE_STR = UPDATE_DATE_STR;
        }

        public String getUPDATE_PERSON() {
            return UPDATE_PERSON;
        }

        public void setUPDATE_PERSON(String UPDATE_PERSON) {
            this.UPDATE_PERSON = UPDATE_PERSON;
        }
    }
}
