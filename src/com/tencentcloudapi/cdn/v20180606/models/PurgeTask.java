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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeTask  extends AbstractModel{

    /**
    * 刷新任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 刷新Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 刷新任务状态，fail表示失败，done表示成功，process表示刷新中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 刷新类型，url表示url刷新，path表示目录刷新。
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * 刷新资源方式，flush代表刷新更新资源，delete代表刷新全部资源。
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
    * 刷新任务提交时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取刷新任务ID。
     * @return TaskId 刷新任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置刷新任务ID。
     * @param TaskId 刷新任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取刷新Url。
     * @return Url 刷新Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置刷新Url。
     * @param Url 刷新Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取刷新任务状态，fail表示失败，done表示成功，process表示刷新中。
     * @return Status 刷新任务状态，fail表示失败，done表示成功，process表示刷新中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置刷新任务状态，fail表示失败，done表示成功，process表示刷新中。
     * @param Status 刷新任务状态，fail表示失败，done表示成功，process表示刷新中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取刷新类型，url表示url刷新，path表示目录刷新。
     * @return PurgeType 刷新类型，url表示url刷新，path表示目录刷新。
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * 设置刷新类型，url表示url刷新，path表示目录刷新。
     * @param PurgeType 刷新类型，url表示url刷新，path表示目录刷新。
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * 获取刷新资源方式，flush代表刷新更新资源，delete代表刷新全部资源。
     * @return FlushType 刷新资源方式，flush代表刷新更新资源，delete代表刷新全部资源。
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * 设置刷新资源方式，flush代表刷新更新资源，delete代表刷新全部资源。
     * @param FlushType 刷新资源方式，flush代表刷新更新资源，delete代表刷新全部资源。
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * 获取刷新任务提交时间
     * @return CreateTime 刷新任务提交时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置刷新任务提交时间
     * @param CreateTime 刷新任务提交时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

