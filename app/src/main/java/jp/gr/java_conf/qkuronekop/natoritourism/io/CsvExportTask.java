package jp.gr.java_conf.qkuronekop.natoritourism.io;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import jp.gr.java_conf.qkuronekop.natoritourism.model.NatoriData;

/**
 * CSVファイルを開きます。
 * Created by satomitanaka on 15/09/17.
 */
public class CsvExportTask {

    private Context context;

    public CsvExportTask(Context context) {
        this.context = context;
    }

    /**
     * CSVをパースし、{@Link NatoriData}にして返す
     * @return List<NatoriData>
     */
    public List<NatoriData> getNatoriDataList() {
        return getCsv();
    }

    private List<NatoriData> getCsv() {
        InputStream is = null;
        BufferedReader br = null;
        List<NatoriData> natoriDataList = new ArrayList<>();
        try {
            try {
                is = context.getAssets().open("natori_tourism.csv");
                br = new BufferedReader(new InputStreamReader(is));
                String str = "";
                while ((str = br.readLine()) != null) {
                    natoriDataList.add(getNatoriData(str));
                }
            } finally {
                if (is != null) {
                    is.close();
                }
                if (br != null) {
                    br.close();
                }
            }
        } catch (IOException e) {
            Log.e("CSV READ ERROR  IOException", e.getMessage());
        }

        return natoriDataList;
    }

    private NatoriData getNatoriData(final String data) {
        StringTokenizer st = new StringTokenizer(data, ",");
        NatoriData natoriData = new NatoriData();
        natoriData.setCode(st.nextToken());
        natoriData.setDistrict(st.nextToken());
        natoriData.setTouristSeason(st.nextToken());
        natoriData.setName(st.nextToken());
        natoriData.setPhoneticName(st.nextToken());
        natoriData.setContentAndFeatures(st.nextToken());
        natoriData.setTitle(st.nextToken());
        natoriData.setText(st.nextToken());
        natoriData.setTitle2(st.nextToken());
        natoriData.setText2(st.nextToken());
        natoriData.setTitle3(st.nextToken());
        natoriData.setText3(st.nextToken());
        natoriData.setTitle4(st.nextToken());
        natoriData.setText4(st.nextToken());
        natoriData.setTitle5(st.nextToken());
        natoriData.setText5(st.nextToken());
        natoriData.setTitle6(st.nextToken());
        natoriData.setText6(st.nextToken());
        natoriData.setTitle7(st.nextToken());
        natoriData.setText7(st.nextToken());
        natoriData.setTitle8(st.nextToken());
        natoriData.setText8(st.nextToken());
        natoriData.setHp(st.nextToken());
        natoriData.setReferences(st.nextToken());
        natoriData.setNotes(st.nextToken());
        natoriData.setInformationTitle(st.nextToken());
        natoriData.setInformationText(st.nextToken());
        natoriData.setInformationTitle2(st.nextToken());
        natoriData.setInformationText2(st.nextToken());
        natoriData.setInformationTitle3(st.nextToken());
        natoriData.setInformationText3(st.nextToken());
        natoriData.setParkingGarage(st.nextToken());
        natoriData.setAccessCar(st.nextToken());
        natoriData.setAccessTrain(st.nextToken());
        natoriData.setAccessBus(st.nextToken());
        natoriData.setLocation(st.nextToken());
        natoriData.setUsName(st.nextToken());
        natoriData.setContactPhoneNumber(st.nextToken());
        natoriData.setAreaAttractions(st.nextToken());
        natoriData.setImg1(st.nextToken());
        natoriData.setImg2(st.nextToken());
        natoriData.setImg3(st.nextToken());
        natoriData.setImg4(st.nextToken());
        natoriData.setImg5(st.nextToken());
        natoriData.setImg6(st.nextToken());
        natoriData.setImg6(st.nextToken());
        natoriData.setPhoto1(st.nextToken());
        natoriData.setPhoto2(st.nextToken());
        natoriData.setPhoto3(st.nextToken());
        natoriData.setPhoto4(st.nextToken());
        natoriData.setPhoto5(st.nextToken());
        natoriData.setPhoto6(st.nextToken());
        natoriData.setPhoto7(st.nextToken());
        return natoriData;
    }
}
