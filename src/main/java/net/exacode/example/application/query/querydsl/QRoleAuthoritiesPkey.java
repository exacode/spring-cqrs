package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleAuthoritiesPkey is a Querydsl query type for QRoleAuthoritiesPkey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleAuthoritiesPkey extends com.mysema.query.sql.RelationalPathBase<QRoleAuthoritiesPkey> {

    private static final long serialVersionUID = -2079349098;

    public static final QRoleAuthoritiesPkey roleAuthoritiesPkey = new QRoleAuthoritiesPkey("role_authorities_pkey");

    public final NumberPath<Long> authorityId = createNumber("authority_id", Long.class);

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public QRoleAuthoritiesPkey(String variable) {
        super(QRoleAuthoritiesPkey.class, forVariable(variable), "public", "role_authorities_pkey");
    }

    @SuppressWarnings("all")
    public QRoleAuthoritiesPkey(Path<? extends QRoleAuthoritiesPkey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "role_authorities_pkey");
    }

    public QRoleAuthoritiesPkey(PathMetadata<?> metadata) {
        super(QRoleAuthoritiesPkey.class, metadata, "public", "role_authorities_pkey");
    }

}

