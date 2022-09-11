package com.oujiong.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自动填充某些表格字段
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 自动填充创建时间和创建人ID
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        if(metaObject.hasSetter("createTime")){
            //this.strictInsertFill(metaObject,"createTime", ()->LocalDateTime.now(),LocalDateTime.class);
            this.strictInsertFill(metaObject, "createTime", () -> new Date(), Date.class);
        }
    }

    /**
     * 自动填充修改时间和修改人ID
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime")){
            //this.strictUpdateFill(metaObject,"updateTime", ()->LocalDateTime.now(),LocalDateTime.class);
            this.strictUpdateFill(metaObject, "updateTime", () -> new Date(), Date.class);
        }
    }
}
