/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.metering;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.clusters.metering.SnapshotSchedulePayload;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Schedule Snapshot value object class.
 * <p>
 * Cluster: <b>Metering</b>. Command ID 0x04 is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Metering cluster.
 * <p>
 * This command is used to set up a schedule of when the device shall create snapshot data.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-04-14T08:41:54Z")
public class ScheduleSnapshot extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0702;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x04;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the snapshot command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.This is
     * required when the snapshot data needs to be transmitted over several messages,
     * allowing for the client to easily identify the set of messages that form a group.
     */
    private Integer issuerEventId;

    /**
     * Command Index command message field.
     * <p>
     * The CommandIndex is used to count the payload fragments for the case where the entire
     * payload does not fit into one message. The CommandIndex starts at 0 and is incremented
     * for each fragment belonging to the same command.
     */
    private Integer commandIndex;

    /**
     * Total Number of Commands command message field.
     * <p>
     * In the case where the entire payload does not fit into one message, the Total Number of
     * Commands field indicates the total number of sub-commands in the message.
     */
    private Integer totalNumberOfCommands;

    /**
     * Snapshot Schedule Payload command message field.
     */
    private SnapshotSchedulePayload snapshotSchedulePayload;

    /**
     * Default constructor.
     */
    public ScheduleSnapshot() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the snapshot command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.This is
     * required when the snapshot data needs to be transmitted over several messages,
     * allowing for the client to easily identify the set of messages that form a group.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the snapshot command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.This is
     * required when the snapshot data needs to be transmitted over several messages,
     * allowing for the client to easily identify the set of messages that form a group.
     *
     * @param issuerEventId the Issuer Event ID
     */
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Command Index.
     * <p>
     * The CommandIndex is used to count the payload fragments for the case where the entire
     * payload does not fit into one message. The CommandIndex starts at 0 and is incremented
     * for each fragment belonging to the same command.
     *
     * @return the Command Index
     */
    public Integer getCommandIndex() {
        return commandIndex;
    }

    /**
     * Sets Command Index.
     * <p>
     * The CommandIndex is used to count the payload fragments for the case where the entire
     * payload does not fit into one message. The CommandIndex starts at 0 and is incremented
     * for each fragment belonging to the same command.
     *
     * @param commandIndex the Command Index
     */
    public void setCommandIndex(final Integer commandIndex) {
        this.commandIndex = commandIndex;
    }

    /**
     * Gets Total Number of Commands.
     * <p>
     * In the case where the entire payload does not fit into one message, the Total Number of
     * Commands field indicates the total number of sub-commands in the message.
     *
     * @return the Total Number of Commands
     */
    public Integer getTotalNumberOfCommands() {
        return totalNumberOfCommands;
    }

    /**
     * Sets Total Number of Commands.
     * <p>
     * In the case where the entire payload does not fit into one message, the Total Number of
     * Commands field indicates the total number of sub-commands in the message.
     *
     * @param totalNumberOfCommands the Total Number of Commands
     */
    public void setTotalNumberOfCommands(final Integer totalNumberOfCommands) {
        this.totalNumberOfCommands = totalNumberOfCommands;
    }

    /**
     * Gets Snapshot Schedule Payload.
     *
     * @return the Snapshot Schedule Payload
     */
    public SnapshotSchedulePayload getSnapshotSchedulePayload() {
        return snapshotSchedulePayload;
    }

    /**
     * Sets Snapshot Schedule Payload.
     *
     * @param snapshotSchedulePayload the Snapshot Schedule Payload
     */
    public void setSnapshotSchedulePayload(final SnapshotSchedulePayload snapshotSchedulePayload) {
        this.snapshotSchedulePayload = snapshotSchedulePayload;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(commandIndex, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(totalNumberOfCommands, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        snapshotSchedulePayload.serialize(serializer);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        commandIndex = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        totalNumberOfCommands = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        snapshotSchedulePayload = new SnapshotSchedulePayload();
        snapshotSchedulePayload.deserialize(deserializer);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(168);
        builder.append("ScheduleSnapshot [");
        builder.append(super.toString());
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", commandIndex=");
        builder.append(commandIndex);
        builder.append(", totalNumberOfCommands=");
        builder.append(totalNumberOfCommands);
        builder.append(", snapshotSchedulePayload=");
        builder.append(snapshotSchedulePayload);
        builder.append(']');
        return builder.toString();
    }

}