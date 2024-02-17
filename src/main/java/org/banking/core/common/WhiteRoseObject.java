package org.banking.core.common;

import java.util.UUID;

public class WhiteRoseObject {

    protected String id = UUID.randomUUID().toString();

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }
}
