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

public class DescribePlayErrorCodeDetailInfoListRequest  extends AbstractModel{

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
    * 查询粒度：
1-1分钟粒度。
    */
    @SerializedName("Granularity")
    @Expose
    private Integer Granularity;

    /**
    * 是，可选值包括”4xx”,”5xx”，支持”4xx,5xx”等这种混合模式。
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 播放域名列表。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

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
     * 获取查询粒度：
1-1分钟粒度。
     * @return Granularity 查询粒度：
1-1分钟粒度。
     */
    public Integer getGranularity() {
        return this.Granularity;
    }

    /**
     * 设置查询粒度：
1-1分钟粒度。
     * @param Granularity 查询粒度：
1-1分钟粒度。
     */
    public void setGranularity(Integer Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * 获取是，可选值包括”4xx”,”5xx”，支持”4xx,5xx”等这种混合模式。
     * @return StatType 是，可选值包括”4xx”,”5xx”，支持”4xx,5xx”等这种混合模式。
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * 设置是，可选值包括”4xx”,”5xx”，支持”4xx,5xx”等这种混合模式。
     * @param StatType 是，可选值包括”4xx”,”5xx”，支持”4xx,5xx”等这种混合模式。
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * 获取播放域名列表。
     * @return PlayDomains 播放域名列表。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * 设置播放域名列表。
     * @param PlayDomains 播放域名列表。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);

    }
}

