package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthoritiesNameKey is a Querydsl query type for QAuthoritiesNameKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuthoritiesNameKey extends com.mysema.query.sql.RelationalPathBase<QAuthoritiesNameKey> {

    private static final long serialVersionUID = 1401462455;

    public static final QAuthoritiesNameKey authoritiesNameKey = new QAuthoritiesNameKey("authorities_name_key");

    public final StringPath name = createString("name");

    public QAuthoritiesNameKey(String variable) {
        super(QAuthoritiesNameKey.class, forVariable(variable), "public", "authorities_name_key");
    }

    @SuppressWarnings("all")
    public QAuthoritiesNameKey(Path<? extends QAuthoritiesNameKey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "authorities_name_key");
    }

    public QAuthoritiesNameKey(PathMetadata<?> metadata) {
        super(QAuthoritiesNameKey.class, metadata, "public", "authorities_name_key");
    }

}

