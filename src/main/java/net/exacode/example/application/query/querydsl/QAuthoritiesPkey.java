package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthoritiesPkey is a Querydsl query type for QAuthoritiesPkey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QAuthoritiesPkey extends com.mysema.query.sql.RelationalPathBase<QAuthoritiesPkey> {

    private static final long serialVersionUID = -1417074708;

    public static final QAuthoritiesPkey authoritiesPkey = new QAuthoritiesPkey("authorities_pkey");

    public final NumberPath<Long> authorityId = createNumber("authority_id", Long.class);

    public QAuthoritiesPkey(String variable) {
        super(QAuthoritiesPkey.class, forVariable(variable), "public", "authorities_pkey");
    }

    @SuppressWarnings("all")
    public QAuthoritiesPkey(Path<? extends QAuthoritiesPkey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "authorities_pkey");
    }

    public QAuthoritiesPkey(PathMetadata<?> metadata) {
        super(QAuthoritiesPkey.class, metadata, "public", "authorities_pkey");
    }

}

