package com.tvd12.ezyfox.sfs2x.entities.impl;

import com.tvd12.ezyfox.core.entities.ApiMessage;
import com.tvd12.ezyfox.core.entities.ApiRoom;

import lombok.Setter;

/**
 * @see ApiBaseMessageImpl
 * @see ApiMessage
 * 
 * @author tavandung12
 * Created on May 26, 2016
 *
 */
public class ApiMessageImpl extends ApiBaseMessageImpl implements ApiMessage {

    @Setter
    private ApiRoom room;
    
    /* (non-Javadoc)
     * @see com.tvd12.ezyfox.core.entities.ApiMessage#room()
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T extends ApiRoom> T room() {
        return (T) room;
    }

    

}
