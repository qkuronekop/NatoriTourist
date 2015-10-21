package jp.gr.java_conf.qkuronekop.natoritourism.model;

import java.util.List;

/**
 * Created by satomitanaka on 15/10/20.
 */

public class AreaObj {

    private List<AreaData> areaData;

    public List<AreaData> getAreaData() {
        return areaData;
    }

    public void setAreaData(List<AreaData> areaData) {
        this.areaData = areaData;
    }

    public class AreaData {

        /** コード */
        private String code;

        /** 周辺観光スポット */
        private String areaAttractions;

        /** 画像1：説明 */
        private String img1;

        /** 画像2：説明 */
        private String img2;

        /** ,画像3：説明 */
        private String img3;

        /**  画像4：説明 */
        private String img4;

        /** 画像5：説明 */
        private String img5;

        /** 画像6：説明 */
        private String img6;

        /** 画像7：説明 */
        private String img7;

        /** 写真1：ファイル名 */
        private String photo1;

        /** 写真2：ファイル名 */
        private String photo2;

        /** 写真3：ファイル名 */
        private String photo3;

        /** 写真4：ファイル名 */
        private String photo4;

        /** 写真5：ファイル名 */
        private String photo5;

        /** 写真6：ファイル名 */
        private String photo6;

        /** 写真7：ファイル名 */
        private String photo7;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getAreaAttractions() {
            return areaAttractions;
        }

        public void setAreaAttractions(String areaAttractions) {
            this.areaAttractions = areaAttractions;
        }

        public String getImg1() {
            return img1;
        }

        public void setImg1(String img1) {
            this.img1 = img1;
        }

        public String getImg2() {
            return img2;
        }

        public void setImg2(String img2) {
            this.img2 = img2;
        }

        public String getImg3() {
            return img3;
        }

        public void setImg3(String img3) {
            this.img3 = img3;
        }

        public String getImg4() {
            return img4;
        }

        public void setImg4(String img4) {
            this.img4 = img4;
        }

        public String getImg5() {
            return img5;
        }

        public void setImg5(String img5) {
            this.img5 = img5;
        }

        public String getImg6() {
            return img6;
        }

        public void setImg6(String img6) {
            this.img6 = img6;
        }

        public String getImg7() {
            return img7;
        }

        public void setImg7(String img7) {
            this.img7 = img7;
        }

        public String getPhoto1() {
            return photo1;
        }

        public void setPhoto1(String photo1) {
            this.photo1 = photo1;
        }

        public String getPhoto2() {
            return photo2;
        }

        public void setPhoto2(String photo2) {
            this.photo2 = photo2;
        }

        public String getPhoto3() {
            return photo3;
        }

        public void setPhoto3(String photo3) {
            this.photo3 = photo3;
        }

        public String getPhoto4() {
            return photo4;
        }

        public void setPhoto4(String photo4) {
            this.photo4 = photo4;
        }

        public String getPhoto5() {
            return photo5;
        }

        public void setPhoto5(String photo5) {
            this.photo5 = photo5;
        }

        public String getPhoto6() {
            return photo6;
        }

        public void setPhoto6(String photo6) {
            this.photo6 = photo6;
        }

        public String getPhoto7() {
            return photo7;
        }

        public void setPhoto7(String photo7) {
            this.photo7 = photo7;
        }
    }
}


