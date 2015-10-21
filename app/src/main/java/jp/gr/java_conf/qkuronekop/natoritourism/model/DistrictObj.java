package jp.gr.java_conf.qkuronekop.natoritourism.model;

import java.util.List;

/**
 * Created by satomitanaka on 15/10/20.
 */
public class DistrictObj {

    private List<DistrictData> districtData;

    public List<DistrictData> getDistrictData() {
        return districtData;
    }

    public void setDistrictData(List<DistrictData> districtData) {
        this.districtData = districtData;
    }

    public class DistrictData {
        /** コード */
        private String code;

        /** 地区 */
        private String district;

        /** 観光時期 */
        private String touristSeason;

        /** 名称 */
        private String name;

        /** 名称ふりがな */
        private String phoneticName;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getTouristSeason() {
            return touristSeason;
        }

        public void setTouristSeason(String touristSeason) {
            this.touristSeason = touristSeason;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneticName() {
            return phoneticName;
        }

        public void setPhoneticName(String phoneticName) {
            this.phoneticName = phoneticName;
        }
    }

}
