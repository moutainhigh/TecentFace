/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProIspPlaySumInfoListRequest  extends AbstractModel{

    /**
    * 起始时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计的类型，可选值包括”Province”，”Isp”。
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 不填则为总体数据。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * 页号，
范围是[1,1000]，
默认值是1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数，范围是[1,1000]，
默认值是20。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 获取起始时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
     * @return StartTime 起始时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置起始时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
     * @param StartTime 起始时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     * @return EndTime 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     * @param EndTime 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM:SS。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取统计的类型，可选值包括”Province”，”Isp”。
     * @return StatType 统计的类型，可选值包括”Province”，”Isp”。
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * 设置统计的类型，可选值包括”Province”，”Isp”。
     * @param StatType 统计的类型，可选值包括”Province”，”Isp”。
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * 获取不填则为总体数据。
     * @return PlayDomains 不填则为总体数据。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * 设置不填则为总体数据。
     * @param PlayDomains 不填则为总体数据。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * 获取页号，
范围是[1,1000]，
默认值是1。
     * @return PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页号，
范围是[1,1000]，
默认值是1。
     * @param PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页个数，范围是[1,1000]，
默认值是20。
     * @return PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页个数，范围是[1,1000]，
默认值是20。
     * @param PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

