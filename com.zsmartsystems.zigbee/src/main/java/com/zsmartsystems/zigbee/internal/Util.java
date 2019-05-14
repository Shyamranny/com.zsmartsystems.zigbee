package com.zsmartsystems.zigbee.internal;

    public class Util {

        public static Integer readInteger(Object o){

            if (null == o){
                return 0;
            }

            if (o instanceof Double){
                return ((Double)o).intValue();
            }

            return (Integer)o;
        }
    }
