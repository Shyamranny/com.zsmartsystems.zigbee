/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoRequest;
import com.zsmartsystems.zigbee.ZigBeeCommand;
import com.zsmartsystems.zigbee.transaction.ZigBeeTransactionMatcher;
import com.zsmartsystems.zigbee.zdo.command.ManagementLeaveResponse;
import javax.annotation.Generated;
import com.zsmartsystems.zigbee.IeeeAddress;

/**
 * Management Leave Request value object class.
 * <p>
 * The Mgmt_Leave_req is generated from a Local Device requesting that a Remote
 * Device leave the network or to request that another device leave the network. The
 * Mgmt_Leave_req is generated by a management application which directs the
 * request to a Remote Device where the NLME-LEAVE.request is to be executed
 * using the parameter supplied by Mgmt_Leave_req.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */

@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-03-14T23:37:27Z")
public class ManagementLeaveRequest extends ZdoRequest implements ZigBeeTransactionMatcher {
    /**
     * DeviceAddress command message field.
     */
    private IeeeAddress deviceAddress;

    /**
     * RemoveChildren_Rejoin command message field.
     */
    private Boolean removeChildrenRejoin;

    /**
     * Default constructor.
     */
    public ManagementLeaveRequest() {
        clusterId = 0x0034;
    }

    /**
     * Gets DeviceAddress.
     *
     * @return the DeviceAddress
     */
    public IeeeAddress getDeviceAddress() {
        return deviceAddress;
    }

    /**
     * Sets DeviceAddress.
     *
     * @param deviceAddress the DeviceAddress
     */
    public void setDeviceAddress(final IeeeAddress deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    /**
     * Gets RemoveChildren_Rejoin.
     *
     * @return the RemoveChildren_Rejoin
     */
    public Boolean getRemoveChildrenRejoin() {
        return removeChildrenRejoin;
    }

    /**
     * Sets RemoveChildren_Rejoin.
     *
     * @param removeChildrenRejoin the RemoveChildren_Rejoin
     */
    public void setRemoveChildrenRejoin(final Boolean removeChildrenRejoin) {
        this.removeChildrenRejoin = removeChildrenRejoin;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(deviceAddress, ZclDataType.IEEE_ADDRESS);
        serializer.serialize(removeChildrenRejoin, ZclDataType.BOOLEAN);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        deviceAddress = (IeeeAddress) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
        removeChildrenRejoin = (Boolean) deserializer.deserialize(ZclDataType.BOOLEAN);
    }

    @Override
    public boolean isTransactionMatch(ZigBeeCommand request, ZigBeeCommand response) {
        if (!(response instanceof ManagementLeaveResponse)) {
            return false;
        }

        return (((ManagementLeaveRequest) request).getDestinationAddress()
                .equals(((ManagementLeaveResponse) response).getSourceAddress()));
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(98);
        builder.append("ManagementLeaveRequest [");
        builder.append(super.toString());
        builder.append(", deviceAddress=");
        builder.append(deviceAddress);
        builder.append(", removeChildrenRejoin=");
        builder.append(removeChildrenRejoin);
        builder.append(']');
        return builder.toString();
    }

}
