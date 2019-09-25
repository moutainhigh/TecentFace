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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoOpenProVersionConfigRequest  extends AbstractModel{

    /**
    * 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     * @return Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     * @param Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

