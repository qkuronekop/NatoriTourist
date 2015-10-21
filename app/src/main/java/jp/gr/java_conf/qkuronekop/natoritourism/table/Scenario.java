package jp.gr.java_conf.qkuronekop.natoritourism.table;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by tanakasatomi on 2015/10/21.
 */
@Table(name = "Scenarios")
public class Scenario extends Model {

  @Column(name = "title")
  public String title;

  @Column(name = "dispFlag")
  public int dispFlag;
}
