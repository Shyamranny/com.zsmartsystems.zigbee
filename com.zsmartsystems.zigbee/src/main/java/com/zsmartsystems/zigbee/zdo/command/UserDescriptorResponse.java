/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoResponse;
import javax.annotation.Generated;
import com.zsmartsystems.zigbee.zdo.ZdoStatus;
import com.zsmartsystems.zigbee.zdo.field.UserDescriptor;

/**
 * User Descriptor Response value object class.
 * <p>
 * The User_Desc_rsp is generated by a remote device in response to a
 * User_Desc_req directed to the remote device. This command shall be unicast to
 * the originator of the User_Desc_req command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */

@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2019-01-03T22:58:57Z")
public class UserDescriptorResponse extends ZdoResponse {
    /**
     * NWKAddrOfInterest command message field.
     */
    private Integer nwkAddrOfInterest;

    /**
     * Length command message field.
     */
    private Integer length;

    /**
     * UserDescriptor command message field.
     */
    private UserDescriptor userDescriptor;

    /**
     * Default constructor.
     */
    public UserDescriptorResponse() {
        clusterId = 0x8011;
    }

    /**
     * Gets NWKAddrOfInterest.
     *
     * @return the NWKAddrOfInterest
     */
    public Integer getNwkAddrOfInterest() {
        return nwkAddrOfInterest;
    }

    /**
     * Sets NWKAddrOfInterest.
     *
     * @param nwkAddrOfInterest the NWKAddrOfInterest
     */
    public void setNwkAddrOfInterest(final Integer nwkAddrOfInterest) {
        this.nwkAddrOfInterest = nwkAddrOfInterest;
    }

    /**
     * Gets Length.
     *
     * @return the Length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets Length.
     *
     * @param length the Length
     */
    public void setLength(final Integer length) {
        this.length = length;
    }

    /**
     * Gets UserDescriptor.
     *
     * @return the UserDescriptor
     */
    public UserDescriptor getUserDescriptor() {
        return userDescriptor;
    }

    /**
     * Sets UserDescriptor.
     *
     * @param userDescriptor the UserDescriptor
     */
    public void setUserDescriptor(final UserDescriptor userDescriptor) {
        this.userDescriptor = userDescriptor;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(status, ZclDataType.ZDO_STATUS);
        serializer.serialize(nwkAddrOfInterest, ZclDataType.NWK_ADDRESS);
        serializer.serialize(length, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(userDescriptor, ZclDataType.USER_DESCRIPTOR);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        status = (ZdoStatus) deserializer.deserialize(ZclDataType.ZDO_STATUS);
        if (status != ZdoStatus.SUCCESS) {
            // Don't read the full response if we have an error
            return;
        }
        nwkAddrOfInterest = (Integer) deserializer.deserialize(ZclDataType.NWK_ADDRESS);
        length = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        userDescriptor = (UserDescriptor) deserializer.deserialize(ZclDataType.USER_DESCRIPTOR);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(148);
        builder.append("UserDescriptorResponse [");
        builder.append(super.toString());
        builder.append(", status=");
        builder.append(status);
        builder.append(", nwkAddrOfInterest=");
        builder.append(nwkAddrOfInterest);
        builder.append(", length=");
        builder.append(length);
        builder.append(", userDescriptor=");
        builder.append(userDescriptor);
        builder.append(']');
        return builder.toString();
    }

}
