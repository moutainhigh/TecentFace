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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteShieldInstancesRequest  extends AbstractModel{

    /**
    * 任务唯一标识ItemId的列表
    */
    @SerializedName("ItemIds")
    @Expose
    private String [] ItemIds;

    /**
     * 获取任务唯一标识ItemId的列表
     * @return ItemIds 任务唯一标识ItemId的列表
     */
    public String [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * 设置任务唯一标识ItemId的列表
     * @param ItemIds 任务唯一标识ItemId的列表
     */
    public void setItemIds(String [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);

    }
}

