package com.thinkerjet.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Z on 2016/11/6.
 */

public class JokeListData {


    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"22":"情话大全","23":"回味段子","24":"饮食男女","25":"歉意合集","26":"轻笑话接口","27":"古惑仔大全","28":"人与动物","29":"幽默英语","30":"惊悚大全","31":"简捷笑话","10":"校园稚语","32":"厕所段子","11":"名言警句","33":"神跟帖","12":"祈福话语","13":"童语无忌","14":"人生格言","15":"夫妻对语","16":"幽默段子","17":"轻松幽默","18":"问候大全","19":"搞笑段子","1":"精彩猜谜","2":"歇后语大全","3":"打油诗大全","4":"脑筋急转弯","5":"笑话大全","6":"创意短语","7":"笑口常开","8":"囧人糗事","9":"冷场段子","20":"名人名言","21":"绕口令"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * 22 : 情话大全
         * 23 : 回味段子
         * 24 : 饮食男女
         * 25 : 歉意合集
         * 26 : 轻笑话接口
         * 27 : 古惑仔大全
         * 28 : 人与动物
         * 29 : 幽默英语
         * 30 : 惊悚大全
         * 31 : 简捷笑话
         * 10 : 校园稚语
         * 32 : 厕所段子
         * 11 : 名言警句
         * 33 : 神跟帖
         * 12 : 祈福话语
         * 13 : 童语无忌
         * 14 : 人生格言
         * 15 : 夫妻对语
         * 16 : 幽默段子
         * 17 : 轻松幽默
         * 18 : 问候大全
         * 19 : 搞笑段子
         * 1 : 精彩猜谜
         * 2 : 歇后语大全
         * 3 : 打油诗大全
         * 4 : 脑筋急转弯
         * 5 : 笑话大全
         * 6 : 创意短语
         * 7 : 笑口常开
         * 8 : 囧人糗事
         * 9 : 冷场段子
         * 20 : 名人名言
         * 21 : 绕口令
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            @SerializedName("22")
            private String value22;
            @SerializedName("23")
            private String value23;
            @SerializedName("24")
            private String value24;
            @SerializedName("25")
            private String value25;
            @SerializedName("26")
            private String value26;
            @SerializedName("27")
            private String value27;
            @SerializedName("28")
            private String value28;
            @SerializedName("29")
            private String value29;
            @SerializedName("30")
            private String value30;
            @SerializedName("31")
            private String value31;
            @SerializedName("10")
            private String value10;
            @SerializedName("32")
            private String value32;
            @SerializedName("11")
            private String value11;
            @SerializedName("33")
            private String value33;
            @SerializedName("12")
            private String value12;
            @SerializedName("13")
            private String value13;
            @SerializedName("14")
            private String value14;
            @SerializedName("15")
            private String value15;
            @SerializedName("16")
            private String value16;
            @SerializedName("17")
            private String value17;
            @SerializedName("18")
            private String value18;
            @SerializedName("19")
            private String value19;
            @SerializedName("1")
            private String value1;
            @SerializedName("2")
            private String value2;
            @SerializedName("3")
            private String value3;
            @SerializedName("4")
            private String value4;
            @SerializedName("5")
            private String value5;
            @SerializedName("6")
            private String value6;
            @SerializedName("7")
            private String value7;
            @SerializedName("8")
            private String value8;
            @SerializedName("9")
            private String value9;
            @SerializedName("20")
            private String value20;
            @SerializedName("21")
            private String value21;

            public String getValue22() {
                return value22;
            }

            public void setValue22(String value22) {
                this.value22 = value22;
            }

            public String getValue23() {
                return value23;
            }

            public void setValue23(String value23) {
                this.value23 = value23;
            }

            public String getValue24() {
                return value24;
            }

            public void setValue24(String value24) {
                this.value24 = value24;
            }

            public String getValue25() {
                return value25;
            }

            public void setValue25(String value25) {
                this.value25 = value25;
            }

            public String getValue26() {
                return value26;
            }

            public void setValue26(String value26) {
                this.value26 = value26;
            }

            public String getValue27() {
                return value27;
            }

            public void setValue27(String value27) {
                this.value27 = value27;
            }

            public String getValue28() {
                return value28;
            }

            public void setValue28(String value28) {
                this.value28 = value28;
            }

            public String getValue29() {
                return value29;
            }

            public void setValue29(String value29) {
                this.value29 = value29;
            }

            public String getValue30() {
                return value30;
            }

            public void setValue30(String value30) {
                this.value30 = value30;
            }

            public String getValue31() {
                return value31;
            }

            public void setValue31(String value31) {
                this.value31 = value31;
            }

            public String getValue10() {
                return value10;
            }

            public void setValue10(String value10) {
                this.value10 = value10;
            }

            public String getValue32() {
                return value32;
            }

            public void setValue32(String value32) {
                this.value32 = value32;
            }

            public String getValue11() {
                return value11;
            }

            public void setValue11(String value11) {
                this.value11 = value11;
            }

            public String getValue33() {
                return value33;
            }

            public void setValue33(String value33) {
                this.value33 = value33;
            }

            public String getValue12() {
                return value12;
            }

            public void setValue12(String value12) {
                this.value12 = value12;
            }

            public String getValue13() {
                return value13;
            }

            public void setValue13(String value13) {
                this.value13 = value13;
            }

            public String getValue14() {
                return value14;
            }

            public void setValue14(String value14) {
                this.value14 = value14;
            }

            public String getValue15() {
                return value15;
            }

            public void setValue15(String value15) {
                this.value15 = value15;
            }

            public String getValue16() {
                return value16;
            }

            public void setValue16(String value16) {
                this.value16 = value16;
            }

            public String getValue17() {
                return value17;
            }

            public void setValue17(String value17) {
                this.value17 = value17;
            }

            public String getValue18() {
                return value18;
            }

            public void setValue18(String value18) {
                this.value18 = value18;
            }

            public String getValue19() {
                return value19;
            }

            public void setValue19(String value19) {
                this.value19 = value19;
            }

            public String getValue1() {
                return value1;
            }

            public void setValue1(String value1) {
                this.value1 = value1;
            }

            public String getValue2() {
                return value2;
            }

            public void setValue2(String value2) {
                this.value2 = value2;
            }

            public String getValue3() {
                return value3;
            }

            public void setValue3(String value3) {
                this.value3 = value3;
            }

            public String getValue4() {
                return value4;
            }

            public void setValue4(String value4) {
                this.value4 = value4;
            }

            public String getValue5() {
                return value5;
            }

            public void setValue5(String value5) {
                this.value5 = value5;
            }

            public String getValue6() {
                return value6;
            }

            public void setValue6(String value6) {
                this.value6 = value6;
            }

            public String getValue7() {
                return value7;
            }

            public void setValue7(String value7) {
                this.value7 = value7;
            }

            public String getValue8() {
                return value8;
            }

            public void setValue8(String value8) {
                this.value8 = value8;
            }

            public String getValue9() {
                return value9;
            }

            public void setValue9(String value9) {
                this.value9 = value9;
            }

            public String getValue20() {
                return value20;
            }

            public void setValue20(String value20) {
                this.value20 = value20;
            }

            public String getValue21() {
                return value21;
            }

            public void setValue21(String value21) {
                this.value21 = value21;
            }
        }
    }
}
