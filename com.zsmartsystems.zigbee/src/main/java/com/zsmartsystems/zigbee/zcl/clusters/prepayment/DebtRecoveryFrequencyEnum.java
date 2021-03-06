/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.prepayment;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Debt Recovery Frequency value enumeration.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-02-09T15:28:08Z")
public enum DebtRecoveryFrequencyEnum {

    /**
     * Per Hour
     */
    PER_HOUR(0x0000),

    /**
     * Per Day
     */
    PER_DAY(0x0001),

    /**
     * Per Week
     */
    PER_WEEK(0x0002),

    /**
     * Per Month
     */
    PER_MONTH(0x0003),

    /**
     * Per Quarter
     */
    PER_QUARTER(0x0004);

    /**
     * A mapping between the integer code and its corresponding DebtRecoveryFrequencyEnum type to facilitate lookup by value.
     */
    private static Map<Integer, DebtRecoveryFrequencyEnum> idMap;

    static {
        idMap = new HashMap<Integer, DebtRecoveryFrequencyEnum>();
        for (DebtRecoveryFrequencyEnum enumValue : values()) {
            idMap.put(enumValue.key, enumValue);
        }
    }

    private final int key;

    private DebtRecoveryFrequencyEnum(final int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static DebtRecoveryFrequencyEnum getByValue(final int value) {
        return idMap.get(value);
    }
}
