package jp.gr.java_conf.qkuronekop.natoritourism.model;

/**
 * Created by satomitanaka on 15/10/20.
 */
public class InformationData {

    /** コード */
    private String code;

    /** 関連ＨＰ */
    private String hp;

    /** 参考文献等 */
    private String references;

    /** 注意事項 */
    private String notes;

    /** 現地情報：タイトル */
    private String informationTitle;

    /** 現地情報：本文 */
    private String informationText;

    /** 現地情報：タイトル2 */
    private String informationTitle2;

    /** 現地情報：本文2 */
    private String informationText2;

    /** 現地情報：タイトル3 */
    private String informationTitle3;

    /** 現地情報：本文3 */
    private String informationText3;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInformationTitle() {
        return informationTitle;
    }

    public void setInformationTitle(String informationTitle) {
        this.informationTitle = informationTitle;
    }

    public String getInformationText() {
        return informationText;
    }

    public void setInformationText(String informationText) {
        this.informationText = informationText;
    }

    public String getInformationTitle2() {
        return informationTitle2;
    }

    public void setInformationTitle2(String informationTitle2) {
        this.informationTitle2 = informationTitle2;
    }

    public String getInformationText2() {
        return informationText2;
    }

    public void setInformationText2(String informationText2) {
        this.informationText2 = informationText2;
    }

    public String getInformationTitle3() {
        return informationTitle3;
    }

    public void setInformationTitle3(String informationTitle3) {
        this.informationTitle3 = informationTitle3;
    }

    public String getInformationText3() {
        return informationText3;
    }

    public void setInformationText3(String informationText3) {
        this.informationText3 = informationText3;
    }
}
