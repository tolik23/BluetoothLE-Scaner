package com.liutorovichgmail.anatoliy.ble;

import java.util.HashMap;

/**
 * Created by ToLik on 29.05.2017.
 */

public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        attributes.put("00001530-0000-3512-2118-0009af100700", "Weight Service");
        attributes.put("0000fee0-0000-1000-8000-00805f9b34fb", "Mili Service");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put("2A29", "Manufacturer Name");
        attributes.put("2A24", "Model Number");
        attributes.put("2A0F", "Local Time Information");
        attributes.put("2A2B", "Current Time");
        attributes.put("00002a37-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
        attributes.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb", "PNP ID");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preffered Connection");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        attributes.put("00002a46-0000-1000-8000-00805f9b34fb", "New Alert");
        attributes.put("00002a44-0000-1000-8000-00805f9b34fb", "Alert Notification Control");
        attributes.put("00002a06-0000-1000-8000-00805f9b34fb", "Alert Level");


    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
