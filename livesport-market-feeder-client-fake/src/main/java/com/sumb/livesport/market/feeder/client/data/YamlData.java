package com.sumb.livesport.market.feeder.client.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public abstract class YamlData  {

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this).toString();
    }
}
