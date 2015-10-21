package jp.gr.java_conf.qkuronekop.natoritourism.model;

import java.util.List;

/**
 * Created by satomitanaka on 15/10/21.
 */
public class AccessObj {

    private List<AccessData> accessData;

    public List<AccessData> getAccessData() {
        return accessData;
    }

    public void setAccessData(List<AccessData> accessData) {
        this.accessData = accessData;
    }

    public class AccessData {
        /** コード */
        private String code;
        /** 駐車場 */
        private String parkingGarage;

        /** 交通アクセス：車 */
        private String accessCar;

        /** 交通アクセス：電車 */
        private String accessTrain;

        /** 交通アクセス：バス */
        private String accessBus;

        /** 所在地 */
        private String location;

        /** 問合せ：名称 */
        private String usName;

        /** 問合せ：電話番号 */
        private String contactPhoneNumber;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getParkingGarage() {
            return parkingGarage;
        }

        public void setParkingGarage(String parkingGarage) {
            this.parkingGarage = parkingGarage;
        }

        public String getAccessCar() {
            return accessCar;
        }

        public void setAccessCar(String accessCar) {
            this.accessCar = accessCar;
        }

        public String getAccessTrain() {
            return accessTrain;
        }

        public void setAccessTrain(String accessTrain) {
            this.accessTrain = accessTrain;
        }

        public String getAccessBus() {
            return accessBus;
        }

        public void setAccessBus(String accessBus) {
            this.accessBus = accessBus;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getUsName() {
            return usName;
        }

        public void setUsName(String usName) {
            this.usName = usName;
        }

        public String getContactPhoneNumber() {
            return contactPhoneNumber;
        }

        public void setContactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
        }
    }
}
