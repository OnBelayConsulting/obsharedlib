/*
 Copyright 2019, OnBelay Consulting Ltd.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.  
 */
package com.onbelay.shared.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author lefeuvrem
 *
 */
public enum CommodityCode {
    CAD  ("CAD"),
	EURO ("EURO"),
	USD  ("USD");

	private final String code;

    private static final Map<String, CommodityCode> lookup
    	= new HashMap<String, CommodityCode>();

    static {
    	for(CommodityCode c : EnumSet.allOf(CommodityCode.class))
         lookup.put(c.code, c);
    }

	private CommodityCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public static CommodityCode lookUp(String code) {
		return lookup.get(code);
	}
}
