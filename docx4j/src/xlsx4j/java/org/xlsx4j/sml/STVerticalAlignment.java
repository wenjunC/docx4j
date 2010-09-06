/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VerticalAlignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VerticalAlignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="justify"/>
 *     &lt;enumeration value="distributed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_VerticalAlignment")
@XmlEnum
public enum STVerticalAlignment {


    /**
     * Align Top
     * 
     */
    @XmlEnumValue("top")
    TOP("top"),

    /**
     * Centered Vertical Alignment
     * 
     */
    @XmlEnumValue("center")
    CENTER("center"),

    /**
     * Aligned To Bottom
     * 
     */
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),

    /**
     * Justified Vertically
     * 
     */
    @XmlEnumValue("justify")
    JUSTIFY("justify"),

    /**
     * Distributed Vertical Alignment
     * 
     */
    @XmlEnumValue("distributed")
    DISTRIBUTED("distributed");
    private final String value;

    STVerticalAlignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVerticalAlignment fromValue(String v) {
        for (STVerticalAlignment c: STVerticalAlignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
