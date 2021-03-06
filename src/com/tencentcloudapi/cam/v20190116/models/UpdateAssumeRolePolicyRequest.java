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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAssumeRolePolicyRequest  extends AbstractModel{

    /**
    * 策略文档
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * 获取策略文档
     * @return PolicyDocument 策略文档
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * 设置策略文档
     * @param PolicyDocument 策略文档
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * 获取角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @return RoleId 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * 设置角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleId 角色ID，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * 获取角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @return RoleName 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * 设置角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     * @param RoleName 角色名称，用于指定角色，入参 RoleId 与 RoleName 二选一
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

