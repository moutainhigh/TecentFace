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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerStatisticsRequest  extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计指标名称列表，支持["InBandwidth", "OutBandwidth", "Concurrent", "InPackets", "OutPackets"]
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 监控粒度，目前支持300，3600，86400，单位：秒。
当时间范围<=1d，支持最小粒度300s；
当时间范围<=7d，支持最小粒度3600s；
当时间范围>7d，支持最小粒度86400s。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * 获取监听器ID
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取起始时间
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取统计指标名称列表，支持["InBandwidth", "OutBandwidth", "Concurrent", "InPackets", "OutPackets"]
     * @return MetricNames 统计指标名称列表，支持["InBandwidth", "OutBandwidth", "Concurrent", "InPackets", "OutPackets"]
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * 设置统计指标名称列表，支持["InBandwidth", "OutBandwidth", "Concurrent", "InPackets", "OutPackets"]
     * @param MetricNames 统计指标名称列表，支持["InBandwidth", "OutBandwidth", "Concurrent", "InPackets", "OutPackets"]
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * 获取监控粒度，目前支持300，3600，86400，单位：秒。
当时间范围<=1d，支持最小粒度300s；
当时间范围<=7d，支持最小粒度3600s；
当时间范围>7d，支持最小粒度86400s。
     * @return Granularity 监控粒度，目前支持300，3600，86400，单位：秒。
当时间范围<=1d，支持最小粒度300s；
当时间范围<=7d，支持最小粒度3600s；
当时间范围>7d，支持最小粒度86400s。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * 设置监控粒度，目前支持300，3600，86400，单位：秒。
当时间范围<=1d，支持最小粒度300s；
当时间范围<=7d，支持最小粒度3600s；
当时间范围>7d，支持最小粒度86400s。
     * @param Granularity 监控粒度，目前支持300，3600，86400，单位：秒。
当时间范围<=1d，支持最小粒度300s；
当时间范围<=7d，支持最小粒度3600s；
当时间范围>7d，支持最小粒度86400s。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

