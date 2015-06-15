package com.sumb.livesport.market.feeder.domain.id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public abstract class IdEntity<T> implements Serializable {

    private final static long serialVersionUID = 1L;

    private T id;

    protected IdEntity(T id) {
        this.id = Objects.requireNonNull(id, "id");
    }

    public T getId() {
        return id;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        IdEntity<T> rhs = getClass().cast(obj);
        return new EqualsBuilder()
                .append(this.id,rhs.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.id).toHashCode();
    }
}
